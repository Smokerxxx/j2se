package AClass��;

import java.lang.reflect.Constructor;

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
public class Test4 {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("AClass��.Person");//��ȡ��Ķ���
			
			Constructor<?>[] constructors = c.getConstructors();//��ȡ���������еĹ��췽��,������һ����������������
			
			for (Constructor<?> cons : constructors) {
				System.out.println(cons.getParameterCount());
			}
			
			
			Person p = (Person)constructors[1].newInstance("lisi",33);//���ù���������������2�Ĺ�����,���������,ʵ����һ������
			
			
			System.out.println(p.toString());  // ���ô�ӡ�鿴�Ƿ��������Գɹ�		
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
