package C反射调用方法;

import java.lang.reflect.Method;
/**
 * 访问get   set  这种方法  ,专门用于对属性的读写操作  
 * 
 * @author Administrator
 *
 */
public class Test2 {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("C反射调用方法.Person");
			
			Object o = c.newInstance();
			
			setter(o,"name","张三丰",String.class);
			setter(o,"age",123,int.class);
			
			
			System.out.println("刚才赋值的对象是:"+getter(o,"name")+" "+getter(o,"age"));
			
			o.toString();
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @param o 要操作的对象
	 * @param attr 要操作的属性名称
	 * @param value 要设置的内容
	 * @param type 要设置的属性类型
	 */
	public static void setter(Object o , String attr , Object value, Class<?> type){
		try {
			Method method = o.getClass().getMethod("set"+initStr(attr), type);
			method.invoke(o, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Object getter(Object o , String attr){
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
