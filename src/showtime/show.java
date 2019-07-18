package showtime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class show implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		boolean flag = true;
		while(flag) {
		Date date = new Date();
		String time = sdf.format(date);
		System.out.println(time);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}flag = true;
	}
}
