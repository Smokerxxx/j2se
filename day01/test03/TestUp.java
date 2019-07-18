package test03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestUp {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		//向上转型  , 父类引用指向子类对象
		Pet p = new Dog();
		Pet p2 = new Cat();
		List list = new  LinkedList<>();
		
//		上面的p 和 list  可以调用 List接口中定义的所有方法  , 调用过程中实际是使用子类重写后的方法
		
		//向下转型  是 如果需要再调用子类的方法时,才需要向下转型   ,向下转型需要提前判断是否符合该数据类型 ,然后再转型
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
		
		//多态   : 参数的多态  ; 返回值的多态 ; 重载多态 ; 重写多态 ; 多态的向上转型 ; 多态的向下转型;
	}
}
