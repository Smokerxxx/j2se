package system;

import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		long currentTimeMillis = System.currentTimeMillis();
		
		//long time = new Date().getTime();
		
		System.out.println(currentTimeMillis);
//		System.out.println(time);
		
		try {
			Thread.sleep(1000);// Ïß³ÌÐÝÃß
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long currentTimeMillis2 = System.currentTimeMillis();
		
		System.out.println(currentTimeMillis2-currentTimeMillis);
		
		
	}

}
