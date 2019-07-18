package com.neuedu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * �����ҵĿͻ���
 * @author Administrator
 *
 */
public class ChatClient {

	private static Scanner scanner = new Scanner(System.in);
	
	private static void writer2Console(DataOutputStream dos,String message) throws Exception{
		dos.writeUTF(message);// ��message��utf-8�ı����ʽд�뵽ĳ��
		dos.flush();//��ջ�����
	}
	
	public static void main(String[] args) {
		try(Socket socket = new Socket("127.0.0.1",8888);	
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			) {
			ClientMessageReceiver messageReceiver = new ClientMessageReceiver(dis);
			new Thread(messageReceiver).start();
			
			String input  = null;
			
			do {
				input = scanner.nextLine();
				writer2Console(dos,input);
			} while (!ChatServer.EXIT.equals(input));
			
			messageReceiver.stop();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
