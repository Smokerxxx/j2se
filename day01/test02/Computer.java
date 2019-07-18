package test02;

import java.util.Random;
import java.util.Scanner;

/**
 * 电脑类   
 * @author Administrator
 *
 */
public class Computer {
	String name;
	int score;
	
	
	
	public Computer(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}



	public int 出拳(){
		System.out.println("电脑出拳");
		
		int next = (int)(Math.random()*3)+1; //[0,2.9999]
		
		switch (next) {
		case 1:
			System.out.println("电脑出拳剪刀");
			break;
		case 2:
			System.out.println("电脑出拳石头");		
			break;
		case 3:
			System.out.println("电脑出拳布");
			break;
		default:
			System.out.println("电脑出拳错误");
			break;
		}
		return next;
	}
}
