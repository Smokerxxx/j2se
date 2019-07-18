package AClass类;
/**
 * Class类中 forName(); 通过传入一个字符串 ,  包 . 路径  ,得到一个类型
 * @author Administrator
 *
 */
public class Test2 {

	public static void main(String[] args) {
		Class<?> c1 = null;
		
		try {
			c1 = Class.forName("AClass类.A");
			
			System.out.println(c1.getClass().getName());

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
