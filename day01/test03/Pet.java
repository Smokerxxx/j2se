package test03;

public class Pet {
	//����
	private String name;
	private int health;
	private int love;
	
	//������(��̬��:���ص����� , ��һ������ ,�����˶�����)
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





	//java�ĵ�һ������:��װ ,����:����˽�����Ե��ص� ,���Ƹ��������ֵ
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
