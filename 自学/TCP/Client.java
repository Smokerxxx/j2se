package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		try {
			Socket client = new Socket("127.0.0.1",5645);
			
			InputStream inputStream = client.getInputStream();
			BufferedReader bf = new BufferedReader(new InputStreamReader(inputStream));
			
			String str = bf.readLine();
			System.out.println("从服务器端接收的信息是:"+str);
			
			bf.close();
			client.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
