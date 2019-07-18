package test03;
/**
 * java中是单继承  ,最终的父类叫Object 
 * 
 * Object类是java所有类的父类  ,其中有几个常用的方法,是所有类都可以调用的,所有类也可以重写这些方法,达到更强的功能
 * 
 * 
 * @author Administrator
 *
 */
public class Dog extends Pet {

	String strain;
	
	public Dog(){
		super();
	}
	
	public Dog(String name, int health, int love , String strain){
		super(name,health,love);
		this.strain =strain;
	}
	
	//重写 (java多态的具体实现  ,子类比父类中方法更强大  , 可以自己再重新定义行为 , 在后代类中实现了多样性)
	@Override
	public  void display(){}
	@Override
	public  void display(String str){ }
	
	@Override
	public String toString(){
		return this.getName()+this.getHealth()+this.getLove()+this.strain;
	}
	
	//该方法不是重写父类中的方法 ,而是与父类中方法同名的一个方法 , 它是子类中一个普通方法,只不过跟父类中方法名类似
	public  void display(String str,int i){ }
	
	
	public void eat(){
		System.out.println("狗吃骨头");
		super.setLove(super.getLove()+10);
		System.out.println("当前的亲密度"+super.getLove());
	}
	
	public void careHome(){}
	
	public static void main(String[] args) {
		Dog dog = new Dog("点点",100,0,"拉布拉多犬");
		System.out.println(dog.toString());
	}
}
