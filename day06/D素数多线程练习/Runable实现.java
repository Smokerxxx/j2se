package D�������߳���ϰ;

public class Runableʵ�� {

	public static void main(String[] args) {
		mythread2 my1 = new mythread2(1, 1000);
		mythread2 my2 = new mythread2(1001, 2000);
		mythread2 my3 = new mythread2(2001, 3000);
		
		Thread t1 = new Thread(my1);
		Thread t2 = new Thread(my2);
		Thread t3 = new Thread(my3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
	}

}


class mythread2 implements Runnable {
	int start;
	int end;
	
	
	
	public mythread2(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}



	public void run(){
		
		//���������߼�
		if(start==1){
			start=start+1;
		}
		
		for (int i = start; i < end; i++) {
			for (int j = 2; j <=(int)Math.sqrt(i)+1; j++) {
				if(i==2&&j==2){
					System.out.println(j+"��һ������");
					continue;
				}
					
				if(i%j==0){
					break;
				}
				if(j>=(int)Math.sqrt(i)){
					System.out.println(i+"��һ������");
				}
			}
		}
	}
}
