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
		this.dis = new DataInputStream(socket.getInputStream());//�ͻ��˵�������--->�������˵������
		this.dos = new DataOutputStream(socket.getOutputStream());//�ͻ��˵������--->�������˵�������
		
		//������:   ���뵽�ڴ��е����� 
		//�����:   ���ڴ��������ȥ , ������������
	}
	
	




	@Override
	public void run() {
		try {
			write2Console("��ӭ����������");
			
			login();
			
			System.out.println(currentUserNickName+",�û���¼�ɹ�.");
	
			//��ͻ���д����
			write2Console(currentUserNickName+",���ѵ�¼.\n");
			write2Console("����[list users]���Բ鿴��ǰ��¼�û����б�.\n");
			write2Console("����[to all ��Ϣ����]���Է���Ⱥ����Ϣ.\n");
			write2Console("����[to �û��ǳ�  ��Ϣ����]���Ը�ָ���û�������Ϣ.\n");
			write2Console("����[exit]�����˳�������.\n");
			
			//�ͻ�������,�Զ�ת��Ϊutf-8��������
			String input = dis.readUTF();
			
			//����������ݲ���exit  ,����ѭ��
			while(!ChatServer.EXIT.equals(input)){
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
			e.printStackTrace();
		}finally{
			//���û��˳�������ʱ,��map���Ƴ�һ�����ǳƵ��û�
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
	 * ���ڵ�¼��֤ , �����ظ����ǳ� ,д��map��
	 * @throws Exception
	 */
	private void login() throws Exception{
		write2Console("������һ���ǳ�");
		while(true){
			String nickName = dis.readUTF();
			System.out.println("�û�������ǳ���:"+nickName);
			
			synchronized (this) {
				if (!ChatServer.nickNameSocketMap.containsKey(nickName)) {
					this.currentUserNickName=nickName;
					ChatServer.nickNameSocketMap.put(nickName, socket);//���ǳƺ�socket�ͻ��˰�,��ӵ�map��
					break;//������ǰѭ��
				} else {
					write2Console("��ǰ�ǳ��Ѿ�����,����������!");
				}
			}
		}

	}
	
	/**
	 * ������Ϣ(����Ҫ��ϸ�� ,�Ƿ���Ⱥ�Ļ���˽��)
	 * to all  ****
	 * to ����   *****
	 * @param input
	 * @throws Exception
	 */
	private void sendMessage(String input) throws Exception{
		int receiverEndIndex = input.indexOf(" ",3);
		String receiver  = input.substring(3, receiverEndIndex);
		String message = input.substring(receiverEndIndex+1);
		if ("all".equals(receiver)) {
			broadcast(message);//Ⱥ��
		} else {
			sendIndividualMessage(receiver, message);//˽��
		}
	}
	
	/**
	 * ��ȫ���û�������Ϣ
	 * @param message
	 * @throws Exception
	 */
	private void broadcast(String message) throws Exception{
		//ѭ��map ,��ÿһ��map�еĶ�������Ϣ
		
		for (Map.Entry<String , Socket> entry : ChatServer.nickNameSocketMap.entrySet()) {
			
			if (!currentUserNickName.equals(entry.getKey())) {//����Ҫ���Լ�������Ϣ
				SocketUtils.writeToSocket(entry.getValue(), formatMessage("������",message));
			}
		}
	}
	
	/**
	 * �򵥶�ĳ���û�������Ϣ
	 * @param receiver  ��Ϣ�Ľ�����
	 * @param message   ��Ϣ����
	 * @throws Exception
	 */
	private void sendIndividualMessage(String receiver, String message) throws Exception{
		Socket receiverSocket = ChatServer.nickNameSocketMap.get(receiver);
		
		if (null!=receiverSocket) {
			SocketUtils.writeToSocket(receiverSocket, formatMessage(receiver, message));
		}else{
			write2Console("��Ҫ����������û�["+receiver+"]������,�����Ѿ�������.");
		}
	}
	
	/**
	 * ��ʽ����Ϣ���� , ����   �û�  ��  �û�    ����   ,ʱ��  
	 * @param receiver
	 * @param message
	 * @throws Exception
	 */
	private String formatMessage(String receiver, String message) throws Exception{
		StringBuffer messagebuffer = new StringBuffer("");
		messagebuffer.append(currentUserNickName).append("��").append(receiver).append("˵:\n");
		messagebuffer.append(message).append("\n����ʱ��:");
		messagebuffer.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		
		
		return messagebuffer.toString();
	}
	
	/**
	 * ��ʾ���������û�
	 * @throws Exception
	 */
	private void showOnlineUsers() throws Exception{
		StringBuffer sb = new StringBuffer("��ǰ�����û���:\n");
		
		for(String key : ChatServer.nickNameSocketMap.keySet()){
			sb.append("[").append(key).append("]\n");
		}
		
		write2Console(sb.toString());
	}
	
	/**
	 * ��ͻ���д����
	 * @param message
	 * @throws Exception
	 */
	private void write2Console(String message) throws Exception{
		SocketUtils.writeToDataOutputStream(dos, message);
	}
}
