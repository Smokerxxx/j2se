package ��ҵ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Company company = new Company();
		
//		Employee em1 = new Employee(00001, "����");
//		Employee em2 = new Employee(00002, "����");
//		Employee em3 = new Employee(00003, "����");
//		Employee em4 = new Employee(00004, "ʯͷ");
//		Employee em5 = new Employee(00005, "����");
		
		company.������Ա("����", 0001);
		company.������Ա("����", 0002);
		company.������Ա("����", 0003);
		company.������Ա("ʯͷ", 0004);
		company.������Ա("����", 0005);
		
		System.out.println("������Ա�ɹ���");
		System.out.println("*****************");
		System.out.println("��ӭ����neue��ϵͳ");
		System.out.println("*****************");
		
		
		boolean flag = true;
		while(flag) {
		System.out.println("����0-----�˳�");
		System.out.println("����1-----ǩ��");
		System.out.println("����2-----ǩ��");
		System.out.println("����3-----�鿴ǩ����Ϣ");
		
		int input = new Scanner(System.in).nextInt();
		switch(input) {
//		case 0:
//			flag = false;
//			break;
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
				flag = false;
				System.out.println("�Ѿ��˳�ϵͳ��лл����ʹ��");
				break;
			
		}
			
		}
	}
}
