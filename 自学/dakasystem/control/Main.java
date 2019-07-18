package dakasystem.control;

import java.util.List;
import java.util.Scanner;

import dakasystem.service.EmpService;
import dakasystem.entity.Employee;

public class Main {
	public static void main(String[] args) {
		EmpService empService = new EmpService();
		Scanner input = new Scanner(System.in);
		jiemian1();
		int i = input.nextInt();
		boolean flag = true;
		while(flag){
			switch (i) {
			case 1:
				List<Employee> list = empService.chaxunyonghuliebiao();
				for (int j = 0; j < list.size(); j++) {
					System.out.println(list.get(j).toString());
				}
				
				jiemian1();
				i=input.nextInt();
				break;
			case 2:
				System.out.println("请输入要增加员工的id");
				int id = input.nextInt();
				System.out.println("请输入要增加员工的姓名");
				String name = input.next();
				Employee temp = new Employee(id, name);
				empService.addEmployee(temp);	
				
				jiemian1();
				i=input.nextInt();
				break;
			case 3:
				System.out.println("请输入要删除员工的id");
				int delid = input.nextInt();
				empService.shanchuEmp(delid);
				
				jiemian1();
				i=input.nextInt();
				break;
			default:
				flag= false;
				break;
			}
		}
	}
	

	private static void jiemian1(){
		System.out.println("----------------------");
		System.out.println("1.查询员工列表");
		System.out.println("2.增加员工");
		System.out.println("3.删除员工");
		System.out.println("4.退出");
		System.out.println("----------------------");
		System.out.println("请选择序号:");
	}
}
