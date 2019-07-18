package AClass��;

/**
 *  Class���� forName(); ͨ������һ���ַ��� ,  �� . ·��  ,�õ�һ������
 *  
 *  �ٵ���  c.newInstance() ;ʵ��������
 *  
 *  ��ǿ������ת��ʱ ,��Ҫʹ����ȷ������ǿת , �����ڱ���������н׶�,���׳��쳣
 *  java.lang.ClassCastException: AClass��.Person cannot be cast to AClass��.Computer
 *  ����ת���쳣 , 
 *  
 *  ͨ���ڶ������ʱ�� ,���м���һ���޲��������������ɸ��в�������  ,
 *  �޲��������������� , Ϊ��java����ʱ,ʹ��newInstance()����ʱʹ�õ� .
 * @author Administrator
 *
 */
public class Test3 {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("AClass��.Person");//��ȡ��Ķ���
			
//			Computer p = (Computer)c.newInstance();//ͨ�������,ʵ�������� ,ת���ɷ��ϸ����͵���
			Person p = (Person)c.newInstance();// newInstance()ʱ,�൱�ڵ���Person�е��޲���������
			
			p.setName("zhangsan");  //����set������������ֵ
			p.setAge(23);
			
			System.out.println(p.toString());  // ���ô�ӡ�鿴�Ƿ��������Գɹ�
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
