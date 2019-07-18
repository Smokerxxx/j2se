package list.自定义排序;

import java.util.Date;

public class Student {
	private int xuehao;
	private String name;
	private Date birthday;
	
	//构造
	public Student() {
		super();
	}
	
	public Student(int xuehao, String name, Date birthday) {
		super();
		this.xuehao = xuehao;
		this.name = name;
		this.birthday = birthday;
	}
	
	
	//封装
	public int getXuehao() {
		return xuehao;
	}
	public void setXuehao(int xuehao) {
		this.xuehao = xuehao;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Student [xuehao=" + xuehao + ", name=" + name + ", birthday=" + birthday + "]";
	}

	
	
	
}
