package ELianxi;

import java.net.* ;
import java.io.* ;
/**
 * ˵��:
 * �ӿͻ���������Ϣ   ���������᷵����Ϣ����:
 * 
 * ������Ϣ:uuu
	Echo:uuu
	������Ϣ:ì
	Echo:ì
	������Ϣ:
 * @author lgp
 *
 */
public class EchoServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket server = null;//�������˵���
		Socket client =null;//�ͻ���
		PrintStream outputStream= null;//��ӡ������,��ͻ����������
		BufferedReader buf=null;//������
		server = new ServerSocket(8888);//�˿�
		boolean f=true;
		while(f){
			System.out.println("����������,�ȴ��ͻ�������");
			client = server.accept();//����һ���ͻ���
			outputStream=new PrintStream(client.getOutputStream());//��ȡ�ͻ��˵������
			buf= new BufferedReader(new InputStreamReader(client.getInputStream()));//��ȡ�ͻ��˵�������Ϣ
			
			boolean flag = true;
			
			while(flag){
				String str = buf.readLine();//�ӿͻ��˵��������ж�ȡһ������
				if (str==null || "".equals(str)) {//�жϿͻ��˽��������1
					flag=false;
				} else {
					if ("bye".equals(str)) {//�жϿͻ��˽��������2
						flag=false;
					} else {
						System.out.println("���յ��ͻ��˷�������Ϣ��:"+str);
						outputStream.println("�յ�:"+str);//��ͻ��˻�����Ϣ
					}
				}
			}
			
			client.close();
		}
		server.close();
	}

}

