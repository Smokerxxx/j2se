package DTCP;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP�ķ�������  
 * �ȴ��ͻ��˵����� , ����hello world
 * @author Administrator
 *
 */
public class HelloServer {

	public static void main(String[] args) {
		try {
		ServerSocket server = null;
		Socket client = null;
		PrintStream out = null; //��ͻ���������ݵ���
		

			server = new ServerSocket(8888);//1024~65535֮��  
			System.out.println("������Ѿ����� ,�ȴ��ͻ��˵�����");
			client = server.accept();// ��������ᱻ��� , ������  int x = input.nextInt();
			//����������һ������  ,�����ö���ָ��ΪSocket���� 
			
			String s = " hello world   123   abc   ABC   �������� ";
			
			OutputStream outputStream = client.getOutputStream();//�ͻ��˵������,���������˵�������
			
			out = new PrintStream(outputStream);
			
			out.print(s);
			
			
			//���ιر�
			out.close();
			client.close();
			server.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
