package E线程的常用方法;

public class Test2 implements Runnable {
	MyThread myThread = new MyThread();
	
	public static void main(String[] args) {

		
		Test2 test2 = new Test2();
		Thread t1 = new Thread(test2,"线程A");
		Thread t2 = new Thread(test2,"线程B");
		Thread t3 = new Thread(test2,"线程C");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);

		
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
//				Thread.currentThread().wait(500);
//				Thread.currentThread().notifyAll();
				System.out.println(Thread.currentThread().getName()+"运行了i="+i);
				
				if (i==2) {
					System.out.println(Thread.currentThread().getName()+"暂停");
					Thread.currentThread().yield();// 将当前线程重置为就绪状态(不经过阻塞状态)
					myThread.join();//强制执行某个线程, 当该线程执行完毕,再执行当前线程
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
