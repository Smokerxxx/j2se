package Afile�ļ���;

import java.io.File;
/**
 * File��   �� ���ļ�����Ĳ���   , ���ܲ����ļ����������  , ����������� ,��Ҫ���java io���ж�ȡ д��ȵ�
 * 
 * File��  ��������ʾ�ļ�  ,Ҳ���Ա�ʾ�ļ���  
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		try {
			//  ��һ����б�߱�ʾת��  
			File file = new File("e:\\mydoc\\test.txt");
			File dir2 = new File("e:\\mydoc");
			File file3 = new File("e:\\mydoc\\test2.json");
			File file4 = new File(".\\1\\test3.txt");
			
			
			if (file4.isFile()) {
				System.out.println("���ļ�");
				
				System.out.println(file4.getAbsolutePath());//����·��
				System.out.println(file4.getPath());//���·��
				System.out.println(file4.getName());//��ȡ�ļ���
				System.out.println(file4.length());//��ȡ�ļ����ݵĳ���
			}
			
			if (file3.isDirectory()) {
				System.out.println("���ļ���");
			}else{
				System.out.println("�����ļ���");
			}
			
			//------------------------------------
			if (file.exists()) {
				//file.delete();//ɾ���ļ�
				System.out.println("delete success");
			}else{
				file.createNewFile(); //�����ļ�

				System.out.println("create success");
			}
			
			//--------File.separator �ǿ��Լ��ݸ��ֲ���ϵͳ , �����ڳ�����ʹ�ø÷ָ��� 
			File file5 = new File("e:"+File.separator+"mydoc"+File.separator+"test3.json");
			if (!file5.exists()) {
				
				System.out.println("file5 not exist");
			}
			
			
			File dir1 = new File("e:"+File.separator+"mydoc2");
			
			if (!dir1.exists()) {
				dir1.mkdirs();  // ����ļ��в����� ,�ʹ���
				System.out.println("dirctory create success");
			}
			
			//---------------------------
			String[] list = dir2.list();// �鿴ĳ��Ŀ¼�����е��ļ����ļ��е�����(���������ļ��е�����)
			for (String s : list) {
				System.out.println(s);
			}
			
			
			//---------------------------
			File[] listFiles = dir2.listFiles();  // ��ȡĳ��Ŀ¼�����е��ļ���(���������ļ��е�����)
			for (File f : listFiles) {
				System.out.println(f.getName());
			}
			
			
			//------------ ��ϰ  :������Ϣ,�鿴 d:  ����e: �����е��ļ��к����ļ��� ,�Լ���Ӧ���ļ�����,�����
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
