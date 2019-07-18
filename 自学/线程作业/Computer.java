package 线程作业;
/**
 * 电脑类 包含生产和运走的方法
 * @author Smoke
 *
 */
public class Computer {
	private boolean flag = false;
	private int count = 0 ;
	
	
	public synchronized void add() {
		if(flag) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		count++;
		flag = true;
		System.out.println("张三生产了一台编号为 "+count+" 的电脑");
		System.out.println("目前总数为\t"+count);
		notify();
	}
	
	public synchronized void move() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("李四搬走一台编号为 "+count+" 的电脑");
		System.out.println();
		flag = false;
		notify();
	}
	
}
