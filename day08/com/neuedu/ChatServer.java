package com.neuedu;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * �����ҷ�����
 * @author Administrator
 *
 */
public class ChatServer {

	public static final String EXIT = "exit";
	
	public static final int PORT=8888;
	
	static Map<String ,Socket> nickNameSocketMap = new HashMap<>();
	
	public static void main(String[] args) {
		//try����������ʵ����closeAble�ӿڵ��඼����д������ ,
		// ����İ���   , ������ , socket���� ,
		// ����д������� ,ִ����Ϻ� ,���Զ��ر�try�������Ķ���,�Զ�����close����
		try(ServerSocket ss = new ServerSocket(PORT);) {
			System.out.println("�����ҷ������Ѿ����� , ���ڼ���"+PORT+"�˿�");
			while(true){
				Socket socket = ss.accept();//��ϳ������� ,ֱ����һ���ͻ������ӵ��������˺� ,����Ż�������
				
				System.out.println("�����û����ӵ�������,��ǰ�û�����Ϣ"+socket.toString());
				
				new Thread(new ChatServerRunnable(socket)).start();//��һ���ͻ�����ӵ�һ���߳��� ,������start()�����߳�
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
