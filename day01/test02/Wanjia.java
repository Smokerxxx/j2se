package test02;

import java.util.Scanner;

/**
 * �����   
 * @author Administrator
 *
 */
public class Wanjia {
	String name;
	int score;
	
	
	//���췽�� : �����Ǹ������ʵ����һ������
	public Wanjia(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}


	
	public int ��ȭ(){
		Scanner input = new Scanner(System.in);
		System.out.println("1:����  2:ʯͷ 3:��");
		int nextInt = input.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println("�ҳ�ȭ����");
			break;
		case 2:
			System.out.println("�ҳ�ȭʯͷ");		
			break;
		case 3:
			System.out.println("�ҳ�ȭ��");
			break;
		default:
			System.out.println("�ҳ�ȭ����,�����Զ�ʤ��");
			break;
		}
		return nextInt;
	}
}
