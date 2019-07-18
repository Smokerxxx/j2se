package list.arraylist;

import java.util.ArrayList;
import java.util.List;

import k1宠物类.Dog;
/**
 * arraylist  和  linkedlist 都是有一定顺序(插入顺序),允许重复的数据结构
 * @author Administrator
 *
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//jdk1.5 泛型
		List list = new ArrayList();
		
		List<String> lst = new ArrayList<String>();
		
		List<Dog> dogs = new ArrayList<Dog>();
		
		
		Dog dog1 = new Dog("点点","拉布拉多");
		Dog dog2 = new Dog("点点2","拉布拉多");
		Dog dog3 = new Dog("点点3","拉布拉多");
		Dog dog4 = new Dog("点点4","拉布拉多");
		
		// 重载 :方法的多样性   增加
		dogs.add(dog1);
		dogs.add(0, dog2);
		
		dogs.size();
		
		for (int i = 0; i < dogs.size(); i++) {
			System.out.println(dogs.get(i).getName());
		}
		
		//增强for循环  , 没法获取索引      查询
		for (Dog dog : dogs) {
			System.out.println(dog.getStrain());
		}
		
		
		// 修改
		dogs.set(0, dog3);
		
		// 删除
		dogs.remove(0);
		dogs.remove(dog1);
		
		// 是否包含 
		if (dogs.contains(dog4)) {
			//...
		}
		
		
		//一次性清空集合
		dogs.clear();
		
		
		// 获取元素在集合中的索引值
		dogs.indexOf(dog1);  // 第一次出现的索引位置
		dogs.lastIndexOf(dog1);// 最后一次出现的索引位置
		
		
		// 判断集合是否为空
		if (dogs.isEmpty()) {
			
		}
		
		
		// 向集合中加入子集合  , 前提 :两个集合的数据类型要一致
		List<Dog> dogs_son = new ArrayList<Dog>();
		dogs_son.add(dog4);
		dogs.addAll(dogs_son);//默认是在之前集合的最后,插入新集合
		dogs.addAll(0, dogs_son);//可以将该子集插入到集合的最前面
		
		//判断一个集合是否包含另一个子集  , 全部包含 返回true
		if (dogs.containsAll(dogs_son)) {
			dogs.removeAll(dogs_son);  // 如果全部包含 , 就把包含的所有内容删除
		}
		
		
	}

}
