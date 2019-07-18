package list.�Զ�������;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Test {

	// ����ӿ�����   ,  �൱���ڶ����׼  
	List<Student> list;
	
	public Test(){
		super();
		list = new ArrayList<Student>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//����һ����ʽ�����ڵ���
		try{
		Date date1 = new Date(sdf.parse("2000-01-01").getTime()); // ��һ���ַ���ת���ɶ�Ӧ����
		Date date2 = new Date(sdf.parse("1999-10-01").getTime());
		Date date3 = new Date(sdf.parse("2001-05-01").getTime());
		Student student1 = new Student(1,"��һ",date1);
		Student student2 = new Student(2,"����һ",date2);
		Student student3 = new Student(3,"����һ",date3);
		
		list.add(student2);
		list.add(student1);
		list.add(student3);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		
		// ѭ��չʾ�˼��ϵ�Ĭ��˳��
//		for(int i =0; i<test.list.size();i++){
//			System.out.println(test.list.get(i).toString());
//		}
		
		
		
		//�Զ���һ������ѧ�����������
//		Collections.sort(test.list,new Comparator<Student>() {
//			@Override
//			public int compare(Student stu1,Student stu2){
//				return stu1.getXuehao()-stu2.getXuehao(); //����
//
////				return stu2.getXuehao()-stu1.getXuehao(); //����
//			}
//		});
		
		
		

		
		
		//�Զ���һ�����ճ����������������    
		Collections.sort(test.list,new Comparator<Student>() {
			@Override
			public int compare(Student stu1,Student stu2){
				return (int)(stu2.getBirthday().getTime()-stu1.getBirthday().getTime()); //����
			}
		});
		
		for(int i =0; i<test.list.size();i++){
			System.out.println(test.list.get(i).toString());
		}
	}

}
