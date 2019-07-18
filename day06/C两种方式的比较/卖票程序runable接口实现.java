package C两种方式的比较;
/**
 * 可以共享数据
 * 
 * 创建一个程序对象, 通过该对象,创建3各子线程  , 3个线程之间共享同一个对象的属性
 * @author Administrator
 *
 */
public class 卖票程序runable接口实现 {
	public static void main(String[] args) {
		
		mythread2  p1 = new mythread2();
		
		
		
		Thread thread1 = new Thread(p1);
		Thread thread2 = new Thread(p1);
		Thread thread3 = new Thread(p1);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}




//内部类
class mythread2 implements Runnable{
	 int tickets=5;
	 
	 public void run(){
		 for (int i = 0; i <10 ; i++) {
			if (tickets>0) {
				tickets--;
				System.out.println("卖票:当前票="+tickets);
				
			}
		}
	 }
}