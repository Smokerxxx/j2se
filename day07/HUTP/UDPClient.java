package HUTP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
/**
 * �ͻ���������   ,�ȴ��������˷�����Ϣ
 * @author Administrator
 *
 */
public class UDPClient {
	public static void main(String[] args) {
		try {
			DatagramSocket ds= null;
			
			DatagramPacket dp = null;
			
			ds = new DatagramSocket(9000);// ָ����ǰ���udp����Ķ˿���9000
			
			byte[] buf = new byte[1024];
			dp = new DatagramPacket(buf, 1024);// ����һ������,���ڽ�������
			
			ds.receive(dp); // �������,ֱ�������ݰ����ܵ�Ϊֹ
			
			String s = new String(dp.getData(),0,dp.getLength())+" from "+
			dp.getAddress().getHostAddress()+","+dp.getPort();
			
			System.out.println(s);
			
			ds.close();
		} catch (Exception e) {
			
		}
	}
}
