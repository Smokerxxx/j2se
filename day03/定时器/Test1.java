package ��ʱ��;

import java.util.Timer;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		��ʱ���� ����1 = new ��ʱ����();
		
		timer.schedule(����1, 3000, 2000);//����1,�ӳ�3������ , ÿ���2���ظ�����һ��
	}

}
