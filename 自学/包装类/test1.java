package ��װ��;

public class test1 {
	public static void main(String[] args) {
		int maxValue = Integer.MAX_VALUE;
		int maxValue1 = Integer.MAX_VALUE+1;
		System.out.println(maxValue);
		System.out.println(maxValue1);
		
		System.out.println(Character.isDigit(1));
		
		//ת��Ϊ��װ��
		//Ҫת�������ȵ�������
		
		//���취
		Integer integer = new Integer(1);
		String string = new String("abc");
		
		//value
		Integer num = Integer.valueOf(1);
		String num2 = String.valueOf("abc");
		
		//����
		int num11 = num.intValue();
		
		
		int iii = Integer.parseInt("2");
		boolean parseBoolean = Boolean.parseBoolean("true");
	}
}
