package 正则表达式;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
	public static void main(String[] args) {
	
		
		String 身份证的正则表达式  = "^\\d{15}|\\d{18}$";
		Pattern pattern = Pattern.compile(身份证的正则表达式);
		while(true){
		System.out.println("input your number");
		String str = new Scanner(System.in).nextLine();
		Matcher matcher = pattern.matcher(str);
		
		if(matcher.matches()) {
			System.out.println("格式正确");
		}else {
			System.out.println("格式错误");
		}
	}
		}
}
