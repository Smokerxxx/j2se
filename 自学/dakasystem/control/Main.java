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
				System.out.println("������Ҫ����Ա����id");
				int id = input.nextInt();
				System.out.println("������Ҫ����Ա��������");
				String name = input.next();
				Employee temp = new Employee(id, name);
				empService.addEmployee(temp);	
				
				jiemian1();
				i=input.nextInt();
				break;
			case 3:
				System.out.println("������Ҫɾ��Ա����id");
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
		System.out.println("1.��ѯԱ���б�");
		System.out.println("2.����Ա��");
		System.out.println("3.ɾ��Ա��");
		System.out.println("4.�˳�");
		System.out.println("----------------------");
		System.out.println("��ѡ�����:");
	}
}
