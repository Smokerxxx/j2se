package F�̵߳�ͬ��;

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
			
			//ͬ�����
			synchronized(this){
				if (ticket>0) {
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
					}
					ticket=ticket-1;
					System.out.println("Ʊ��ʣ"+ticket);
				}
			}

		}
		
	}
	
	
	//ͬ������
	public  synchronized void sale(){
		if (ticket>0) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			ticket=ticket-1;
			System.out.println("Ʊ��ʣ"+ticket);
		}
	}
	
}