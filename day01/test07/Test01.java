package test07;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * java异常分两种  ,检查类型异常 (找不到文件异常)  , 运行时异常(除数不能为0, 类型转换异常 ,空指针异常, 数组下标越界...)
 * 
 * 1. 异常常用的语法   try   catch   finally
 * 
 * 2. finally 通常都会被执行到  , 除非  System.exit();
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
			System.out.println("结束");
		}
	}
}
