package FLianxi2;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ECHOServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = null;
			Socket client =null;
			PrintStream outputStream= null;// ����˵������  ---> �൱�ڿͻ��˵�������
			BufferedReader buf=null;// ����˵�������
			Scanner input = new Scanner(System.in);
			
			server = new ServerSocket(8888);
			
			boolean f= true;
			
			while(f){
				System.out.println("server is running , Waiting for client connection");
				client = server.accept();
				
				outputStream=new PrintStream(client.getOutputStream());//�ͻ��˵������,���Ƿ������˷��͵�����
				
				buf=new BufferedReader(new InputStreamReader(client.getInputStream()));//�ͻ��˵�������,��ʹ�������˽��ܵ�����
				
				boolean flag  =true;
				
				while(flag){
					String str = buf.readLine();
					if (str==null || "".equals(str)) {//�жϿͻ��˽��������1
						flag=false;
					} else {
						if ("bye".equals(str)) {//�жϿͻ��˽��������2
							flag=false;
						} else {
							System.out.println("���յ��ͻ��˷�������Ϣ��:"+str);
							System.out.println("��ظ�:");
							String nextLine = input.nextLine();
							outputStream.println("�������˻ظ�:"+nextLine);//��ͻ��˻�����Ϣ
						}
					}
				}
				
				client.close();
			}
			server.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
