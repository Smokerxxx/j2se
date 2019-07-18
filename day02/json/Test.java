package json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
/**
 * json 既可以转换基本类型  , 还可以转换  Object  ,List  和  Map
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		School c= new School();
		c.schoolname="东北大学";
		
		 PC pc = new PC();
		 pc.pinpai="三星";
		 pc.yanse="black";
		 pc.price=5000;
		 
		 PC pc2 = new PC();
		 pc2.pinpai="Inter";
		 pc2.yanse="white";
		 pc2.price=6000;
		 
		 Person p1 = new Person();
		 p1.name="张无忌";
		 p1.notebook=pc;
		 p1.School=c;
		 
		 Person p2 = new Person();
		 p2.name="赵敏";
		 p2.notebook=pc2;
		 p2.School=c;
//		 System.out.println("json转对象");
//		 String p1_json = JSON.toJSONString(p1);   // json转对象
//		 System.out.println(p1_json);
//		 
		 ArrayList<Person> arrayList = new ArrayList<Person>();
		 arrayList.add(p1);
		 arrayList.add(p2);
		 c.setPersons(arrayList);
		 
		 System.out.println("json转list");
		 String school_json = JSON.toJSONString(c);  //json转list
		 System.out.println(school_json);
//		 
//		 
//		 Map<String,List<Person>> banji = new HashMap<String ,List<Person>>();
//		 
//		 banji.put("java02", arrayList);// json不能单独转list  ,list需要有一个对应的key值,才能转换
//		 
//		 String json_map = JSON.toJSONString(banji);
//		 System.out.println(json_map);
	}
}
