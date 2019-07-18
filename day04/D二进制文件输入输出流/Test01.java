package D二进制文件输入输出流;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * DataInputStream   和 DataOutputStream   可以读写 如图片 ,音频,视频等文件 
 * 
 * 应用场合 , 从数据库的某个字段中读取信息  或者从某个文件夹下读取图片类,视频类信息
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("e:\\mydoc\\erweima.png");
			DataInputStream dis = new DataInputStream(fis);// 二进制流需要一个基本流作为参数
			
			FileOutputStream fos = new FileOutputStream("e:\\mydoc\\erweima_new.png");
			DataOutputStream dos = new DataOutputStream(fos);
			
			int data=0;
			byte[] bytes = new byte[1024*1024];//做一个1m容量的字节数组 , 一次读写1m内容
			
			while ((data=dis.read(bytes))!=-1) {
				//打印当前图片的二进制信息
				for (int i = 0; i < bytes.length; i++) {
					System.out.print(bytes[i]);
				}
				dos.write(bytes,0,data);
			}
			
			
		
			dis.close();
			dos.close();
			fis.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
