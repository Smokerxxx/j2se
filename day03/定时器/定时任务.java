package ��ʱ��;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;
/**
 * TimerTask ������ʱ�������  ,�̳и��� , ����дrun���� , run�����ж���������Ҫ��������
 * 
 * Timer  �Ƕ�ʱ����   , ÿ�������ʱ�� , ���� �ö�ʱ����  , ִ��run����
 * @author Administrator
 *
 */
public class ��ʱ���� extends TimerTask {

	@Override
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(new Date());  // ������ת����һ���ַ���
		System.out.println(format);
	}

}
