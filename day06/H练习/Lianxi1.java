package H��ϰ;
/**
 * ��дһ��Java����(����һ���������࣬һ���߳��ࡣ�����������д���2���̣߳�������һ���̵߳����ȼ���Ϊ10��
 * ��һ���̵߳����ȼ���Ϊ1�������ȼ�Ϊ10���̴߳�ӡ200�Ρ��߳�1�������С���
 * ���ȼ�Ϊ1���̴߳�ӡ200�Ρ��߳�2�������С��� [ѡ����] 

 * @author Administrator
 *
 */
public class Lianxi1 {

	public static void main(String[] args) {
		MyThread my = new MyThread();
		Thread t1 = new Thread(my,"1111");// �߳�1
		Thread t2 = new Thread(my,"2222"); // �߳�2
		t1.setPriority(10);
		t2.setPriority(1);

		
		try {


			t2.start();
			//t2.join();// ǿ���õ�ǰ���߳���ִ�� , ��Ϻ�,��ִ�������߳�(join�������߳�ʵ�����Ⱥ�˳��)
			//�������ĳ���߳���ִ�� ,Ҫд�������߳����� ,������join����  
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
			System.out.println(Thread.currentThread().getName()+"������"+i);
		}
		
	}
}
