package list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʹ������ʱ, ����Ҫ��������ָ���������,��Ϊ�����кܶ����ⷽ��,�Ǹ��ӿ���û�е�,������Ҫʵ�����������ʹ��
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("1");
		linkedList.add("2");
		linkedList.add("3");
		linkedList.add("4");
		linkedList.add("5");
		
		//arraylist�� ��ʹ�õķ���  ,  linkedlistҲ������ 
		
		//�������еķ���,��Ҫ�����ڶ���βԪ�صĲ�����
		
		//��ȡ��βԪ��
		linkedList.getFirst();
		linkedList.getLast();
		
		
		//���
		linkedList.addFirst("99");
		linkedList.addLast("99");
		
		//ɾ��
		linkedList.removeFirst();
		linkedList.removeLast();
		
		
		// ������arraylist��ת��
		
		ArrayList<String> arraylist = new ArrayList<String>(linkedList);
		
		
		//arraylist ת  linkedlist
		
		LinkedList<String> linkedList2 = new LinkedList<String>(arraylist);
		
		// ����ת����
		String[] arrays = linkedList2.toArray(new String[linkedList2.size()]);
		
		// �������н�ȡ������ 
		List<String> subList = linkedList2.subList(2, 10);
		
		
	}

}
