package ��ֵ���͸�ʽ����;

import java.text.DecimalFormat;
/**
 * 		// SimpleDateFormat   ʱ��ĸ�ʽ����  
		
		// DecimalFormat      ��ֵ�ĸ�ʽ����
 * @author Administrator
 *
 */
public class Test01 {

	/**
	 * 
	 * @param param1  -Ҫ��ʽ��������
	 * @param param2  -Ҫ��ʽ������ֵ
	 */
	public static void ��ʽ��������ֵ����(String param1, double param2){
		DecimalFormat df = new DecimalFormat(param1);
		String format = df.format(param2);
		System.out.println("use "+param1+":"+param2+",is "+format);
	}
	
	public static void main(String[] args) {

		//Test01.��ʽ��������ֵ����("###,###.##", 1234.235567);//#��ʾȱʡʱ����ʾ,���ʱҲ��Ӱ��ԭֵ
//		Test01.��ʽ��������ֵ����("000,000.00", 1234567);// 0��ʾû�оͻᲹ0����
		Test01.��ʽ��������ֵ����("$000.00", 12345.67); // ��Ԫ����  ������ҷ��Ŷ�������ʾ��java������
		Test01.��ʽ��������ֵ����("00.00%", 0.036); //% ��ʾ�Ը���*100 ,�ٽ�%��
		Test01.��ʽ��������ֵ����("00.00\u2030", 0.036);// \u2030��ʾ�Ը���*1000 ,�ٽӡ��

	}

}
