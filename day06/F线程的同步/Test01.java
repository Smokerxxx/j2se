package F线程的同步;

public class Test01 {

	public static void main(String[] args) {
		Mythread mythread = new Mythread();
		
		Thread t1 = new Thread(mythread);
		Thread t2 = new Thread(mythread);
		Thread t3 = new Thread(mythread);
		
		t1.start();
		t2.start();
		t3.start();
	}

}


class Mythread implements Runnable{

	int ticket=5;
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			//同步语句
			synchronized(this){
				if (ticket>0) {
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
					}
					ticket=ticket-1;
					System.out.println("票还剩"+ticket);
				}
			}

		}
		
	}
	
	
	//同步方法
	public  synchronized void sale(){
		if (ticket>0) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			ticket=ticket-1;
			System.out.println("票还剩"+ticket);
		}
	}
	
}