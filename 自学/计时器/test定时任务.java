package 计时器;

import java.util.Timer;

public class test定时任务 {
	public static void main(String[] args) {
		Timer timer = new Timer();
		
		定时任务 定时任务 = new 定时任务();
		timer.schedule(定时任务, 3000,2000);
	}
}
