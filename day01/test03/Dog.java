package test03;
/**
 * java���ǵ��̳�  ,���յĸ����Object 
 * 
 * Object����java������ĸ���  ,�����м������õķ���,�������඼���Ե��õ�,������Ҳ������д��Щ����,�ﵽ��ǿ�Ĺ���
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
	
	//��д (java��̬�ľ���ʵ��  ,����ȸ����з�����ǿ��  , �����Լ������¶�����Ϊ , �ں������ʵ���˶�����)
	@Override
	public  void display(){}
	@Override
	public  void display(String str){ }
	
	@Override
	public String toString(){
		return this.getName()+this.getHealth()+this.getLove()+this.strain;
	}
	
	//�÷���������д�����еķ��� ,�����븸���з���ͬ����һ������ , ����������һ����ͨ����,ֻ�����������з���������
	public  void display(String str,int i){ }
	
	
	public void eat(){
		System.out.println("���Թ�ͷ");
		super.setLove(super.getLove()+10);
		System.out.println("��ǰ�����ܶ�"+super.getLove());
	}
	
	public void careHome(){}
	
	public static void main(String[] args) {
		Dog dog = new Dog("���",100,0,"��������Ȯ");
		System.out.println(dog.toString());
	}
}
