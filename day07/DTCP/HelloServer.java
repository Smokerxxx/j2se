package DTCP;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP的服务器端  
 * 等待客户端的链接 , 返回hello world
 * @author Administrator
 *
 */
public class HelloServer {

	public static void main(String[] args) {
		try {
		ServerSocket server = null;
		Socket client = null;
		PrintStream out = null; //向客户端输出内容的流
		

			server = new ServerSocket(8888);//1024~65535之间  
			System.out.println("服务端已经启动 ,等待客户端的链接");
			client = server.accept();// 程序到这里会被阻断 , 类似于  int x = input.nextInt();
			//服务器接受一个对象  ,并将该对象指定为Socket类型 
			
			String s = " hello world   123   abc   ABC   天天向上 ";
			
			OutputStream outputStream = client.getOutputStream();//客户端的输出流,即服务器端的输入流
			
			out = new PrintStream(outputStream);
			
			out.print(s);
			
			
			//依次关闭
			out.close();
			client.close();
			server.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
