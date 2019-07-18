package E线程的常用方法;

public class SonThread implements Runnable {
	private String myname;
	
	
	public SonThread() {
		super();
	}
	
	public SonThread(String myname) {
		super();
		this.myname = myname;
	}


	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+"运行了,i="+i);
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
