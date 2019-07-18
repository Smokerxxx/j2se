package 作业;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Company company = new Company();
		
//		Employee em1 = new Employee(00001, "张三");
//		Employee em2 = new Employee(00002, "李四");
//		Employee em3 = new Employee(00003, "王五");
//		Employee em4 = new Employee(00004, "石头");
//		Employee em5 = new Employee(00005, "鸡蛋");
		
		company.新增人员("张三", 0001);
		company.新增人员("李四", 0002);
		company.新增人员("王五", 0003);
		company.新增人员("石头", 0004);
		company.新增人员("鸡蛋", 0005);
		
		System.out.println("新增人员成功！");
		System.out.println("*****************");
		System.out.println("欢迎来到neue打卡系统");
		System.out.println("*****************");
		
		
		boolean flag = true;
		while(flag) {
		System.out.println("输入0-----退出");
		System.out.println("输入1-----签到");
		System.out.println("输入2-----签退");
		System.out.println("输入3-----查看签到信息");
		
		int input = new Scanner(System.in).nextInt();
		switch(input) {
//		case 0:
//			flag = false;
//			break;
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
				flag = false;
				System.out.println("已经退出系统，谢谢您的使用");
				break;
			
		}
			
		}
	}
}
