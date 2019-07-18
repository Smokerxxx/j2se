package test03;

public class Cat extends Pet {

	public void eat(){
		System.out.println("猫吃鱼");
		super.setLove(super.getLove()+5);
		System.out.println("当前的亲密度"+super.getLove());
	}
	
	public void catchMouse(){}
}
