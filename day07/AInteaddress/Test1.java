package AInteaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress loc;
		try {
			loc = InetAddress.getLocalHost();
			System.out.println(loc.getHostAddress()+"  "+loc.getHostName());
			
			//获取百度的ip地址
			
			InetAddress baidu = InetAddress.getByName("www.taobao.com");
			System.out.println(baidu.getHostAddress()+"  "+baidu.getHostName());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
