package k1宠物类;

/**
* 宠物类，狗狗和企鹅的父类。
*/
public abstract class Pet {
	private String name = "无名氏";// 昵称
	private int health = 100;// 健康值
	private int love = 0;// 亲密度
	
	/**
	 * 抽象方法eat(),负责宠物吃饭功能。
	 */
	public abstract void eat();
	
	/**
	 * 无参构造方法。
	 * @param name  昵称
	 */
	public Pet(){
		
	}
	
	/**
	 * 有参构造方法。
	 * @param name  昵称
	 */
	public Pet(String name) {
		this.name = name;
	}
	
	/**
	 * 输出宠物信息。
	 */
	public void print() {
		System.out.println("宠物的自白：\n我的名字叫" + this.name + 
				"，健康值是"	+ this.health + "，和主人的亲密度是"
				+ this.love + "。");
	}
	

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
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}	
	
	
}

