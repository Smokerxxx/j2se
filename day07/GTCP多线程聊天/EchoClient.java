package GTCP���߳�����;

import java.net.* ;
import java.io.* ;

public class EchoClient {
	public static void main(String[] args) throws Exception {
		Socket client = null;
		client = new Socket("127.0.0.1",8888);
		BufferedReader buf=null;//���շ������˷��ͻ�������Ϣ
		PrintStream out= null;//�����,�ȷ������˷��͵���Ϣ
		BufferedReader input=null;
		input = new BufferedReader(new InputStreamReader(System.in));//��������
		
		buf= new BufferedReader(new InputStreamReader(client.getInputStream()));//���շ��������������Ϣ
		out = new PrintStream(client.getOutputStream());//��������������Ϣ
		
		boolean flag = true;
		
		while(flag){
			System.out.print("������Ϣ:");
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
