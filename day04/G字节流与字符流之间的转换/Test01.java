package G�ֽ������ַ���֮���ת��;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("e:\\mydoc\\����.txt");
			FileOutputStream fos = new FileOutputStream("e:\\mydoc\\����_222.txt");
			
			
			//ת������  , ��װ
			
			// ISO-8859-1  ���ʱ���    UTF-8Ҳ�ǹ��ʱ���     gbk ����+����ı���    gb2312  �����ֱ���
			new InputStreamReader(fis);
			InputStreamReader inputstreamReader = new InputStreamReader(fis, "ISO-8859-1"); // ���ֽ�����utf-8�ı����ʽ,���뵽�ڴ���
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fos, "ISO-8859-1");// ���ַ���ת�����ֽ���
			char[] c = new char[1024];
			int data=0;
			
			while((data=inputstreamReader.read(c))!=-1){
				for (int i = 0; i < c.length; i++) {
					System.out.print(c[i]);
				}
				System.out.println();
				outputStreamWriter.write(c, 0, data);
			}
			
			inputstreamReader.close();
			outputStreamWriter.close();
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
