package j2se;

interface ����{
	public static final String NATIONAL="�л����񹲺͹�";
	
	public static final String SHOUDU = "����";
	
	public void sayHanYu();
	
	public void sayHello(String name , int age);
}

public class Person implements ���� {
	private String name;
	private int age;
	
	
	
	public Person() {//�޲ι���
		super();
	}

	public Person(String name) {//һ����������
		super();
		this.name = name;
	}

	public Person(String name, int age) {//2����������
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
		System.out.println("��Һ�,����"+NATIONAL+"����,�׶���:"+SHOUDU);
		
	}


	@Override
	public void sayHello(String name, int age) {
		System.out.println("�ҵ����ֽ�"+name+",����:"+age+"��.");
		
	}
	
	
}
