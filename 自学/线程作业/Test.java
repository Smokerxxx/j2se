package �߳���ҵ;
/**
 * ���һ���������ԺͰ��˵��Ե���, Ҫ��������һ̨���ԾͰ���һ̨����,���û���µ�����������,����˹�Ҫ�ȴ��µ��Բ���;
����������ĵ���û�а���,��Ҫ�ȴ����԰���֮��������  ,����ʾ���������Ե�����;


��:
����������һ̨���Ϊ: 1 �ĵ���
���İ����˱��Ϊ: 1 �ĵ���

����������һ̨���Ϊ: 2 �ĵ���
���İ����˱��Ϊ: 2 �ĵ���

����������һ̨���Ϊ: 3 �ĵ���
���İ����˱��Ϊ: 3 �ĵ���  
 * @author Smoke
 *
 */

public class Test {
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		Producer producer = new Producer(computer);
		Transiter transiter = new Transiter(computer);
		
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(transiter);
		
		t1.start();
		t2.start();
	}
}
