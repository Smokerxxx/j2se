package J��ӡ��;

import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("������һ������");
			String nextLine = input.nextLine();
			ByteArrayInputStream bis = new ByteArrayInputStream(nextLine.getBytes());
			
			PrintWriter printWriter = new PrintWriter("e:\\mydoc\\��ӡ��.txt");
			
			 int data=0;
			 
			 printWriter.println("���Ǵ�ӡ�������������");
			 while((data = bis.read())!=-1){
				 printWriter.write(Character.toUpperCase(data));
			 }
			 printWriter.print("������");
			 printWriter.print("������");
			 printWriter.print("������");
			 
			 
			 printWriter.close();
			 bis.close();
			 
		} catch (Exception e) {
			
		}

	}

}
