package �߳���ҵ;

public class Transiter implements Runnable {
	private Computer computer = null;
	
	public Transiter(Computer computer) {
		super();
		this.computer = computer;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 501; i++) {
			computer.move();
//			System.out.println("���߱��Ϊ  "+i+"  �ĵ���");
		}
	}

}
