package map.hashmap;

import java.util.HashMap;
import java.util.Scanner;

/**
 * ��һ����5���NBA�ھ���ӵ�map����
 * 
 * Ҫ��: �������  ,��ȡ��Ӧ��ӵ�����
 * @author Administrator
 *
 */
public class Lianxi1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		
		map.put(2014, "��ţ");
		map.put(2015, "����");
		map.put(2016, "Сţ");
		map.put(2017, "��ʿ");
		map.put(2018, "ŦԼ");
		map.put(2019, "����");
		
		Scanner input = new Scanner(System.in);
		System.out.println("������һ�����");
		int nextInt = input.nextInt();
		
		if (map.containsKey(nextInt)) {
			String string = map.get(nextInt);
			System.out.println("��,��"+string);
		} else {
			System.out.println("û�и��������");
		}
	}
}
