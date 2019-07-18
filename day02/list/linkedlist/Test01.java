package list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用链表时, 不需要父类引用指向子类对象,因为链表中很多特殊方法,是父接口中没有的,所以需要实例化自身才能使用
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("1");
		linkedList.add("2");
		linkedList.add("3");
		linkedList.add("4");
		linkedList.add("5");
		
		//arraylist里 能使用的方法  ,  linkedlist也都能用 
		
		//自身特有的方法,主要体现在对首尾元素的操作上
		
		//获取首尾元素
		linkedList.getFirst();
		linkedList.getLast();
		
		
		//添加
		linkedList.addFirst("99");
		linkedList.addLast("99");
		
		//删除
		linkedList.removeFirst();
		linkedList.removeLast();
		
		
		// 链表与arraylist的转换
		
		ArrayList<String> arraylist = new ArrayList<String>(linkedList);
		
		
		//arraylist 转  linkedlist
		
		LinkedList<String> linkedList2 = new LinkedList<String>(arraylist);
		
		// 链表转数组
		String[] arrays = linkedList2.toArray(new String[linkedList2.size()]);
		
		// 从链表中截取子链表 
		List<String> subList = linkedList2.subList(2, 10);
		
		
	}

}
