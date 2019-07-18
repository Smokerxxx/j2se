package j2se;

import java.lang.reflect.Constructor;

public class test2 {
	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("j2se.test1");
			
			Constructor<?>[] constructors = c.getConstructors();
			for (Constructor<?> constructor : constructors) {
				System.out.println(constructor.getParameterCount());
			}
			test1 o = (test1)constructors[1].newInstance("sss",22);
		
			
			System.out.println(o.getId()+"\t"+o.getName());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
