package test05;

import test05.impl.AMD;
import test05.impl.Inter;
import test05.impl.Sanxing;
import test05.impl.XiJie;

/**
 * 接口 :  
 * 1. 提供一个标准   , 规范 
 * 2. 使用接口实现间接的多继承  
 * 3. 接口 表示具有什么功能  ,有...   ,  继承表示 是...
 * 4. 接口中特殊的语法
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
