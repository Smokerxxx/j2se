package ��ʱ��;

import java.util.Timer;

public class test��ʱ���� {
	public static void main(String[] args) {
		Timer timer = new Timer();
		
		��ʱ���� ��ʱ���� = new ��ʱ����();
		timer.schedule(��ʱ����, 3000,2000);
	}
}
