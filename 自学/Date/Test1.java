package Date;

import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		
		//打印当前时间
		Date d1 = new Date();
		System.out.println("当前时间"+ d1.toString());
		
		
		Date d2 = new Date(0);
		System.out.println("用0作为构造参数时得到的日期"+d2);
		
		//getTime() 得到一个long型的整数
        //这个整数代表 1970.1.1 08:00:00:000，每经历一毫秒，增加1
		System.out.println("用getTime()获取时间"+ d1.getTime());
	}
}
