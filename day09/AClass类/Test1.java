package AClass��;

import java.util.Scanner;
/**
 * �κζ�����getClass���� , Object�����ṩ�Ĺ��з���,
 * ͨ���÷���,���Ի�ȡ���������ĸ���  ,����������������
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
