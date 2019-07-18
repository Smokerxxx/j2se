package BRunAble接口实现线程;

public class Test1 {

	public static void main(String[] args) {
		SonThread sonThread1 = new SonThread("子线程1");

		SonThread sonThread2 = new SonThread("子线程2");
		
		
		//
		Thread thread1 = new Thread(sonThread1);
		Thread thread2 = new Thread(sonThread2);
		
		thread1.start();
		thread2.start();
	}
}