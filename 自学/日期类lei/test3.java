package 日期类lei;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test3 {
	public static void main(String[] args) {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String date = sdf.format(new Date());
	System.out.println(date);
	
	try {
		Calendar 当前时间 = Calendar.getInstance();
		Date 截止时间 = sdf.parse("2019-07-10 18:20:50");
		System.out.println(截止时间);
		while(当前时间.getTime().before(截止时间)) {
			当前时间 = Calendar.getInstance();
			System.out.println(sdf.format(当前时间.getTime()));
		}
		}catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
