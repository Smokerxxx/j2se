package C反射调用方法;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		
		FileInput fileInput = new FileInput();
		
		Class<?> c = Class.forName("C反射调用方法.Students");
		Object object1 =  c.newInstance();
		Object object2= c.newInstance();
		Object object3 =  c.newInstance();
		
		setter(object1,"name","张三",String.class);
		setter(object2,"name","李四",String.class);
		setter(object3,"name","王五",String.class);
		
		setter(object1,"age",11,int.class);
		setter(object2,"age",12,int.class);
		setter(object3,"age",13,int.class);
		
		setter(object1,"grade",99,double.class);
		setter(object2,"grade",98,double.class);
		setter(object3,"grade",97,double.class);
		
		
		List<Object> list = new ArrayList<>();
		list.add(object1);
		list.add(object2);
		list.add(object3);
		
		fileInput.writer2FileByDelete("Student.txt", list);
	}
	
	public static void setter(Object o, String attr, Object value, Class<?> type) {
		try {
			Method method = o.getClass().getMethod("set"+initStr(attr), type);
			method.invoke(o, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Object getter(Object o, String attr) {
		try {
			Method method = o.getClass().getMethod("get"+initStr(attr));
			Object invoke = method.invoke(o);
			return invoke;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private static String initStr(String attr){
		String s = attr.substring(0,1).toUpperCase()+attr.substring(1);
		return s;
	}
}
