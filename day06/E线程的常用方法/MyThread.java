package E�̵߳ĳ��÷���;

public class MyThread extends Thread {
	private String myname;
	
	
	public MyThread() {
		super();
	}
	
	public MyThread(String myname) {
		super();
		this.myname = myname;
	}
	
	
	//�������߳�Ҫ������
	public void run(){
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+"������,i="+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//����100����
		}
	}
	public String getMyname() {
		return myname;
	}
	public void setMyname(String myname) {
		this.myname = myname;
	}
	
	

	
	
}
