package k1������;

/**
* �����࣬���������ĸ��ࡣ
*/
public abstract class Pet {
	private String name = "������";// �ǳ�
	private int health = 100;// ����ֵ
	private int love = 0;// ���ܶ�
	
	/**
	 * ���󷽷�eat(),�������Է����ܡ�
	 */
	public abstract void eat();
	
	/**
	 * �޲ι��췽����
	 * @param name  �ǳ�
	 */
	public Pet(){
		
	}
	
	/**
	 * �вι��췽����
	 * @param name  �ǳ�
	 */
	public Pet(String name) {
		this.name = name;
	}
	
	/**
	 * ���������Ϣ��
	 */
	public void print() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + this.name + 
				"������ֵ��"	+ this.health + "�������˵����ܶ���"
				+ this.love + "��");
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

