package C反射调用方法;

import java.lang.reflect.Method;
/**
 * 访问普通的public方法   , 可以传入参数和无参数
 * @author Administrator
 *
 */
public class Test1 {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("C反射调用方法.Person");
			
			//反射调用无参数方法
			Method method = c.getMethod("sayHanYu");// 得到某个方法的对象	
			method.invoke(c.newInstance()); //调用invoke() 执行方法  ,参数1表示哪个类,
			

			//反射调用有参数方法
			Method method4 = c.getMethod("sayHello", String.class,int.class);
			method4.invoke(c.newInstance(), "李天一",30); //参数要与上面对应上
			
			
			//反射调用无参数方法  访问权限是private时
//			Method method2 = c.getMethod("sayMinZu");//获取的是类的所有共有方法，这就包括自身的所有public方法，和从基类继承的、从接口实现的所有public方法
//			Method method3 = c.getDeclaredMethod("sayMinZu");//获取的是类自身声明的所有方法，包含public、protected和private方法
//			method2.invoke(c.newInstance());//因为sayMinZu是私有方法不能对外访问,所以第16行会抛出异常NoSuchMethodException
//			method3.invoke(c.newInstance());//因为sayMinZu是私有方法不能对外访问,所以第19行会抛出异常IllegalAccessException(安全权限异常)
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
