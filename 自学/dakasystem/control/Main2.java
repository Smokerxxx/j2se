package dakasystem.control;

import java.util.Scanner;

import neuedu.dakasystem.service.DakaService;

public class Main2 {
	public static void main(String[] args) {
		DakaService dakaService = new DakaService();
		Scanner input = new Scanner(System.in);
		jiemian1();
		int i = input.nextInt();
		boolean flag = true;
		while(flag){
			switch (i) {
			case 1:
				System.out.println("������Ա��id");
				int empid = input.nextInt();
				dakaService.qiandao(empid);
				jiemian1();
				i=input.nextInt();
				break;
			case 2:
				System.out.println("������Ա��id");
				int empid2 = input.nextInt();
				dakaService.qiantui(empid2);
				jiemian1();
				i=input.nextInt();
				break;
			case 3:
				System.out.println("������Ա��id");
				int empid3 = input.nextInt();
				dakaService.chakandangtianqiandaoxinxi(empid3);
				jiemian1();
				i=input.nextInt();
				break;
			default:
				System.out.println("����");
				flag = false;
				break;
			}
		}
	}
	
	public static void jiemian1(){
		System.out.println("----Ա����ϵͳ----");
		System.out.println("1--------ǩ��");
		System.out.println("2--------ǩ��");
		System.out.println("3--------�鿴ǩ����Ϣ");
		System.out.println("4--------�˳�");
		System.out.println("��������ִ�еĲ�����");
	}
}
