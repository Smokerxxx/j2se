package string;

import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s ="      abc      ";
		
		s.trim(); // ȥ���ҿո�   ,����s����������Ȼ��"      abc      "
		s=s.trim();  // �ַ��������Ҫ�ı�  , ���Ҫ���븳ֵ����
		
		
		s.length();
		s.isEmpty();//��length==0ʱ  ,�ķ���true 
		if ("1111".equals(s)) { //���ж�����ʱ,Ҫ�ѳ�����ǰ��
			
		}
		
		
		if (null!=s) {
			
		}
		
		"ABCdefGh".equalsIgnoreCase(s); //���Դ�Сд���ж�
		
		s.toLowerCase();// ת��Сд
		s.toUpperCase();// ת����д
		
		s.toString();//�����ַ�������
		
		s.concat("def"); // ��������concat ,������ı�s  ,����Ҫ�ٸ�ֵ
		
		s.indexOf(".");//���ص�һ�γ���. ������λ��   , ���û���ҵ�����-1
		s.lastIndexOf("."); //�������һ�γ���.  ������λ��
		
		s.charAt(0); // ��������λ�õ��ַ�
		
		s.substring(0, 3) ; //[0,3)
		s.substring(0); // ������0��ʼ�����
		
		
		//�ַ����ṩ��һ��valueOf����  ,����ͬ�Ļ�����������ת��Ϊ�ַ���
		String valueOf = String.valueOf(1);
		
		String[] split = s.split(","); //   ����������ַ� ��ת�����ת��   \\
		
		System.out.println(s);
	}

}
