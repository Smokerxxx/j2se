package DTCP;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class HelloClient {
	public static void main(String[] args) {
		try {
			Socket client = null;
			
//			client = new Socket("10.25.38.12",8888);
			client = new Socket("localhost",8888);
//			client = new Socket("127.0.0.1",8888);
			
			InputStream inputStream = client.getInputStream();//客户端获取输入流,相当于服务器端的输出流
			BufferedReader bf=new BufferedReader(new InputStreamReader(inputStream));
			
			String line = bf.readLine();
			
			System.out.println("从服务器端接受的内容是:"+line);
			
			
			//依次关闭
			bf.close();
			client.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
