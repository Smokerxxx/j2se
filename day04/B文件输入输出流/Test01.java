package B�ļ����������;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * FileInputStream �� Fileoutputstream
 * ���String ��bytes[] ����   ,���Զ�д�������ļ������� 
 * 
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		try {
			File file = new File("e:"+File.separator+"mydoc"+File.separator+"test.txt");
			
			
			// ������  ��ʾ  ���뵽�ڴ��е�����

			FileInputStream fis = new FileInputStream(file);
//			FileInputStream fis2 = new FileInputStream("e:\\mydoc\\haha.txt"); ���صĶ�̬
			
			System.out.println(fis.available());//��ȡ�ļ����ֽ�����
			
			//��ʾ�ڿ���̨��(��������byte����,������Ĵ��������)
			byte[] neirong = new byte[fis.available()];
			
			for (int i = 0; i < neirong.length; i++) {
				neirong[i]=(byte)fis.read();
			}
			
			String string = new String(neirong);
			System.out.println(string);
				
			
			
			//һ��һ���ֽ�һ���ֽڵĶ�, ȡ�����Ļ���?����
//			int data=0;
//			while((data=fis.read())!=-1) {
//				System.out.println((char)data+"");
//			}
			
			
			
			//-----------------------------------------
			// �����  ��ʾ  ���ڴ��������ȥ������  
			File outfile = new File("e:\\mydoc\\copytest.txt");
//			FileOutputStream fos = new FileOutputStream("");
//			FileOutputStream fos = new FileOutputStream(outfile);// ������
			FileOutputStream fos = new FileOutputStream(outfile,true);//��2��������ʾҪ��������׷�ӵ��ļ���
			
			//�ж��ļ��Ƿ����
			if (!outfile.exists()) {
				outfile.createNewFile();
			}
			
			string="\r\n�����ҵ�����Ҫ��׷�ӵ�����\r\n"+string;
			
			byte[] bytes_out = string.getBytes();
//			fos.write(bytes_out);//���ֽ�����ȫ��׷�ӵ����ļ���
//			fos.write(bytes_out,0,50); //׷��һ��������
			fos.write(bytes_out,0,bytes_out.length);//���ֽ�����ȫ��׷�ӵ����ļ���
			
//			fos.flush();// ��ջ����е�����,д���ļ���
			fos.close();//  close����ʵ���Ѿ�������flush����  ,����дclose����
			System.out.println(" writer success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
