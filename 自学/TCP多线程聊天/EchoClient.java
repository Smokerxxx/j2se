package TCP多线程聊天;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

import TCP.Client;

public class EchoClient {
	public static void main(String[] args) throws Exception {
		Socket client = new Socket("127.0.0.1",5556);
//		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//		BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
//		PrintStream printStream = new PrintStream(client.getOutputStream());
		
		BufferedReader buf=null;//接收服务器端发送回来的信息
		PrintStream printStream= null;//输出流,先服务器端发送的信息
		BufferedReader input=null;
		input = new BufferedReader(new InputStreamReader(System.in));//键盘输入
		buf= new BufferedReader(new InputStreamReader(client.getInputStream()));//接收服务器端输入的信息
		printStream = new PrintStream(client.getOutputStream());//向服务器端输出信息
		
		boolean flag = true ; 
		while(true) {
			System.out.println("输入你想向服务器传输得数据");
			String str = input.readLine();
			printStream.println(str);
			
			if("bye".equals(str)) {
				flag = false;
			}else {
				String S = buf.readLine();
				System.out.println(S);
			}
		}
	}
}
