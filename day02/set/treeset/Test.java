package set.treeset;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet �������(�Զ����˳��)  ,���ظ���  ���ݽṹ
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		
		// treeset Ĭ���������: ����ascii��ֵ  ������ǰ , ��д��ĸ   ,Сд��ĸ ��˳�� ,��������  , ����û���������
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
		
		tree.add("����");
		tree.add("����");
		tree.add("����");
		tree.add("����");
		
		for (String string : tree) {
			System.out.println(string);
		}              
	}

}
