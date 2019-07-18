package 包装类型;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE+1);
		System.out.println(Integer.MAX_VALUE+2);
		
		
		Character.isDigit(1); //判断是否是数字
		Character.isLetter('c');//是否是字母
		
		
		List<Object> list = new ArrayList<Object>();
		//包装类的自动装箱   , 将基本数据类型先转换成对应的包装类型 ,在放入集合
		list.add(1);  
		list.add(true);
		list.add(3.14);
		list.add("abc");
		
		
		Integer integer = new Integer(12);
		Boolean boolean1 = new Boolean(true);
		Character character = new Character('c');
		
		//包装类的自动拆箱   ,  调用  ****Value()的方法, 将类的类型转成基本数据类型
		int x = integer.intValue();
		boolean booleanValue = boolean1.booleanValue();
		char charValue = character.charValue();
		
		
		//基本数据类型转包装类型  , 通过包装类的构造器实现
		int y=101;
		Integer integerY = new Integer(y);
		
		
		//字符串  ---->基本数据类型        parse****()
		int parseInt = Integer.parseInt("12");//原则,字符串必须是一个数值形式
		boolean parseBoolean = Boolean.parseBoolean("true");
		double parseDouble = Double.parseDouble("3.14");
		
		
		
		//基本数据类型    ----> 字符串     String.valueOf()
		String valueOf = String.valueOf(123);
		
		System.out.println(Math.random()); // 返回小数点后16位数值
		
		Random r = new Random();
		System.out.println(r.nextInt(26));// 返回小于给定数的整数范围  [0,100)
		
		
	}

}
