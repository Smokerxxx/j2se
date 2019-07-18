package �������칲��һ��������;

import java.io.DataInputStream;

public class MessageReceiver implements Runnable {
	private DataInputStream dis;
	private boolean toStop = false;
	@Override
	
	public void run() {
		while(!toStop){
			try {
				System.out.println(dis.readUTF());
			} catch (Exception e) {
				if(!toStop){
					e.printStackTrace();
				}
				}
			}
		// TODO Auto-generated method stub
		
	}
	public MessageReceiver(DataInputStream dis) {
		super();
		this.dis = dis;
	}
	public void stop(){
		toStop = true;
	}

}
