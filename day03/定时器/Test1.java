package 定时器;

import java.util.Timer;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		定时任务 任务1 = new 定时任务();
		
		timer.schedule(任务1, 3000, 2000);//任务1,延迟3秒启动 , 每间隔2秒重复触发一次
	}

}
