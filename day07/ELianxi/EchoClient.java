package ELianxi;

import java.net.* ;
import java.io.* ;

public class EchoClient {
	public static void main(String[] args) throws Exception {
		Socket client = null;
		client = new Socket("localhost",8888);//���ӷ�����
		BufferedReader buf=null;//���շ������˷��ͻ�������Ϣ
		PrintStream out= null;//�����,��������˷��͵���Ϣ
		BufferedReader input=null;//�ͻ�������Ķ���
		input = new BufferedReader(new InputStreamReader(System.in));//��������
		
		buf= new BufferedReader(new InputStreamReader(client.getInputStream()));//���շ��������������Ϣ
		out = new PrintStream(client.getOutputStream());//��������������Ϣ
		
		boolean flag = true;
		
		while(flag){
			System.out.print("������Ϣ:");
			String str = input.readLine();//�ͻ�������һ������
			out.println(str); // ���͵�������
			if ("bye".equals(str)) {// �ж��˳������1
				flag=false;
			}
			else {// �������bye  , ���ͻ�����������ݴ�ӡ�ڿ���̨��
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
