package test05;

import test05.impl.AMD;
import test05.impl.Inter;
import test05.impl.Sanxing;
import test05.impl.XiJie;

/**
 * �ӿ� :  
 * 1. �ṩһ����׼   , �淶 
 * 2. ʹ�ýӿ�ʵ�ּ�ӵĶ�̳�  
 * 3. �ӿ� ��ʾ����ʲô����  ,��...   ,  �̳б�ʾ ��...
 * 4. �ӿ���������﷨
 * 
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CPU cpu1 = new Inter();
		CPU cpu2 = new AMD();
		
		HardDisk disk1 = new Sanxing();
		HardDisk disk2 = new XiJie();
		
		Computer my = new Computer(cpu1,disk1);
		Computer girlfriend = new Computer(cpu2,disk2);
		
		my.showInfo();
		girlfriend.showInfo();
	}

}
