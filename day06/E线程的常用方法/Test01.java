package E�̵߳ĳ��÷���;

public class Test01 {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		
		
		SonThread sonThread = new SonThread();
		Thread sonthread = new Thread(sonThread,"���߳�B");
		
		//��û��start֮ǰ , isalive��û����
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
		//�߳�ִ�еĹ����� isalive����״̬   , �߳����ִ�н���  ,  isalive����false
		System.out.println("myThread isalive:"+myThread.isAlive());
		System.out.println("sonThread isalive:"+sonthread.isAlive());
		

	}

}
