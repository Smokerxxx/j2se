package ��װ����;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE+1);
		System.out.println(Integer.MAX_VALUE+2);
		
		
		Character.isDigit(1); //�ж��Ƿ�������
		Character.isLetter('c');//�Ƿ�����ĸ
		
		
		List<Object> list = new ArrayList<Object>();
		//��װ����Զ�װ��   , ����������������ת���ɶ�Ӧ�İ�װ���� ,�ڷ��뼯��
		list.add(1);  
		list.add(true);
		list.add(3.14);
		list.add("abc");
		
		
		Integer integer = new Integer(12);
		Boolean boolean1 = new Boolean(true);
		Character character = new Character('c');
		
		//��װ����Զ�����   ,  ����  ****Value()�ķ���, ���������ת�ɻ�����������
		int x = integer.intValue();
		boolean booleanValue = boolean1.booleanValue();
		char charValue = character.charValue();
		
		
		//������������ת��װ����  , ͨ����װ��Ĺ�����ʵ��
		int y=101;
		Integer integerY = new Integer(y);
		
		
		//�ַ���  ---->������������        parse****()
		int parseInt = Integer.parseInt("12");//ԭ��,�ַ���������һ����ֵ��ʽ
		boolean parseBoolean = Boolean.parseBoolean("true");
		double parseDouble = Double.parseDouble("3.14");
		
		
		
		//������������    ----> �ַ���     String.valueOf()
		String valueOf = String.valueOf(123);
		
		System.out.println(Math.random()); // ����С�����16λ��ֵ
		
		Random r = new Random();
		System.out.println(r.nextInt(26));// ����С�ڸ�������������Χ  [0,100)
		
		
	}

}
