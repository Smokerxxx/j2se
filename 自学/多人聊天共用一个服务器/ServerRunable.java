package �������칲��һ��������;

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
		write2Console("��ӭ����������");
		login();
		System.out.println(currentUserNickName+",�û���¼�ɹ�.");
		
		write2Console(currentUserNickName+",���ѵ�¼.\n");
		write2Console("����[list users]���Բ鿴��ǰ��¼�û����б�.\n");
		write2Console("����[to all ��Ϣ����]���Է���Ⱥ����Ϣ.\n");
		write2Console("����[to �û��ǳ�  ��Ϣ����]���Ը�ָ���û�������Ϣ.\n");
		write2Console("����[exit]�����˳�������.\n");
		
		
			String input = dis.readUTF();
			while(!Server.EXIT.equals(input)){
				System.out.println(currentUserNickName+",������"+input);
				if (input.startsWith("to ")) {
					sendMessage(input);
				} else if("list users".equals(input)) {
					showOnlineUsers();
				}else{
					System.out.println("���������Ϸ� ,����������!");
				}
				input = dis.readUTF();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//���û��˳�������ʱ,��map���Ƴ�һ�����ǳƵ��û�
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
	
	
	//���ѿͻ���ע��
	private void login() throws Exception {
		write2Console("������һ���ǳ�");
		while(true){
			String nickName = dis.readUTF();
			System.out.println("�û�������ǳ���:"+nickName);
			synchronized (this) {
				if (!Server.nickNameSocketMap.containsKey(nickName)) {
					this.currentUserNickName=nickName;
					Server.nickNameSocketMap.put(nickName, socket);//���ǳƺ�socket�ͻ��˰�,��ӵ�map��
					break;//������ǰѭ��
				} else {
					write2Console("��ǰ�ǳ��Ѿ�����,����������!");
				}
			}
		}
	}
	
	//��ͻ��˴�ӡ����
	private void write2Console(String message) throws Exception {
		SocketUtils.writeToDataOutputStream(dos, message);
	}
	
	//������Ϣ������������ͻ��˷���������Ϣ���ٷ��ص��ͻ���,
	//������ȫ���˺͸���
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
	
	//ȫ���û�����Ϣ
	private void broadCast(String message) throws Exception {
		for(Map.Entry<String, Socket> entry : Server.nickNameSocketMap.entrySet()) {
			if(!currentUserNickName.equals(entry.getKey())) {
				SocketUtils.writeToSocket(entry.getValue(), formatMessage("������",message));
			}
		}
	}
	
	//��ĳ���˷���Ϣ
	private void sendIndividualMesssage(String receiver, String message) throws Exception {
		Socket receiverSocket = Server.nickNameSocketMap.get(receiver);
		if(null!=receiverSocket) {
			SocketUtils.writeToSocket(receiverSocket, formatMessage(receiver, message));
		}else{
			write2Console("��Ҫ����������û�["+receiver+"]������,�����Ѿ�������.");
		}
	}
	//��ʽ����Ϣ���������Ļ��
	private String formatMessage(String receiver, String message) {
		StringBuffer buffer = new StringBuffer("");
		buffer.append(currentUserNickName).append("��").append(receiver).append("˵��\n").append(message);
		buffer.append("\t����ʱ��:").append(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
		return buffer.toString();
		
	}
	
	//��ʾ���������û�
	private void showOnlineUsers() {
		StringBuffer buffer = new StringBuffer("��ǰ�����û��У�\n");
		for(String key : Server.nickNameSocketMap.keySet()) {
			buffer.append("[").append(key).append("]\n");
		}
	}
}
