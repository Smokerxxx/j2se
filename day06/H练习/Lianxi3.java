package H练习;
/**
 * 做4个线程   ,  操作同一个数据  , 2个线程负责增加+1  ,2个线程负减-1
 * @author Administrator
 *
 */
public class Lianxi3 {

	public static void main(String[] args) {
		Data data = new Data();
		Add add1 = new Add(data);
		Add add2 = new Add(data);
		Dec dec1 = new Dec(data);
		Dec dec2 = new Dec(data);
		
		Thread t1 = new Thread(add1);
		Thread t2 = new Thread(add2);
		Thread t3 = new Thread(dec1);
		Thread t4 = new Thread(dec2);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}

class Data{
	int j = 0 ;
	
	public synchronized void add(){
		System.out.println(Thread.currentThread().getName()+"对j+1,j="+(++j));
	}
	
	public synchronized void dec(){
		System.out.println(Thread.currentThread().getName()+"对j-1,j="+(--j));
	}
}

class Add implements Runnable{
	Data d;
	public Add(Data d){
		this.d=d;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			d.add();
		}
		
	}
}

class Dec implements Runnable{
	Data d;
	public Dec(Data d){
		this.d=d;
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			d.dec();
		}
	}
}

