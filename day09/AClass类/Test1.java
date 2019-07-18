package AClass类;

import java.util.Scanner;
/**
 * 任何对象都有getClass方法 , Object类中提供的共有方法,
 * 通过该方法,可以获取对象属于哪个类  ,并返回这个类的类型
 * @author Administrator
 *
 */
public class Test1 {

	public static void main(String[] args) {
		A a = new A();
		
		Scanner input = new Scanner(System.in);
		System.out.println(a.getClass().getName());
		System.out.println(input.getClass());
	}

}


class A{
	
}
