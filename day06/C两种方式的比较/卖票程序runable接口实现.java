package C���ַ�ʽ�ıȽ�;
/**
 * ���Թ�������
 * 
 * ����һ���������, ͨ���ö���,����3�����߳�  , 3���߳�֮�乲��ͬһ�����������
 * @author Administrator
 *
 */
public class ��Ʊ����runable�ӿ�ʵ�� {
	public static void main(String[] args) {
		
		mythread2  p1 = new mythread2();
		
		
		
		Thread thread1 = new Thread(p1);
		Thread thread2 = new Thread(p1);
		Thread thread3 = new Thread(p1);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}




//�ڲ���
class mythread2 implements Runnable{
	 int tickets=5;
	 
	 public void run(){
		 for (int i = 0; i <10 ; i++) {
			if (tickets>0) {
				tickets--;
				System.out.println("��Ʊ:��ǰƱ="+tickets);
				
			}
		}
	 }
}