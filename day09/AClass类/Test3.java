package AClass类;

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
public class Test3 {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("AClass类.Person");//获取类的对象
			
//			Computer p = (Computer)c.newInstance();//通过类对象,实例化该类 ,转换成符合该类型的类
			Person p = (Person)c.newInstance();// newInstance()时,相当于调用Person中的无参数构造器
			
			p.setName("zhangsan");  //调用set方法设置属性值
			p.setAge(23);
			
			System.out.println(p.toString());  // 调用打印查看是否设置属性成功
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
