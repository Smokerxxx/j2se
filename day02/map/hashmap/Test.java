package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 * hashmap ��  key: value ����ʽ 
 * 
 * ����key �ǲ����ظ���   , 
 * value�ǿ����ظ���   
 * 
 * ͨ�� key������һ��ѡ�� Integer ���� String �Ƚϼ򵥵�����
 * value���������;Ϳ��Ժܸ���
 * <String,Student>
 * <String,List<Student>>
 * <Integer,HashMap<String,List<Student>>>
 * 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String,String>();

		// �� �����޸�  ����  put
		map.put("US", "����");
		map.put("US", "������"); //���keyֵ��ͬ , ���������Ч��  ,��ӵ�ʵ���޸Ĳ���
		
		map.put("RS", "����˹");
		map.put("CHN", "�л����񹲺͹�");
		
		//map��ѭ��  ,��Ҫ�õ������� Iterator
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			
			String string2 = map.get(key);
			
			System.out.println("key:"+key+"     value:"+string2);
			
		}
		
		
		//��ǿforѭ��ʵ��map�ı���
		for (Map.Entry<String, String> i : map.entrySet()) {
			System.out.println(i.getKey()+i.getValue());
		}
		
	}

}
