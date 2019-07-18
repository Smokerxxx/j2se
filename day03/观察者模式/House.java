package �۲���ģʽ;

import java.util.Observable;

public class House extends Observable {

	private String name;
	private int danjia;
	
	
	
	public House(String name, int danjia) {
		super();
		this.name = name;
		this.danjia = danjia;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDanjia() {
		return danjia;
	}
	public void setDanjia(int danjia) {
		this.danjia = danjia;
		
		setChanged(); //���۲��߷����仯
		notifyObservers();//֪ͨ���й۲���
	}
	@Override
	public String toString() {
		return "House [name=" + name + ", danjia=" + danjia + "]";
	}
	
	
}
