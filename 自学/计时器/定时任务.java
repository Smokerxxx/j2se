package ��ʱ��;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

public class ��ʱ���� extends TimerTask {

	@Override
	public void run() {
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		String time = date.format(calendar.getTime());
		System.out.println("I miss you w \t"+ time);
	}
	
}
