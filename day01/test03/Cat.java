package test03;

public class Cat extends Pet {

	public void eat(){
		System.out.println("è����");
		super.setLove(super.getLove()+5);
		System.out.println("��ǰ�����ܶ�"+super.getLove());
	}
	
	public void catchMouse(){}
}
