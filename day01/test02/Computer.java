package test02;

import java.util.Random;
import java.util.Scanner;

/**
 * ������   
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



	public int ��ȭ(){
		System.out.println("���Գ�ȭ");
		
		int next = (int)(Math.random()*3)+1; //[0,2.9999]
		
		switch (next) {
		case 1:
			System.out.println("���Գ�ȭ����");
			break;
		case 2:
			System.out.println("���Գ�ȭʯͷ");		
			break;
		case 3:
			System.out.println("���Գ�ȭ��");
			break;
		default:
			System.out.println("���Գ�ȭ����");
			break;
		}
		return next;
	}
}
