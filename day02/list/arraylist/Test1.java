package list.arraylist;

import java.util.ArrayList;
import java.util.List;

import k1������.Dog;
/**
 * arraylist  ��  linkedlist ������һ��˳��(����˳��),�����ظ������ݽṹ
 * @author Administrator
 *
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//jdk1.5 ����
		List list = new ArrayList();
		
		List<String> lst = new ArrayList<String>();
		
		List<Dog> dogs = new ArrayList<Dog>();
		
		
		Dog dog1 = new Dog("���","��������");
		Dog dog2 = new Dog("���2","��������");
		Dog dog3 = new Dog("���3","��������");
		Dog dog4 = new Dog("���4","��������");
		
		// ���� :�����Ķ�����   ����
		dogs.add(dog1);
		dogs.add(0, dog2);
		
		dogs.size();
		
		for (int i = 0; i < dogs.size(); i++) {
			System.out.println(dogs.get(i).getName());
		}
		
		//��ǿforѭ��  , û����ȡ����      ��ѯ
		for (Dog dog : dogs) {
			System.out.println(dog.getStrain());
		}
		
		
		// �޸�
		dogs.set(0, dog3);
		
		// ɾ��
		dogs.remove(0);
		dogs.remove(dog1);
		
		// �Ƿ���� 
		if (dogs.contains(dog4)) {
			//...
		}
		
		
		//һ������ռ���
		dogs.clear();
		
		
		// ��ȡԪ���ڼ����е�����ֵ
		dogs.indexOf(dog1);  // ��һ�γ��ֵ�����λ��
		dogs.lastIndexOf(dog1);// ���һ�γ��ֵ�����λ��
		
		
		// �жϼ����Ƿ�Ϊ��
		if (dogs.isEmpty()) {
			
		}
		
		
		// �򼯺��м����Ӽ���  , ǰ�� :�������ϵ���������Ҫһ��
		List<Dog> dogs_son = new ArrayList<Dog>();
		dogs_son.add(dog4);
		dogs.addAll(dogs_son);//Ĭ������֮ǰ���ϵ����,�����¼���
		dogs.addAll(0, dogs_son);//���Խ����Ӽ����뵽���ϵ���ǰ��
		
		//�ж�һ�������Ƿ������һ���Ӽ�  , ȫ������ ����true
		if (dogs.containsAll(dogs_son)) {
			dogs.removeAll(dogs_son);  // ���ȫ������ , �ͰѰ�������������ɾ��
		}
		
		
	}

}
