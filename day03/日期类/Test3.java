package ������;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String format = sdf.format(new Date());  // ������ת����һ���ַ���
		System.out.println(format);
		
		
		
		try {
			Date ����ʱ�� = sdf.parse("2019-07-10 16:12:30");// ���ַ���ת����һ����������
			
			Calendar ��ǰ���� = Calendar.getInstance();
			
			while (��ǰ����.getTime().before(����ʱ��)) {
				//���������������ʱ��֮ǰ  ,����whileѭ����
				
				��ǰ���� = Calendar.getInstance();//��ǰʱ��Ҫ��ʱ��ֵ  ,��Ϊѭ���жϵ�����
				
				System.out.println(sdf.format(��ǰ����.getTime()));
			}
			System.out.println("������");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
