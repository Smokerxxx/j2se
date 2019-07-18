package ื๗าต;

public class Employee {
	private int ID;
	private String name;
	
	
	
	public Employee(int ID, String name) {
		super();
		this.ID = ID;
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	
	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + "]";
	}
}
