package test03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestUp {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		//����ת��  , ��������ָ���������
		Pet p = new Dog();
		Pet p2 = new Cat();
		List list = new  LinkedList<>();
		
//		�����p �� list  ���Ե��� List�ӿ��ж�������з���  , ���ù�����ʵ����ʹ��������д��ķ���
		
		//����ת��  �� �����Ҫ�ٵ�������ķ���ʱ,����Ҫ����ת��   ,����ת����Ҫ��ǰ�ж��Ƿ���ϸ��������� ,Ȼ����ת��
		if (p instanceof Dog) {
			 Dog d =  (Dog)p;
			 d.careHome();
		} else if(p instanceof Cat) {
			Cat c = (Cat)p;
			c.catchMouse();
		}
		
		Master master = new Master();
//		Pet xinchongwu = master.lingyao("cat");
//		xinchongwu.eat();
		
		master.food(p);
		master.food(p2);
		master.food(dog);
		
		//��̬   : �����Ķ�̬  ; ����ֵ�Ķ�̬ ; ���ض�̬ ; ��д��̬ ; ��̬������ת�� ; ��̬������ת��;
	}
}
