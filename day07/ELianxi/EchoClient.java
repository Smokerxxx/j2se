package ELianxi;

import java.net.* ;
import java.io.* ;

public class EchoClient {
	public static void main(String[] args) throws Exception {
		Socket client = null;
		client = new Socket("localhost",8888);//连接服务器
		BufferedReader buf=null;//接收服务器端发送回来的信息
		PrintStream out= null;//输出流,向服务器端发送的信息
		BufferedReader input=null;//客户端输入的对象
		input = new BufferedReader(new InputStreamReader(System.in));//键盘输入
		
		buf= new BufferedReader(new InputStreamReader(client.getInputStream()));//接收服务器端输入的信息
		out = new PrintStream(client.getOutputStream());//向服务器端输出信息
		
		boolean flag = true;
		
		while(flag){
			System.out.print("输入信息:");
			String str = input.readLine();//客户端输入一行内容
			out.println(str); // 发送到服务器
			if ("bye".equals(str)) {// 判断退出的情况1
				flag=false;
			}
			else {// 如果不是bye  , 将客户端输入的内容打印在控制台上
				String echo = buf.readLine();
				System.out.println(">>"+echo) ;
			}
			buf.close();
			client.close();
		}
		buf.close();
		client.close();
		
	}
}
