package 作业改进;

import java.util.Scanner;

public class Main {
	
//	public void BOSS() {
//		boolean flagBOSS = true;
//		while(flagBOSS) {
//			System.out.println("1---------查询员工列表");
//			System.out.println("2---------增加员工");
//			System.out.println("3---------删除员工");
//			System.out.println("4---------退出");
//			System.out.println();
//		}
//		}	
//	
//	public void emp() {
//		boolean flagYuangong = true;
//		while(flagYuangong) {
//		System.out.println("输入0-----退出");
//		System.out.println("输入1-----签到");
//		System.out.println("输入2-----签退");
//		System.out.println("输入3-----查看签到信息");
//		System.out.println();
//		
//		int input = new Scanner(System.in).nextInt();
//		switch(input) {
////		case 0:
////			flag = false;
////			break;
//		case 1:
//			company.签到方法();
//			break;
//		case 2:
//			company.签退方法();
//			break;
//		case 3:
//			company.查看签到信息();
//			break;
//			default:
//				flagYuangong = false;
//				System.out.println("已经退出系统，谢谢您的使用");
//				break;
//			
//		}
//	}
//	}
	public static void main(String[] args) {
		
		Company company = new Company();
		
		
		company.新增人员(10001,"张三");
		company.新增人员(10002,"李四");
		company.新增人员(10003,"王五");
		company.新增人员(10004,"石头");
		company.新增人员(10005,"鸡蛋");
		
		
		System.out.println("*****************");
		System.out.println("欢迎来到neue打卡系统");
		System.out.println("*****************");
		
		boolean flag = true;
		while(flag) {
		System.out.println("1----------员工打卡");
		System.out.println("2----------上级修改(仅供经理使用)");
		System.out.println("3----------退出");
		int input = new Scanner(System.in).nextInt();
		switch(input) {
		case 1:
			boolean flag1 = true;
			while(flag1) {
				System.out.println("输入0-----退出");
				System.out.println("输入1-----签到");
				System.out.println("输入2-----签退");
				System.out.println("输入3-----查看签到信息");
				System.out.println();
				
				int input1 = new Scanner(System.in).nextInt();
				switch(input1) {
					case 0:
					flag1 = false;
					break;
				case 1:
					company.签到方法();
					break;
				case 2:
					company.签退方法();
					break;
				case 3:
					company.查看签到信息();
					break;
					default:
						flag1 = false;
						System.out.println("已经退出系统，谢谢您的使用");
						break;
					
				}
		}flag = false;
		case 2:
			
			System.out.println("请输入密码111");
			String mm = new Scanner(System.in).nextLine();
			if("111".equals(mm)) {
			boolean flagBOSS = true;
			while(flagBOSS) {
				System.out.println("1---------查询员工列表");
				System.out.println("2---------增加员工");
				System.out.println("3---------删除员工");
				System.out.println("4---------退出");
				System.out.println();
				
				int input1 = new Scanner(System.in).nextInt();
				switch(input1) {
					case 0:
					flagBOSS = false;
					break;
				case 1:
					company.显示员工信息();;
					break;
				case 2:
					company.新增人员();
					break;
				case 3:
					company.删除人员();
					break;
					default:
						flagBOSS = false;
						System.out.println("已经退出系统，谢谢您的使用");
						break;
					}

				}flag = false;}else {
					System.out.println("你输入的密码有误");
					flag = false;
					break;
					
				}
		default :
			System.out.println("已经退出系统，谢谢您的使用");
			flag = false;
			break;
}
}
}
}

