package B反射获取类的结构;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test1 {

	public static void main(String[] args) {
		
		try {
			Class<?> c = Class.forName("B反射获取类的结构.Person");
			
			//获取某个类的接口方法  ,返回一个Class<?>[]  数组形式 , 因为多实现,所以需要数组, 还因为接口是特殊的类,所以是Class的
			Class<?>[] interfaces = c.getInterfaces();//获取该类所有的接口
			
			for (Class<?> f : interfaces) {
				System.out.println("接口:"+f.getName());
			}
			
			//返回一个Class<?>类   ,因为java是单继承  , 如果没有显示的继承某个类,父类都是Object类
			Class<?> superclass = c.getSuperclass();
			System.out.println("父类:"+superclass.getName());
			
			//返回构造方法的数组  , 是构造器的类型
			Constructor<?>[] constructors = c.getConstructors();
			
			//循环构造器数组  ,查看构造器类中的各种方法
			System.out.println("展示构造方法:");
			for (Constructor<?> cons : constructors) {
				Class<?>[] parameterTypes = cons.getParameterTypes();//得到构造器的全部参数
				
				
				System.out.print(Modifier.toString(cons.getModifiers()));//得到访问权限   public  private
				System.out.print(cons.getName()+"(");//方法名称
				for (int j =0; j<parameterTypes.length;j++) {
					if (j==parameterTypes.length-1) {
						System.out.println(parameterTypes[j].getName()+" arg"+j);
					}else{
						System.out.println(parameterTypes[j].getName()+" arg"+j+",");
					}
					
				}
				System.out.println("){}");
				System.out.println();
			}
			
			System.out.println("本类中的属性是:");
			//反射获取本类中属性  
			Field[] declaredFields = c.getDeclaredFields();
			for (int i = 0; i < declaredFields.length; i++) {
				Class<?> type = declaredFields[i].getType();
				int mo = declaredFields[i].getModifiers();
				String string = Modifier.toString(mo); // 将访问权限的数值转换成具体的修饰符名称
				System.out.print( string + " "+ type.getName() +" "+declaredFields[i].getName()+";");
				System.out.println();
			}
			
			
			Field[] fields = c.getFields(); //获取父类中的属性
			
			System.out.println("父类或者接口中的属性是:");
			for (int i = 0; i < fields.length; i++) {
				Class<?> type = fields[i].getType();
				int mo = fields[i].getModifiers();
				String string = Modifier.toString(mo); // 将访问权限的数值转换成具体的修饰符名称
				System.out.print( string + " "+ type.getName() +" "+fields[i].getName()+";");
				System.out.println();
			}
			
			//反射获取方法的结构
			
			System.out.println("本类中的方法");
			Method[] declaredMethods = c.getDeclaredMethods();
			for (int i = 0; i < declaredMethods.length; i++) {
				int modifiers = declaredMethods[i].getModifiers();
				String string = Modifier.toString(modifiers);
				
				Class<?> returnType = declaredMethods[i].getReturnType();
				String returnTypeStr = returnType.getName();
				
				String methodName = declaredMethods[i].getName();
				
				Class<?>[] pts = declaredMethods[i].getParameterTypes();
				String params="";
				for (int j = 0; j < pts.length; j++) {
					if (j==pts.length-1) {
						params = pts.toString();
					} else {
						params = pts.toString()+",";
					}
				}
				
				System.out.print(string+" "+returnTypeStr+" "+methodName+"("+params+")");
				System.out.println();
			}
			
			
			System.out.println("父类和接口以及自身的所有方法");
			Method[] methods = c.getMethods();// 能打印到Object类中 以及父类 和接口 和自身的所有方法
			for (int i = 0; i < methods.length; i++) {
				int modifiers = methods[i].getModifiers();
				String string = Modifier.toString(modifiers);
				
				Class<?> returnType = methods[i].getReturnType();
				String returnTypeStr = returnType.getName();
				
				String methodName = methods[i].getName();
				
				Class<?>[] pts = methods[i].getParameterTypes();
				String params="";
				for (int j = 0; j < pts.length; j++) {
					if (j==pts.length-1) {
						params = pts.toString();
					} else {
						params = pts.toString()+",";
					}
				}
				
				System.out.print(string+" "+returnTypeStr+" "+methodName+"("+params+")");
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
