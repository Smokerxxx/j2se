package 线程作业;
/**
*经试验，在run中打印会使顺序变乱，原因是cpu使用随机
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
//			System.out.println("生产编号为  "+i+"  的电脑");
		}
	}
}
