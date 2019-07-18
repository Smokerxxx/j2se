package FLianxi2;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ECHOClient {

	public static void main(String[] args) {
		try {
			Socket client = null;
			
			client = new Socket("10.25.38.12",8888);
			
			Scanner input = new Scanner(System.in);
			
			BufferedReader buf= new BufferedReader(new InputStreamReader(client.getInputStream()));//客户端的输入流--->相当于服务器端的输出流
			
			PrintStream out = new PrintStream(client.getOutputStream());//客户端的输出流
			
			boolean flag = true;
			
			while(flag){
				System.out.println("输入内容:");
				String nextLine = input.nextLine();
				out.println(nextLine);	
				
				if ("over".equals(nextLine)) {
					flag = false;
				}else {
					String echo = buf.readLine();
					System.out.println(">>"+echo);
				}
			}
			
			
			buf.close();
			out.close();
			client.close();
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
