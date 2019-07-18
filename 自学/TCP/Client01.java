package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client01 {
	public static void main(String[] args) throws Exception {
		Socket client = new Socket("127.0.0.1",4546);
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		PrintStream ps = new PrintStream(client.getOutputStream());
		
		
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = true;
		while(flag) {
			System.out.println("请输入信息：");
			String str = buf.readLine();
			ps.println(str);
			if ("bye".equals(str)) {// 判断退出的情况1
				flag=false;
			}
			else {// 如果不是bye  , 将客户端输入的内容打印在控制台上
				String echo = buf.readLine();
				System.out.println(">>"+echo) ;
			}
		}
		
		
	}
}
