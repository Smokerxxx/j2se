package ��ҵ�Ľ�;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Company  {
	
	Map<Integer,Employee> Ա�� = new HashMap<>();
	Map<String,List<DakaInfo>> ����Ϣ = new HashMap<>();
	//keyΪǩ������
	
	public  Map<Integer, Employee> ������Ա(int ID,String name){
		
		Ա��.put(ID, new Employee(ID, name));
		return Ա��;
	}
	
	
	public Map<Integer, Employee> ������Ա(){
		System.out.println("����������Ա��ID");
		int ID = new Scanner(System.in).nextInt();
		System.out.println("������Ա������");
		String name = new Scanner(System.in).nextLine();
		Ա��.put(ID, new Employee(ID, name));
		System.out.println("��������Ա��...���Ե�");
		System.out.println("�ɹ�����\t"+name+"\t"+ID);
		return Ա��;
	}
	
	public void ɾ����Ա(){
		System.out.println("����������ɾ����Ա����ID");
		int ID = new Scanner(System.in).nextInt();
		System.out.println("�ɹ�ɾ��"+Ա��.get(ID).getName()+"\t"+ID);
		Ա��.remove(ID);
	}
	
	public void ������Ա() {
		System.out.println("����������ҵ���Ա��ID");
		int ID = new Scanner(System.in).nextInt();
		System.out.println("ID��"+"\t"+"����\t"+Ա��.get(ID).getName());
	}
	
	public void ��ʾԱ����Ϣ() {
		for (Map.Entry<Integer, Employee> map : Ա��.entrySet()) {
			String id = map.getKey().toString();
			System.out.println("ID:\t"+id+
					"\t����\t"+map.getValue().getName());
		}
	}
	
	
	public void ǩ������() {
		Date date = new Date();
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
		String ǩ������ = sdfDate.format(date);
		String ǩ��ʱ�� = sdfTime.format(date);
		
		System.out.println("����������Ա��ID��ǩ��");
		int ID = new Scanner(System.in).nextInt();
		if(!Ա��.containsKey(ID)) {
			System.out.println("�����ڸ�Ա����");
			return;
		}
		List<DakaInfo> ���б� = null;
		if(!����Ϣ.containsKey(ǩ������)) {
			���б� = new ArrayList();
			DakaInfo dk = new DakaInfo();
			String name = Ա��.get(ID).getName();
			dk.setName(name);
			dk.setԱ��ID(ID);
			dk.setǩ��ʱ��(ǩ��ʱ��);
			dk.setǩ��ʱ��(" ");
			���б�.add(dk);
			����Ϣ.put(ǩ������,���б� );
			System.out.println("ǩ���ɹ������ǽ����һ���򿨵���");
			System.out.println();
		}else {
			���б� = ����Ϣ.get(ǩ������);
			
			
			//�ж��Ƿ�ǩ����
			boolean find = false;
			for (DakaInfo dakalist : ���б�) {
				if(dakalist.getName() == Ա��.get(ID).getName()) {
					System.out.println("�Ѿ�ǩ����");
					System.out.println();
					find = true;
					break;
				}
			}
			if(!find) {
				DakaInfo dk = new DakaInfo();
				dk.setName(Ա��.get(ID).getName());
				dk.setǩ��ʱ��(ǩ��ʱ��);
				dk.setǩ��ʱ��(" ");
				���б�.add(dk);
				System.out.println("ǩ���ɹ�");
				System.out.println();
			}
		}
	}
	
	public void ǩ�˷���() {
		
		System.out.println("����������Ա��ID,ǩ��");
		int ID = new Scanner(System.in).nextInt();
		
		if(!Ա��.containsKey(ID)) {
			System.out.println("�����ڸ�Ա����");
			System.out.println();
			return;
		}
		Date date = new Date();
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
		String ǩ������ = sdfDate.format(date);
		String ǩ��ʱ�� = sdfTime.format(date);
		
		if(!����Ϣ.containsKey(ǩ������)) {
			System.out.println("��û��ǩ����������ǩ��");
			System.out.println();
		}else {
			
			List<DakaInfo> list = ����Ϣ.get(ǩ������);
			
			boolean find = false;
			for (DakaInfo dk : list) {
				if(dk.getName().equals(Ա��.get(ID).getName())) {
					dk.setǩ��ʱ��(ǩ��ʱ��);
					find = true;
					System.out.println("ǩ�˳ɹ�");
					System.out.println();
					break;
				}
			}
			if(!find) {
				System.out.println("ûǩ����������ǩ��");
				System.out.println();
			}
		}
	}
	public void �鿴ǩ����Ϣ() {
		System.out.println("������Ҫ��ѯ�����ڡ�xxxx-xx-xx������ʽ");
		String date = new Scanner(System.in).nextLine();
		System.out.println(date+"ǩ����Ϣ���£�");
		System.out.println("*******************************");
		List<DakaInfo> list = ����Ϣ.get(date);
		for (DakaInfo dakaInfo : list) {
			System.out.println(dakaInfo);
		}
	}
	
	
}
