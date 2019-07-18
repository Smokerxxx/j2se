package G自定义线程stop;

/**
 * 自定义一个stop()方法,实现停止当前线程的功能
 * 
 * 1.定义一个flag 初始化为true
 * 
 * 2. 增加一个stop方法  , 将标志位改为false
 * 
 * 3. 在run方法中  ,  加入while循环 , 判断flag如果为false 就不执行  
 * @author Administrator
 *
 */
public class MyThread implements Runnable {
	private boolean flag = true;
	@Override
	public void run() {
		int i=0;
		while (flag) {
			System.out.println(Thread.currentThread().getName()+"i="+i);
			i++;
		}
		
	}
	
	public void stop(){
		flag = false;
	}
}
