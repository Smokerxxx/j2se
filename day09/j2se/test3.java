package j2se;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class test3 {
	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("j2se.Person");
			
			Class<?>[] interfaces = c.getInterfaces();
			for (Class<?> class1 : interfaces) {
				System.out.println("接口:"+class1.getName());
			}
			
			Class<?> superclass = c.getSuperclass();
			System.out.println("父类:"+superclass.getName());
			
			Constructor<?>[] constructors = c.getConstructors();
			System.out.println("展示构造方法:");
			for (Constructor<?> constructor : constructors) {
				System.out.print(Modifier.toString(constructor.getModifiers()));
				System.out.print(constructor.getName()+"(");
				Class<?>[] parameterTypes = constructor.getParameterTypes();
				for (int i = 0; i < parameterTypes.length; i++) {
					if(i == parameterTypes.length-1) {
						System.out.println(parameterTypes[i].getName()+" arg"+i);
					}else {
						System.out.println(parameterTypes[i].getName()+" arg"+i+",");
					}
				}System.out.println("){}");
				System.out.println();
			}
			
			System.out.println("本类中的属性是:");
			Field[] declaredFields = c.getDeclaredFields();
			for (int i = 0; i < declaredFields.length; i++) {
				String type = declaredFields[i].getType().getName();
				System.out.println(Modifier.toString(declaredFields[i].getModifiers())+"  "+type+"  "+declaredFields[i].getName());
				System.out.println();
			}
			System.out.println("父类或者接口中的属性是:");
			Field[] fields = c.getFields(); //获取父类中的属性
			for (int i = 0; i < fields.length; i++) {
				String type = fields[i].getType().getName();
				System.out.println(Modifier.toString(fields[i].getModifiers())+"  "+type+"  "+fields[i].getName());
				System.out.println();
			}
			
			System.out.println("本类中的方法");
			Method[] declaredMethods = c.getDeclaredMethods();
			for (int i = 0; i < declaredMethods.length; i++) {
				System.out.println(Modifier.toString(declaredFields[i].getModifiers())+"  "+declaredFields[i].getType().getName()+"  "
			+declaredFields[i].getName()+"( ");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
