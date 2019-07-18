package D素数多线程练习;

public class Thread实现 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mythread1 my1 = new mythread1(1,1000);
		mythread1 my2 = new mythread1(1001,2000);
		mythread1 my3 = new mythread1(2001,3000);
		
		my1.start();
		my2.start();
		my3.start();
	}

}

class mythread1 extends Thread{
	int start;
	int end;
	
	
	
	public mythread1(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}



	public void run(){
		
		//求素数的逻辑
		if(start==1){
			start=start+1;
		}
		
		for (int i = start; i < end; i++) {
			for (int j = 2; j <=(int)Math.sqrt(i)+1; j++) {
				if(i==2&&j==2){
					System.out.println(j+"是一个素数!");
					continue;
				}
					
				if(i%j==0){
					break;
				}
				
				if(j>=(int)Math.sqrt(i)){
					System.out.println(i+"是一个素数.");
					
				}
			}
		}
	}
}
