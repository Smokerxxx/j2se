package E�̵߳ĳ��÷���;

public class Test2 implements Runnable {
	MyThread myThread = new MyThread();
	
	public static void main(String[] args) {

		
		Test2 test2 = new Test2();
		Thread t1 = new Thread(test2,"�߳�A");
		Thread t2 = new Thread(test2,"�߳�B");
		Thread t3 = new Thread(test2,"�߳�C");
		
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
				System.out.println(Thread.currentThread().getName()+"������i="+i);
				
				if (i==2) {
					System.out.println(Thread.currentThread().getName()+"��ͣ");
					Thread.currentThread().yield();// ����ǰ�߳�����Ϊ����״̬(����������״̬)
					myThread.join();//ǿ��ִ��ĳ���߳�, �����߳�ִ�����,��ִ�е�ǰ�߳�
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
