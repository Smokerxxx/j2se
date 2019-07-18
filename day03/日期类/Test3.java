package 日期类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String format = sdf.format(new Date());  // 将日期转换成一个字符串
		System.out.println(format);
		
		
		
		try {
			Date 闹铃时间 = sdf.parse("2019-07-10 16:12:30");// 将字符串转换成一个日期类型
			
			Calendar 当前日期 = Calendar.getInstance();
			
			while (当前日期.getTime().before(闹铃时间)) {
				//如果此日期在闹铃时间之前  ,进入while循环体
				
				当前日期 = Calendar.getInstance();//当前时间要随时赋值  ,作为循环判断的条件
				
				System.out.println(sdf.format(当前日期.getTime()));
			}
			System.out.println("到点了");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
