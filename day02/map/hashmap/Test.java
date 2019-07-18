package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 * hashmap 中  key: value 的形式 
 * 
 * 其中key 是不能重复的   , 
 * value是可以重复的   
 * 
 * 通常 key的类型一般选择 Integer 或者 String 比较简单的类型
 * value的数据类型就可以很复杂
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

		// 增 或者修改  都是  put
		map.put("US", "美国");
		map.put("US", "美利坚"); //如果key值相同 , 会产生覆盖效果  ,间接的实现修改操作
		
		map.put("RS", "俄罗斯");
		map.put("CHN", "中华人民共和国");
		
		//map的循环  ,需要用到迭代器 Iterator
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			
			String string2 = map.get(key);
			
			System.out.println("key:"+key+"     value:"+string2);
			
		}
		
		
		//增强for循环实现map的遍历
		for (Map.Entry<String, String> i : map.entrySet()) {
			System.out.println(i.getKey()+i.getValue());
		}
		
	}

}
