package test02;

import java.util.Scanner;

/**
 * 玩家类   
 * @author Administrator
 *
 */
public class Wanjia {
	String name;
	int score;
	
	
	//构造方法 : 作用是更方便的实例化一个对象
	public Wanjia(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}


	
	public int 出拳(){
		Scanner input = new Scanner(System.in);
		System.out.println("1:剪刀  2:石头 3:布");
		int nextInt = input.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println("我出拳剪刀");
			break;
		case 2:
			System.out.println("我出拳石头");		
			break;
		case 3:
			System.out.println("我出拳布");
			break;
		default:
			System.out.println("我出拳错误,电脑自动胜利");
			break;
		}
		return nextInt;
	}
}
