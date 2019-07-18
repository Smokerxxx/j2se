package �߳���ҵ;
/**
 * ������ �������������ߵķ���
 * @author Smoke
 *
 */
public class Computer {
	private boolean flag = false;
	private int count = 0 ;
	
	
	public synchronized void add() {
		if(flag) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		count++;
		flag = true;
		System.out.println("����������һ̨���Ϊ "+count+" �ĵ���");
		System.out.println("Ŀǰ����Ϊ\t"+count);
		notify();
	}
	
	public synchronized void move() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("���İ���һ̨���Ϊ "+count+" �ĵ���");
		System.out.println();
		flag = false;
		notify();
	}
	
}
