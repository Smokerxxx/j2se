package C两种方式的比较;
/**
 * 无法共享数据
 * @author Administrator
 *
 */
public class 卖票程序Thread实现 {
	public static void main(String[] args) {
		mythread  p1 = new mythread();
		mythread  p2 = new mythread();
		mythread  p3 = new mythread();
		
		p1.start();
		p2.start();
		p3.start();
	}
}




//内部类
class mythread extends Thread{
	 int tickets=5;
	 
	 public void run(){
		 for (int i = 0; i <10 ; i++) {
			if (tickets>0) {
				tickets--;
				System.out.println("卖票:当前票="+tickets);
				
			}
		}
	 }
}