package H内存流;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nextLine = input.nextLine();
		 ByteArrayInputStream bis = new ByteArrayInputStream(nextLine.getBytes());
		 
		// 内存输出流的writer方法,是将数据写入内存中 .所以构造器时,没有参数(即不指定要输出的目标)
		 ByteArrayOutputStream bos = new ByteArrayOutputStream();
		 int data=0;
		 while((data = bis.read())!=-1){
			 //System.out.print((char)data);
			 bos.write(Character.toUpperCase(data));
		 }
		 
		 String string = bos.toString(); // 可以调用该方法 获取输出流中的内容
		 System.out.println(string);
		 

	}

}
