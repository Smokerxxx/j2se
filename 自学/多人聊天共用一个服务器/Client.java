package �������칲��һ��������;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private static Scanner scanner = new Scanner(System.in);
	
	private static void writer2Console(DataOutputStream dos,String message) throws Exception{
		dos.writeUTF(message);// ��message��utf-8�ı����ʽд�뵽ĳ��
		dos.flush();//��ջ�����
	}
	public static void main(String[] args) {
		try(Socket socket = new Socket("127.0.0.1", 5555);
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream())){
			
			MessageReceiver messageReceiver = new MessageReceiver(dis);
			new Thread(messageReceiver).start();
			
			String input = null;
			do {
				input = scanner.nextLine();
				writer2Console(dos, input);
				
			}while(!Server.EXIT.equals(input)); 
			
				messageReceiver.stop();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
