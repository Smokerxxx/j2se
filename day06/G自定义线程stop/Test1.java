package G�Զ����߳�stop;

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

		my.stop();// �����Զ����ֹͣ���� , ��ֹmy���� �е��߳�
		
		System.out.println(thread.isAlive());
		System.out.println(thread.interrupted());// interrupted()Ҳ������ֹһ���߳� , ͨ��ʹ���Զ����stop������ֹһ���߳�
		System.out.println(thread.isAlive());
		
	}

}
