package GTCP���߳�����;

import java.net.* ;
import java.io.* ;
/**
 * ʹ�ö��߳� ,�����ö���ͻ���ͬʱ���ӷ�����,����ͨ��
 * @author lgp
 *
 */
public class EchoServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket server = null;
		Socket client =null;
		PrintStream out= null;//��ӡ������,��ͻ����������
		BufferedReader buf=null;
		server = new ServerSocket(8888);
		boolean f=true;
		while(f){
			System.out.println("����������,�ȴ��ͻ�������");
			client = server.accept();
			
			// ÿһ���ͻ��˱�ʾһ���߳�  ,ÿ���̶߳����� һ����ǰ�ͻ�����ͬһ���������Ľ���
			new Thread(new EchoThread(client)).start() ;	
		}
		server.close();
	}

}
