package json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
/**
 * json �ȿ���ת����������  , ������ת��  Object  ,List  ��  Map
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		School c= new School();
		c.schoolname="������ѧ";
		
		 PC pc = new PC();
		 pc.pinpai="����";
		 pc.yanse="black";
		 pc.price=5000;
		 
		 PC pc2 = new PC();
		 pc2.pinpai="Inter";
		 pc2.yanse="white";
		 pc2.price=6000;
		 
		 Person p1 = new Person();
		 p1.name="���޼�";
		 p1.notebook=pc;
		 p1.School=c;
		 
		 Person p2 = new Person();
		 p2.name="����";
		 p2.notebook=pc2;
		 p2.School=c;
//		 System.out.println("jsonת����");
//		 String p1_json = JSON.toJSONString(p1);   // jsonת����
//		 System.out.println(p1_json);
//		 
		 ArrayList<Person> arrayList = new ArrayList<Person>();
		 arrayList.add(p1);
		 arrayList.add(p2);
		 c.setPersons(arrayList);
		 
		 System.out.println("jsonתlist");
		 String school_json = JSON.toJSONString(c);  //jsonתlist
		 System.out.println(school_json);
//		 
//		 
//		 Map<String,List<Person>> banji = new HashMap<String ,List<Person>>();
//		 
//		 banji.put("java02", arrayList);// json���ܵ���תlist  ,list��Ҫ��һ����Ӧ��keyֵ,����ת��
//		 
//		 String json_map = JSON.toJSONString(banji);
//		 System.out.println(json_map);
	}
}
