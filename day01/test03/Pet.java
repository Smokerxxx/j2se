package test03;

public class Pet {
	//属性
	private String name;
	private int health;
	private int love;
	
	//构造器(多态性:重载的特性 , 在一个类中 ,产生了多样性)
	public Pet() {
		super();
	}
	
	public Pet(String name) {
		super();
		this.name = name;
	}

	public Pet(String name, int health, int love) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
	}
	
	public void display(){}
	
	public void display(String str){}
	
	public void eat(){}





	//java的第一个特性:封装 ,作用:保护私有属性的特点 ,限制赋不合理的值
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		if (health<0) {
			this.health=1;
		}
		
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	

	
	
}
