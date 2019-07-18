package GTCP多线程聊天;

import java.net.* ;
import java.io.* ;

public class EchoClient {
	public static void main(String[] args) throws Exception {
		Socket client = null;
		client = new Socket("127.0.0.1",8888);
		BufferedReader buf=null;//接收服务器端发送回来的信息
		PrintStream out= null;//输出流,先服务器端发送的信息
		BufferedReader input=null;
		input = new BufferedReader(new InputStreamReader(System.in));//键盘输入
		
		buf= new BufferedReader(new InputStreamReader(client.getInputStream()));//接收服务器端输入的信息
		out = new PrintStream(client.getOutputStream());//向服务器端输出信息
		
		boolean flag = true;
		
		while(flag){
			System.out.print("输入信息:");
			String str = input.readLine();
			out.println(str);
			if ("bye".equals(str)) {
				flag=false;
			} else {
				String echo = buf.readLine();
				System.out.println(echo) ;
			}
			
		}
		buf.close();
		client.close();
		
	}
}
