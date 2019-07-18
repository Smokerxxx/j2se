package AThread类;

public class MyThread extends Thread {
	private String myname;
	
	
	public MyThread(String myname) {
		super();
		this.myname = myname;
	}
	
	
	//定义了线程要做的事
	public void run(){
		for (int i = 0; i < 20; i++) {
			System.out.println(myname+"运行了,i="+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//休眠100毫秒
		}
	}
	public String getMyname() {
		return myname;
	}
	public void setMyname(String myname) {
		this.myname = myname;
	}
	
	

	
	
}
