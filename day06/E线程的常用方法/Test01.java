package E线程的常用方法;

public class Test01 {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		
		
		SonThread sonThread = new SonThread();
		Thread sonthread = new Thread(sonThread,"子线程B");
		
		//当没有start之前 , isalive都没激活
		System.out.println("myThread isalive:"+myThread.isAlive());
		System.out.println("sonThread isalive:"+sonthread.isAlive());
		
		myThread.start();
		sonthread.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//线程执行的过程中 isalive激活状态   , 线程如果执行结束  ,  isalive又是false
		System.out.println("myThread isalive:"+myThread.isAlive());
		System.out.println("sonThread isalive:"+sonthread.isAlive());
		

	}

}
