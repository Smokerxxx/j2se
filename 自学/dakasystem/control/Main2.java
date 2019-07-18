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
				System.out.println("请输入员工id");
				int empid = input.nextInt();
				dakaService.qiandao(empid);
				jiemian1();
				i=input.nextInt();
				break;
			case 2:
				System.out.println("请输入员工id");
				int empid2 = input.nextInt();
				dakaService.qiantui(empid2);
				jiemian1();
				i=input.nextInt();
				break;
			case 3:
				System.out.println("请输入员工id");
				int empid3 = input.nextInt();
				dakaService.chakandangtianqiandaoxinxi(empid3);
				jiemian1();
				i=input.nextInt();
				break;
			default:
				System.out.println("结束");
				flag = false;
				break;
			}
		}
	}
	
	public static void jiemian1(){
		System.out.println("----员工打卡系统----");
		System.out.println("1--------签到");
		System.out.println("2--------签退");
		System.out.println("3--------查看签到信息");
		System.out.println("4--------退出");
		System.out.println("请输入想执行的操作：");
	}
}
