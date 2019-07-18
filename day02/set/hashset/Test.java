package set.hashset;

import java.util.HashSet;
import java.util.Set;

import k1������.Dog;
/**
 * set ���ϵ��ص�  :  ���ظ�(hashcodeֵ��ͬ ,���ǲ��ظ���)  , ������ 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		
		Set<Dog> hashset =  new HashSet<Dog>();
		
		Dog dog1 = new Dog("���3","��������");
		Dog dog2 = dog1;
		Dog dog3 = new Dog("���1","��������");
		
		
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
