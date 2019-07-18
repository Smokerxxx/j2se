package set.hashset;

import java.util.HashSet;
import java.util.Set;

import k1宠物类.Dog;
/**
 * set 集合的特点  :  不重复(hashcode值不同 ,就是不重复的)  , 无序性 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		
		Set<Dog> hashset =  new HashSet<Dog>();
		
		Dog dog1 = new Dog("点点3","拉布拉多");
		Dog dog2 = dog1;
		Dog dog3 = new Dog("点点1","拉布拉多");
		
		
		System.out.println(dog1.hashCode() +"   "+dog2.hashCode());
		System.out.println(dog1.hashCode() +"   "+dog3.hashCode());
		hashset.add(dog1);
		hashset.add(dog2);
		hashset.add(dog3);
		
		System.out.println(hashset.size());
		
		for (Dog dog : hashset) {
			System.out.println(dog.getName());
		}
	}

}
