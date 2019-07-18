package 计时器;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

public class 定时任务 extends TimerTask {

	@Override
	public void run() {
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		String time = date.format(calendar.getTime());
		System.out.println("I miss you w \t"+ time);
	}
	
}
