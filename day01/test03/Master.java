package test03;
/**
 * ������
 * @author Administrator
 *
 */
public class Master {
	String name;
	
//��������������û��ʵ��java�Ķ�̬ ,�Ժ������ô����
//	public  void food(Dog dog){}	
//	public  void food(Cat cat){}
	
	//�����Ķ�̬��
	public void food(Pet p){
		p.eat();
	}
	

//	public Dog lingyao(){}
//	public Cat lingyao(){}
	//����ֵ�Ķ�̬��
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
