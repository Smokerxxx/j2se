package G自定义线程stop;

public class Test1 {

	public static void main(String[] args) {
		MyThread my = new MyThread();
		
		Thread thread = new Thread(my);
		
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		my.stop();// 调用自定义的停止方法 , 终止my对象 中的线程
		
		System.out.println(thread.isAlive());
		System.out.println(thread.interrupted());// interrupted()也可以终止一个线程 , 通常使用自定义的stop方法终止一个线程
		System.out.println(thread.isAlive());
		
	}

}
