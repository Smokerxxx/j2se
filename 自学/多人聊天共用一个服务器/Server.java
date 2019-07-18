package �������칲��һ��������;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {
	public static final int PORT = 5555;
	public static final String EXIT = "exit";
	
	static Map<String, Socket> nickNameSocketMap = new HashMap<>();
	
	public static void main(String[] args) {
		try(ServerSocket ss = new ServerSocket(PORT);) {
			System.out.println("���������Ѿ����������ڼ���"+PORT+"�˿�");
			while(true) {
				Socket socket = ss.accept();
				
				System.out.println("�������ӵ�����������ǰ�û���"+socket.toString());
				
				new Thread(new ServerRunable(socket)).start();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
