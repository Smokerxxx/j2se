package TCP���߳�����;

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
		
		BufferedReader buf=null;//���շ������˷��ͻ�������Ϣ
		PrintStream printStream= null;//�����,�ȷ������˷��͵���Ϣ
		BufferedReader input=null;
		input = new BufferedReader(new InputStreamReader(System.in));//��������
		buf= new BufferedReader(new InputStreamReader(client.getInputStream()));//���շ��������������Ϣ
		printStream = new PrintStream(client.getOutputStream());//��������������Ϣ
		
		boolean flag = true ; 
		while(true) {
			System.out.println("������������������������");
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
