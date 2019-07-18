package H练习;
/**
 * 编写一个Java程序(包括一个主程序类，一个线程类。在主程序类中创建2个线程，将其中一个线程的优先级设为10，
 * 另一个线程的优先级设为1。让优先级为10的线程打印200次“线程1正在运行”，
 * 优先级为1的线程打印200次“线程2正在运行”。 [选做题] 

 * @author Administrator
 *
 */
public class Lianxi1 {

	public static void main(String[] args) {
		MyThread my = new MyThread();
		Thread t1 = new Thread(my,"1111");// 线程1
		Thread t2 = new Thread(my,"2222"); // 线程2
		t1.setPriority(10);
		t2.setPriority(1);

		
		try {


			t2.start();
			//t2.join();// 强制让当前的线程先执行 , 完毕后,再执行其他线程(join方法让线程实现了先后顺序)
			//如果想让某个线程先执行 ,要写在其他线程上面 ,并加入join方法  
			t1.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}


class MyThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println(Thread.currentThread().getName()+"正运行"+i);
		}
		
	}
}
