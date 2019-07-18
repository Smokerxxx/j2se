package com.neuedu;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * 客户端聊天记录的线程
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
	 * 自定义线程停止的方法
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
