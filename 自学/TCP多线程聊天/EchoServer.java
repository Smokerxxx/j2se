package TCP多线程聊天;

import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(5556);
		
		boolean f = true;
		while(f) {
			System.out.println("服务器已经运行");
			Socket client = server.accept();
			new Thread(new EhcoThread(client));
		}server.close();
	}
}
