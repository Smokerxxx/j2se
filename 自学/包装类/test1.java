package 包装类;

public class test1 {
	public static void main(String[] args) {
		int maxValue = Integer.MAX_VALUE;
		int maxValue1 = Integer.MAX_VALUE+1;
		System.out.println(maxValue);
		System.out.println(maxValue1);
		
		System.out.println(Character.isDigit(1));
		
		//转换为包装类
		//要转换的首先的是子类
		
		//构造法
		Integer integer = new Integer(1);
		String string = new String("abc");
		
		//value
		Integer num = Integer.valueOf(1);
		String num2 = String.valueOf("abc");
		
		//拆箱
		int num11 = num.intValue();
		
		
		int iii = Integer.parseInt("2");
		boolean parseBoolean = Boolean.parseBoolean("true");
	}
}
