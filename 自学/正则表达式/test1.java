package ������ʽ;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
	public static void main(String[] args) {
	
		
		String ���֤��������ʽ  = "^\\d{15}|\\d{18}$";
		Pattern pattern = Pattern.compile(���֤��������ʽ);
		while(true){
		System.out.println("input your number");
		String str = new Scanner(System.in).nextLine();
		Matcher matcher = pattern.matcher(str);
		
		if(matcher.matches()) {
			System.out.println("��ʽ��ȷ");
		}else {
			System.out.println("��ʽ����");
		}
	}
		}
}
