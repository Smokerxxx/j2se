package H�ڴ���;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nextLine = input.nextLine();
		 ByteArrayInputStream bis = new ByteArrayInputStream(nextLine.getBytes());
		 
		// �ڴ��������writer����,�ǽ�����д���ڴ��� .���Թ�����ʱ,û�в���(����ָ��Ҫ�����Ŀ��)
		 ByteArrayOutputStream bos = new ByteArrayOutputStream();
		 int data=0;
		 while((data = bis.read())!=-1){
			 //System.out.print((char)data);
			 bos.write(Character.toUpperCase(data));
		 }
		 
		 String string = bos.toString(); // ���Ե��ø÷��� ��ȡ������е�����
		 System.out.println(string);
		 

	}

}
