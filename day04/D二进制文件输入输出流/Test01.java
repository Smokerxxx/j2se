package D�������ļ����������;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * DataInputStream   �� DataOutputStream   ���Զ�д ��ͼƬ ,��Ƶ,��Ƶ���ļ� 
 * 
 * Ӧ�ó��� , �����ݿ��ĳ���ֶ��ж�ȡ��Ϣ  ���ߴ�ĳ���ļ����¶�ȡͼƬ��,��Ƶ����Ϣ
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("e:\\mydoc\\erweima.png");
			DataInputStream dis = new DataInputStream(fis);// ����������Ҫһ����������Ϊ����
			
			FileOutputStream fos = new FileOutputStream("e:\\mydoc\\erweima_new.png");
			DataOutputStream dos = new DataOutputStream(fos);
			
			int data=0;
			byte[] bytes = new byte[1024*1024];//��һ��1m�������ֽ����� , һ�ζ�д1m����
			
			while ((data=dis.read(bytes))!=-1) {
				//��ӡ��ǰͼƬ�Ķ�������Ϣ
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
