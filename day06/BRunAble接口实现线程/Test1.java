package BRunAble�ӿ�ʵ���߳�;

public class Test1 {

	public static void main(String[] args) {
		SonThread sonThread1 = new SonThread("���߳�1");

		SonThread sonThread2 = new SonThread("���߳�2");
		
		
		//
		Thread thread1 = new Thread(sonThread1);
		Thread thread2 = new Thread(sonThread2);
		
		thread1.start();
		thread2.start();
	}
}