package list.自定义排序;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Test {

	// 定义接口类型   ,  相当于在定义标准  
	List<Student> list;
	
	public Test(){
		super();
		list = new ArrayList<Student>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//定义一个格式化日期的类
		try{
		Date date1 = new Date(sdf.parse("2000-01-01").getTime()); // 将一个字符串转换成对应日期
		Date date2 = new Date(sdf.parse("1999-10-01").getTime());
		Date date3 = new Date(sdf.parse("2001-05-01").getTime());
		Student student1 = new Student(1,"天一",date1);
		Student student2 = new Student(2,"张天一",date2);
		Student student3 = new Student(3,"李天一",date3);
		
		list.add(student2);
		list.add(student1);
		list.add(student3);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		
		// 循环展示了集合的默认顺序
//		for(int i =0; i<test.list.size();i++){
//			System.out.println(test.list.get(i).toString());
//		}
		
		
		
		//自定义一个按照学号升序的排列
//		Collections.sort(test.list,new Comparator<Student>() {
//			@Override
//			public int compare(Student stu1,Student stu2){
//				return stu1.getXuehao()-stu2.getXuehao(); //升序
//
////				return stu2.getXuehao()-stu1.getXuehao(); //降序
//			}
//		});
		
		
		

		
		
		//自定义一个按照出生日期升序的排列    
		Collections.sort(test.list,new Comparator<Student>() {
			@Override
			public int compare(Student stu1,Student stu2){
				return (int)(stu2.getBirthday().getTime()-stu1.getBirthday().getTime()); //升序
			}
		});
		
		for(int i =0; i<test.list.size();i++){
			System.out.println(test.list.get(i).toString());
		}
	}

}
