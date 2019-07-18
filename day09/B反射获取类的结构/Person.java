package B反射获取类的结构;

interface 国籍{
	public static final String NATIONAL="中华人民共和国";
	
	public static final String SHOUDU = "北京";
	
	public void sayHanYu();
	
	public void sayHello(String name , int age);
}

public class Person implements 国籍 {
	private String name;
	private int age;
	
	
	
	public Person() {//无参构造
		super();
	}

	public Person(String name) {//一个参数构造
		super();
		this.name = name;
	}

	public Person(String name, int age) {//2个参数构造
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	@Override
	public void sayHanYu() {
		System.out.println("大家好,我是"+NATIONAL+"公民,首都是:"+SHOUDU);
		
	}


	@Override
	public void sayHello(String name, int age) {
		System.out.println("我的名字叫"+name+",年龄:"+age+"岁.");
		
	}
	
	
}
