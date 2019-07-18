package com.neuedu;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * �ͻ��������¼���߳�
 * @author Administrator
 *
 */
public class ClientMessageReceiver implements Runnable {
	private DataInputStream dis;
	
	private boolean toStop = false;
	
	
	
	public ClientMessageReceiver(DataInputStream dis) {
		super();
		this.dis = dis;
	}

	/**
	 * �Զ����߳�ֹͣ�ķ���
	 */
	public void stop(){
		toStop = true;
	}


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

		
	}
}
