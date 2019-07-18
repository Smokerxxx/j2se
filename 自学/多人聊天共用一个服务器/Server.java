package 多人聊天共用一个服务器;

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
			System.out.println("服务器端已经启动，正在监听"+PORT+"端口");
			while(true) {
				Socket socket = ss.accept();
				
				System.out.println("有人连接到服务器，当前用户："+socket.toString());
				
				new Thread(new ServerRunable(socket)).start();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
