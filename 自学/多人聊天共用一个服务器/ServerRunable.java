package 多人聊天共用一个服务器;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;



public class ServerRunable implements Runnable {
	private String currentUserNickName;
	private DataInputStream dis;
	private DataOutputStream dos;
	private Socket socket;
	
	

	public ServerRunable(Socket socket) throws Exception {
		super();
		this.socket = socket;
		this.dis = new DataInputStream(socket.getInputStream());
		this.dos = new DataOutputStream(socket.getOutputStream());
	}



	@Override
	public void run() {
		try {
		// TODO Auto-generated method stub
		write2Console("欢迎来到聊天室");
		login();
		System.out.println(currentUserNickName+",用户登录成功.");
		
		write2Console(currentUserNickName+",您已登录.\n");
		write2Console("输入[list users]可以查看当前登录用户的列表.\n");
		write2Console("输入[to all 消息内容]可以发送群聊消息.\n");
		write2Console("输入[to 用户昵称  消息内容]可以给指定用户发送消息.\n");
		write2Console("输入[exit]可以退出聊天室.\n");
		
		
			String input = dis.readUTF();
			while(!Server.EXIT.equals(input)){
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//当用户退出聊天室时,从map中移除一个该昵称的用户
			Server.nickNameSocketMap.remove(currentUserNickName);
			try {
				dis.close();
				dos.close();
				socket.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}
	
	
	//提醒客户端注册
	private void login() throws Exception {
		write2Console("请输入一个昵称");
		while(true){
			String nickName = dis.readUTF();
			System.out.println("用户输入的昵称是:"+nickName);
			synchronized (this) {
				if (!Server.nickNameSocketMap.containsKey(nickName)) {
					this.currentUserNickName=nickName;
					Server.nickNameSocketMap.put(nickName, socket);//将昵称和socket客户端绑定,添加到map中
					break;//跳出当前循环
				} else {
					write2Console("当前昵称已经存在,请重新输入!");
				}
			}
		}
	}
	
	//向客户端打印内容
	private void write2Console(String message) throws Exception {
		SocketUtils.writeToDataOutputStream(dos, message);
	}
	
	//发送消息，服务器处理客户端发过来得消息，再返回到客户端,
	//其中有全部人和个人
	private void sendMessage(String input) throws Exception {
		int receiverEndIndex = input.indexOf("",3);
		String receiver = input.substring(3, receiverEndIndex);
		String message = input.substring(receiverEndIndex+1);
		if("all".equals(receiver)) {
			broadCast(message);
		}else {
			sendIndividualMesssage(receiver,message);
		}
	}
	
	//全部用户发消息
	private void broadCast(String message) throws Exception {
		for(Map.Entry<String, Socket> entry : Server.nickNameSocketMap.entrySet()) {
			if(!currentUserNickName.equals(entry.getKey())) {
				SocketUtils.writeToSocket(entry.getValue(), formatMessage("所有人",message));
			}
		}
	}
	
	//向某个人发消息
	private void sendIndividualMesssage(String receiver, String message) throws Exception {
		Socket receiverSocket = Server.nickNameSocketMap.get(receiver);
		if(null!=receiverSocket) {
			SocketUtils.writeToSocket(receiverSocket, formatMessage(receiver, message));
		}else{
			write2Console("你要单独聊天的用户["+receiver+"]不存在,或者已经下线了.");
		}
	}
	//格式化消息，输出在屏幕上
	private String formatMessage(String receiver, String message) {
		StringBuffer buffer = new StringBuffer("");
		buffer.append(currentUserNickName).append("对").append(receiver).append("说：\n").append(message);
		buffer.append("\t发送时间:").append(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
		return buffer.toString();
		
	}
	
	//显示所有在线用户
	private void showOnlineUsers() {
		StringBuffer buffer = new StringBuffer("当前在线用户有：\n");
		for(String key : Server.nickNameSocketMap.keySet()) {
			buffer.append("[").append(key).append("]\n");
		}
	}
}
