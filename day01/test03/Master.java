package test03;
/**
 * 主人类
 * @author Administrator
 *
 */
public class Master {
	String name;
	
//以下两个方法并没有实现java的多态 ,以后避免这么定义
//	public  void food(Dog dog){}	
//	public  void food(Cat cat){}
	
	//参数的多态性
	public void food(Pet p){
		p.eat();
	}
	

//	public Dog lingyao(){}
//	public Cat lingyao(){}
	//返回值的多态性
	public Pet lingyao(String s){
		if (s.equals("dog")) {
			Dog dog = new Dog();
			return dog;
		} else if(s.equals("cat")){
			Cat cat = new Cat();
			return cat;
		}else{
			return null;
		}
	}
}
