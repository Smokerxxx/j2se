package test07;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * java�쳣������  ,��������쳣 (�Ҳ����ļ��쳣)  , ����ʱ�쳣(��������Ϊ0, ����ת���쳣 ,��ָ���쳣, �����±�Խ��...)
 * 
 * 1. �쳣���õ��﷨   try   catch   finally
 * 
 * 2. finally ͨ�����ᱻִ�е�  , ����  System.exit();
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Test01 test01 = new Test01();
		
//		File file = new File("c:\\haha.txt");
//		
//		try {
//			file.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("beichushu:");
			int x = input.nextInt();
			System.out.println("chushu");
			int y = input.nextInt();
			
			System.out.println(String.format("%d / %d = %d", x , y , x/y ));
			
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		} finally{
			System.out.println("����");
		}
	}
}
