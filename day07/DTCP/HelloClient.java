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
			
			InputStream inputStream = client.getInputStream();//�ͻ��˻�ȡ������,�൱�ڷ������˵������
			BufferedReader bf=new BufferedReader(new InputStreamReader(inputStream));
			
			String line = bf.readLine();
			
			System.out.println("�ӷ������˽��ܵ�������:"+line);
			
			
			//���ιر�
			bf.close();
			client.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
