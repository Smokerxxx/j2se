package ������lei;

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
		Calendar ��ǰʱ�� = Calendar.getInstance();
		Date ��ֹʱ�� = sdf.parse("2019-07-10 18:20:50");
		System.out.println(��ֹʱ��);
		while(��ǰʱ��.getTime().before(��ֹʱ��)) {
			��ǰʱ�� = Calendar.getInstance();
			System.out.println(sdf.format(��ǰʱ��.getTime()));
		}
		}catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
