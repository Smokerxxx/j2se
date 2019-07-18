package J打印流;

import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("请输入一段内容");
			String nextLine = input.nextLine();
			ByteArrayInputStream bis = new ByteArrayInputStream(nextLine.getBytes());
			
			PrintWriter printWriter = new PrintWriter("e:\\mydoc\\打印流.txt");
			
			 int data=0;
			 
			 printWriter.println("这是打印流中输出的内容");
			 while((data = bis.read())!=-1){
				 printWriter.write(Character.toUpperCase(data));
			 }
			 printWriter.print("不换行");
			 printWriter.print("不换行");
			 printWriter.print("不换行");
			 
			 
			 printWriter.close();
			 bis.close();
			 
		} catch (Exception e) {
			
		}

	}

}
