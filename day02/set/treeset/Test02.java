package set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> tree = new TreeSet<String>(new MyCompare());
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
		
		
		for (String string : tree) {
			System.out.println(string);
		}            
	}

}
