package Date;

import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		
		//��ӡ��ǰʱ��
		Date d1 = new Date();
		System.out.println("��ǰʱ��"+ d1.toString());
		
		
		Date d2 = new Date(0);
		System.out.println("��0��Ϊ�������ʱ�õ�������"+d2);
		
		//getTime() �õ�һ��long�͵�����
        //����������� 1970.1.1 08:00:00:000��ÿ����һ���룬����1
		System.out.println("��getTime()��ȡʱ��"+ d1.getTime());
	}
}
