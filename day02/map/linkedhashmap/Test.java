package map.linkedhashmap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import set.treeset.MyCompare;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���ղ���map�е�˳�� , ��ʾ��map
		LinkedHashMap<String, List<String>> map = new LinkedHashMap<String,List<String>>();
		
		// ����ascii���˳�� ,��ʾ��map�е�Ԫ��
		TreeMap<Object, Object> treeMap = new TreeMap<>();
		
		List<String> citys_liaoning = new ArrayList<String>();
		citys_liaoning.add("sy");
		citys_liaoning.add("dl");
		citys_liaoning.add("fs");
		
		List<String> citys_hehei = new ArrayList<String>();
		citys_hehei.add("sjz");
		citys_hehei.add("cz");
		citys_hehei.add("lx");
		
		map.put("�ӱ�", citys_hehei);
		map.put("����", citys_liaoning);
		
		
		
		for (Map.Entry<String, List<String>>  i  : map.entrySet()) {
			System.out.println( i.getKey() );
			List<String> value = i.getValue();
			// .. ѭ��list����
		}
		
	}

}
