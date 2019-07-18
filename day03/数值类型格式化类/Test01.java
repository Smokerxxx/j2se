package 数值类型格式化类;

import java.text.DecimalFormat;
/**
 * 		// SimpleDateFormat   时间的格式化类  
		
		// DecimalFormat      数值的格式化类
 * @author Administrator
 *
 */
public class Test01 {

	/**
	 * 
	 * @param param1  -要格式化的类型
	 * @param param2  -要格式化的数值
	 */
	public static void 格式化各种数值类型(String param1, double param2){
		DecimalFormat df = new DecimalFormat(param1);
		String format = df.format(param2);
		System.out.println("use "+param1+":"+param2+",is "+format);
	}
	
	public static void main(String[] args) {

		//Test01.格式化各种数值类型("###,###.##", 1234.235567);//#表示缺省时不显示,多出时也不影响原值
//		Test01.格式化各种数值类型("000,000.00", 1234567);// 0表示没有就会补0操作
		Test01.格式化各种数值类型("$000.00", 12345.67); // 美元符号  和人民币符号都可以显示在java程序中
		Test01.格式化各种数值类型("00.00%", 0.036); //% 表示对该数*100 ,再接%号
		Test01.格式化各种数值类型("00.00\u2030", 0.036);// \u2030表示对该数*1000 ,再接‰号

	}

}
