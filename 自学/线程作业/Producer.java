package �߳���ҵ;
/**
*�����飬��run�д�ӡ��ʹ˳����ң�ԭ����cpuʹ�����
 * @author Smoke
 *
 */
public class Producer implements Runnable{

	private Computer computer = null;
	
	
	public Producer(Computer computer) {
		super();
		this.computer = computer;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 501; i++) {
			computer.add();
//			System.out.println("�������Ϊ  "+i+"  �ĵ���");
		}
	}
}
