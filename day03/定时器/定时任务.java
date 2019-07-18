package 定时器;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;
/**
 * TimerTask 是做定时任务的类  ,继承该类 , 并重写run方法 , run方法中定义了任务要做的事情
 * 
 * Timer  是定时器类   , 每间隔多少时间 , 触发 该定时任务  , 执行run方法
 * @author Administrator
 *
 */
public class 定时任务 extends TimerTask {

	@Override
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(new Date());  // 将日期转换成一个字符串
		System.out.println(format);
	}

}
