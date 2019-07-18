package 作业改进;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Company  {
	
	Map<Integer,Employee> 员工 = new HashMap<>();
	Map<String,List<DakaInfo>> 打卡信息 = new HashMap<>();
	//key为签到日期
	
	public  Map<Integer, Employee> 新增人员(int ID,String name){
		
		员工.put(ID, new Employee(ID, name));
		return 员工;
	}
	
	
	public Map<Integer, Employee> 新增人员(){
		System.out.println("请输入新增员工ID");
		int ID = new Scanner(System.in).nextInt();
		System.out.println("请输入员工名字");
		String name = new Scanner(System.in).nextLine();
		员工.put(ID, new Employee(ID, name));
		System.out.println("正在新增员工...请稍等");
		System.out.println("成功新增\t"+name+"\t"+ID);
		return 员工;
	}
	
	public void 删除人员(){
		System.out.println("请输入你想删除的员工的ID");
		int ID = new Scanner(System.in).nextInt();
		System.out.println("成功删除"+员工.get(ID).getName()+"\t"+ID);
		员工.remove(ID);
	}
	
	public void 查找人员() {
		System.out.println("输入你想查找的人员的ID");
		int ID = new Scanner(System.in).nextInt();
		System.out.println("ID："+"\t"+"姓名\t"+员工.get(ID).getName());
	}
	
	public void 显示员工信息() {
		for (Map.Entry<Integer, Employee> map : 员工.entrySet()) {
			String id = map.getKey().toString();
			System.out.println("ID:\t"+id+
					"\t姓名\t"+map.getValue().getName());
		}
	}
	
	
	public void 签到方法() {
		Date date = new Date();
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
		String 签到日期 = sdfDate.format(date);
		String 签到时间 = sdfTime.format(date);
		
		System.out.println("请输入您的员工ID，签到");
		int ID = new Scanner(System.in).nextInt();
		if(!员工.containsKey(ID)) {
			System.out.println("不存在该员工！");
			return;
		}
		List<DakaInfo> 打卡列表 = null;
		if(!打卡信息.containsKey(签到日期)) {
			打卡列表 = new ArrayList();
			DakaInfo dk = new DakaInfo();
			String name = 员工.get(ID).getName();
			dk.setName(name);
			dk.set员工ID(ID);
			dk.set签到时间(签到时间);
			dk.set签退时间(" ");
			打卡列表.add(dk);
			打卡信息.put(签到日期,打卡列表 );
			System.out.println("签到成功，你是今天第一个打卡的人");
			System.out.println();
		}else {
			打卡列表 = 打卡信息.get(签到日期);
			
			
			//判断是否签过到
			boolean find = false;
			for (DakaInfo dakalist : 打卡列表) {
				if(dakalist.getName() == 员工.get(ID).getName()) {
					System.out.println("已经签过到");
					System.out.println();
					find = true;
					break;
				}
			}
			if(!find) {
				DakaInfo dk = new DakaInfo();
				dk.setName(员工.get(ID).getName());
				dk.set签到时间(签到时间);
				dk.set签退时间(" ");
				打卡列表.add(dk);
				System.out.println("签到成功");
				System.out.println();
			}
		}
	}
	
	public void 签退方法() {
		
		System.out.println("请输入您的员工ID,签退");
		int ID = new Scanner(System.in).nextInt();
		
		if(!员工.containsKey(ID)) {
			System.out.println("不存在该员工！");
			System.out.println();
			return;
		}
		Date date = new Date();
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
		String 签退日期 = sdfDate.format(date);
		String 签退时间 = sdfTime.format(date);
		
		if(!打卡信息.containsKey(签退日期)) {
			System.out.println("你没有签到，不可以签退");
			System.out.println();
		}else {
			
			List<DakaInfo> list = 打卡信息.get(签退日期);
			
			boolean find = false;
			for (DakaInfo dk : list) {
				if(dk.getName().equals(员工.get(ID).getName())) {
					dk.set签退时间(签退时间);
					find = true;
					System.out.println("签退成功");
					System.out.println();
					break;
				}
			}
			if(!find) {
				System.out.println("没签到，不可以签退");
				System.out.println();
			}
		}
	}
	public void 查看签到信息() {
		System.out.println("输入你要查询的日期“xxxx-xx-xx”的形式");
		String date = new Scanner(System.in).nextLine();
		System.out.println(date+"签到信息如下：");
		System.out.println("*******************************");
		List<DakaInfo> list = 打卡信息.get(date);
		for (DakaInfo dakaInfo : list) {
			System.out.println(dakaInfo);
		}
	}
	
	
}
