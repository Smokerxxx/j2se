package TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(5645);
			System.out.println("服务端已经启动，等待客户端连接");
			Socket client = server.accept();
			
			String str = "我要好好学习tcp";
			OutputStream outputstream =  client.getOutputStream();
			PrintStream ps = new PrintStream(outputstream);
			ps.println(str);
			
			ps.close();
			client.close();
			server.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
