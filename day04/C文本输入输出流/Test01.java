package C�ı����������;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
/**
 * FileReader   ��    FileWriter   ��� StringBuffer  ��  char[ ]���� ʵ�����ֵĶ�д  
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		try {
			
			File file = new File("e:"+File.separator+"mydoc"+File.separator+"����.txt");
			
			File outfile = new File("e:"+File.separator+"mydoc"+File.separator+"����copy.txt");
			
			FileReader fr = null;
			FileWriter fw = null;
			StringBuffer sb = new StringBuffer("");
			fr = new FileReader(file);
			fw = new FileWriter(outfile);
			
			
			char[] c = new char[1024];
			int data = 0;
			//�ַ�������
			while((data=fr.read(c))!=-1){ //һ�ζ�2k����
				fw.write(c, 0, data);// ��������ԭ�ļ��ĳ���
				c=new char[1024];//��������
			}
			
			//ע��: �÷�����ȡ�ļ�ʱ, �����ܻ��ж���Ŀո� ,  ԭ��:ÿ�ζ���2k ,��ʹû�������� ,��������ݾ��ÿհ״�����
//			while(fr.read(c)!=-1){
//				sb.append(c);
//				c=new char[1024];
//			}
//			fw.write(sb.toString());
			
			fr.close();
			fw.close();
			System.out.println("д�����");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
