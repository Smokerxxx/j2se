package H��ϰ;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * ��дһ����ʱ����ÿ��һ���ӣ��ڿ���̨��ӡ������ʱ�䡣 [������] 
 * @author Administrator
 *
 */
public class Lianxi2 {

	public static void main(String[] args) {
		Timer22 he = new Timer22();
		
		Thread t1 = new Thread(he);
		
		t1.start();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		he.stop();
	}


}

class Timer22 implements Runnable{
	boolean flag= true;
	@Override
	public void run() {
		while(flag){
			try {
				Thread.sleep(1000);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				System.out.println(sdf.format(new Date()));
			} catch (Exception e) {
				
			}			
		}
		
	}
	
	public void stop(){
		flag =false;
	}
}
