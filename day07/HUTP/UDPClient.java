package HUTP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
/**
 * 客户端启动后   ,等待服务器端发送信息
 * @author Administrator
 *
 */
public class UDPClient {
	public static void main(String[] args) {
		try {
			DatagramSocket ds= null;
			
			DatagramPacket dp = null;
			
			ds = new DatagramSocket(9000);// 指定当前这个udp对象的端口是9000
			
			byte[] buf = new byte[1024];
			dp = new DatagramPacket(buf, 1024);// 定义一个容器,用于接收数据
			
			ds.receive(dp); // 程序阻断,直到有数据包接受到为止
			
			String s = new String(dp.getData(),0,dp.getLength())+" from "+
			dp.getAddress().getHostAddress()+","+dp.getPort();
			
			System.out.println(s);
			
			ds.close();
		} catch (Exception e) {
			
		}
	}
}
