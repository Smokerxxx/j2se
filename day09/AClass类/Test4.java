package AClass类;

import java.lang.reflect.Constructor;

/**
 *  Class类中 forName(); 通过传入一个字符串 ,  包 . 路径  ,得到一个类型
 *  
 *  再调用  c.newInstance() ;实例化对象
 *  
 *  在强制类型转换时 ,需要使用正确的类型强转 , 否则在编译或者运行阶段,会抛出异常
 *  java.lang.ClassCastException: AClass类.Person cannot be cast to AClass类.Computer
 *  类型转换异常 , 
 *  
 *  通常在定义类的时候 ,都有加入一个无参数构造器和若干个有参数构造  ,
 *  无参数构造器的作用 , 为了java反射时,使用newInstance()方法时使用的 .
 * @author Administrator
 *
 */
public class Test4 {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("AClass类.Person");//获取类的对象
			
			Constructor<?>[] constructors = c.getConstructors();//获取该类中所有的构造方法,并放在一个构造器的数组中
			
			for (Constructor<?> cons : constructors) {
				System.out.println(cons.getParameterCount());
			}
			
			
			Person p = (Person)constructors[1].newInstance("lisi",33);//利用构造器数组中索引2的构造器,并传入参数,实例化一个对象
			
			
			System.out.println(p.toString());  // 调用打印查看是否设置属性成功		
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
