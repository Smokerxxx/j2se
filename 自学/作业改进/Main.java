package ��ҵ�Ľ�;

import java.util.Scanner;

public class Main {
	
//	public void BOSS() {
//		boolean flagBOSS = true;
//		while(flagBOSS) {
//			System.out.println("1---------��ѯԱ���б�");
//			System.out.println("2---------����Ա��");
//			System.out.println("3---------ɾ��Ա��");
//			System.out.println("4---------�˳�");
//			System.out.println();
//		}
//		}	
//	
//	public void emp() {
//		boolean flagYuangong = true;
//		while(flagYuangong) {
//		System.out.println("����0-----�˳�");
//		System.out.println("����1-----ǩ��");
//		System.out.println("����2-----ǩ��");
//		System.out.println("����3-----�鿴ǩ����Ϣ");
//		System.out.println();
//		
//		int input = new Scanner(System.in).nextInt();
//		switch(input) {
////		case 0:
////			flag = false;
////			break;
//		case 1:
//			company.ǩ������();
//			break;
//		case 2:
//			company.ǩ�˷���();
//			break;
//		case 3:
//			company.�鿴ǩ����Ϣ();
//			break;
//			default:
//				flagYuangong = false;
//				System.out.println("�Ѿ��˳�ϵͳ��лл����ʹ��");
//				break;
//			
//		}
//	}
//	}
	public static void main(String[] args) {
		
		Company company = new Company();
		
		
		company.������Ա(10001,"����");
		company.������Ա(10002,"����");
		company.������Ա(10003,"����");
		company.������Ա(10004,"ʯͷ");
		company.������Ա(10005,"����");
		
		
		System.out.println("*****************");
		System.out.println("��ӭ����neue��ϵͳ");
		System.out.println("*****************");
		
		boolean flag = true;
		while(flag) {
		System.out.println("1----------Ա����");
		System.out.println("2----------�ϼ��޸�(��������ʹ��)");
		System.out.println("3----------�˳�");
		int input = new Scanner(System.in).nextInt();
		switch(input) {
		case 1:
			boolean flag1 = true;
			while(flag1) {
				System.out.println("����0-----�˳�");
				System.out.println("����1-----ǩ��");
				System.out.println("����2-----ǩ��");
				System.out.println("����3-----�鿴ǩ����Ϣ");
				System.out.println();
				
				int input1 = new Scanner(System.in).nextInt();
				switch(input1) {
					case 0:
					flag1 = false;
					break;
				case 1:
					company.ǩ������();
					break;
				case 2:
					company.ǩ�˷���();
					break;
				case 3:
					company.�鿴ǩ����Ϣ();
					break;
					default:
						flag1 = false;
						System.out.println("�Ѿ��˳�ϵͳ��лл����ʹ��");
						break;
					
				}
		}flag = false;
		case 2:
			
			System.out.println("����������111");
			String mm = new Scanner(System.in).nextLine();
			if("111".equals(mm)) {
			boolean flagBOSS = true;
			while(flagBOSS) {
				System.out.println("1---------��ѯԱ���б�");
				System.out.println("2---------����Ա��");
				System.out.println("3---------ɾ��Ա��");
				System.out.println("4---------�˳�");
				System.out.println();
				
				int input1 = new Scanner(System.in).nextInt();
				switch(input1) {
					case 0:
					flagBOSS = false;
					break;
				case 1:
					company.��ʾԱ����Ϣ();;
					break;
				case 2:
					company.������Ա();
					break;
				case 3:
					company.ɾ����Ա();
					break;
					default:
						flagBOSS = false;
						System.out.println("�Ѿ��˳�ϵͳ��лл����ʹ��");
						break;
					}

				}flag = false;}else {
					System.out.println("���������������");
					flag = false;
					break;
					
				}
		default :
			System.out.println("�Ѿ��˳�ϵͳ��лл����ʹ��");
			flag = false;
			break;
}
}
}
}

