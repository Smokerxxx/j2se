package set.treeset;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet 是有序的(自定义的顺序)  ,不重复的  数据结构
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		
		// treeset 默认排序规则: 按照ascii码值  数字在前 , 大写字母   ,小写字母 的顺序 ,升序排列  , 中文没有排序规则
		Set<String> tree = new TreeSet<String>();
		tree.add("9");
		tree.add("1");
		tree.add("1");
		tree.add("1");
		
		tree.add("a");
		tree.add("aa");
		tree.add("b");
		tree.add("bb");
		
		tree.add("A");
		tree.add("AA");
		tree.add("B");
		tree.add("BB");
		
		tree.add("张三");
		tree.add("李四");
		tree.add("王五");
		tree.add("赵六");
		
		for (String string : tree) {
			System.out.println(string);
		}              
	}

}
