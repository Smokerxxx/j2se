package HUTP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = null;
			
			DatagramPacket dp = null;
		
		

			ds= new DatagramSocket(8999);// ָ���������˿ں�8999
			String str = "hello world";
			dp = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("localhost"),9000);
			
			ds.send(dp);//������������Ϣ
			
			ds.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
