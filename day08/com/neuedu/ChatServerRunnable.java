package com.neuedu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class ChatServerRunnable implements Runnable {
	private Socket socket;
	
	private DataInputStream dis;
	
	private DataOutputStream dos;
	
	private String currentUserNickName;
	
	

	
	public ChatServerRunnable(Socket socket) throws Exception {
		super();
		this.socket = socket;
		this.dis = new DataInputStream(socket.getInputStream());//客户端的输入流--->服务器端的输出流
		this.dos = new DataOutputStream(socket.getOutputStream());//客户端的输出流--->服务器端的输入流
		
		//输入流:   输入到内存中的数据 
		//输出流:   从内存中输出出去 , 输出到哪里待定
	}
	
	




	@Override
	public void run() {
		try {
			write2Console("欢迎来到聊天室");
			
			login();
			
			System.out.println(currentUserNickName+",用户登录成功.");
	
			//向客户端写内容
			write2Console(currentUserNickName+",您已登录.\n");
			write2Console("输入[list users]可以查看当前登录用户的列表.\n");
			write2Console("输入[to all 消息内容]可以发送群聊消息.\n");
			write2Console("输入[to 用户昵称  消息内容]可以给指定用户发送消息.\n");
			write2Console("输入[exit]可以退出聊天室.\n");
			
			//客户端输入,自动转换为utf-8编码内容
			String input = dis.readUTF();
			
			//如果输入内容不是exit  ,进入循环
			while(!ChatServer.EXIT.equals(input)){
				System.out.println(currentUserNickName+",输入了"+input);
				
				if (input.startsWith("to ")) {
					sendMessage(input);
				} else if("list users".equals(input)) {
					showOnlineUsers();
				}else{
					System.out.println("输入的命令不合法 ,请重新输入!");
				}
				input = dis.readUTF();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//当用户退出聊天室时,从map中移除一个该昵称的用户
			ChatServer.nickNameSocketMap.remove(currentUserNickName);
			try {
				dis.close();
				dos.close();
				socket.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
		
		

	}
	
	
	/**
	 * 用于登录验证 , 将不重复的昵称 ,写到map中
	 * @throws Exception
	 */
	private void login() throws Exception{
		write2Console("请输入一个昵称");
		while(true){
			String nickName = dis.readUTF();
			System.out.println("用户输入的昵称是:"+nickName);
			
			synchronized (this) {
				if (!ChatServer.nickNameSocketMap.containsKey(nickName)) {
					this.currentUserNickName=nickName;
					ChatServer.nickNameSocketMap.put(nickName, socket);//将昵称和socket客户端绑定,添加到map中
					break;//跳出当前循环
				} else {
					write2Console("当前昵称已经存在,请重新输入!");
				}
			}
		}

	}
	
	/**
	 * 发送消息(还需要再细分 ,是发送群聊还是私聊)
	 * to all  ****
	 * to 张三   *****
	 * @param input
	 * @throws Exception
	 */
	private void sendMessage(String input) throws Exception{
		int receiverEndIndex = input.indexOf(" ",3);
		String receiver  = input.substring(3, receiverEndIndex);
		String message = input.substring(receiverEndIndex+1);
		if ("all".equals(receiver)) {
			broadcast(message);//群聊
		} else {
			sendIndividualMessage(receiver, message);//私聊
		}
	}
	
	/**
	 * 向全部用户发送消息
	 * @param message
	 * @throws Exception
	 */
	private void broadcast(String message) throws Exception{
		//循环map ,向每一个map中的对象发送消息
		
		for (Map.Entry<String , Socket> entry : ChatServer.nickNameSocketMap.entrySet()) {
			
			if (!currentUserNickName.equals(entry.getKey())) {//不需要给自己发送消息
				SocketUtils.writeToSocket(entry.getValue(), formatMessage("所有人",message));
			}
		}
	}
	
	/**
	 * 向单独某个用户发送消息
	 * @param receiver  消息的接受者
	 * @param message   消息内容
	 * @throws Exception
	 */
	private void sendIndividualMessage(String receiver, String message) throws Exception{
		Socket receiverSocket = ChatServer.nickNameSocketMap.get(receiver);
		
		if (null!=receiverSocket) {
			SocketUtils.writeToSocket(receiverSocket, formatMessage(receiver, message));
		}else{
			write2Console("你要单独聊天的用户["+receiver+"]不存在,或者已经下线了.");
		}
	}
	
	/**
	 * 格式化消息内容 , 附带   用户  对  用户    内容   ,时间  
	 * @param receiver
	 * @param message
	 * @throws Exception
	 */
	private String formatMessage(String receiver, String message) throws Exception{
		StringBuffer messagebuffer = new StringBuffer("");
		messagebuffer.append(currentUserNickName).append("对").append(receiver).append("说:\n");
		messagebuffer.append(message).append("\n发送时间:");
		messagebuffer.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		
		
		return messagebuffer.toString();
	}
	
	/**
	 * 显示所有在线用户
	 * @throws Exception
	 */
	private void showOnlineUsers() throws Exception{
		StringBuffer sb = new StringBuffer("当前在线用户有:\n");
		
		for(String key : ChatServer.nickNameSocketMap.keySet()){
			sb.append("[").append(key).append("]\n");
		}
		
		write2Console(sb.toString());
	}
	
	/**
	 * 向客户端写内容
	 * @param message
	 * @throws Exception
	 */
	private void write2Console(String message) throws Exception{
		SocketUtils.writeToDataOutputStream(dos, message);
	}
}
