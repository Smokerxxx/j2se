package AClass��;
/**
 * Class���� forName(); ͨ������һ���ַ��� ,  �� . ·��  ,�õ�һ������
 * @author Administrator
 *
 */
public class Test2 {

	public static void main(String[] args) {
		Class<?> c1 = null;
		
		try {
			c1 = Class.forName("AClass��.A");
			
			System.out.println(c1.getClass().getName());

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
