package ������;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		
		System.out.println(date);
		System.out.println(date.getTime());//���㵱ǰʱ����1970.01.01 00:00:00 000 ֮��Ĳ�ֵ,��λ:����
		
		long years =date.getTime()/1000/60/60/24/365;
		System.out.println(date.getClass());
		System.out.println(years);
	}

}
