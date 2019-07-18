package K_���л�;

import java.io.Serializable;
import java.util.Date;
/**
 * User ��һ��ʵ����   ,Ҳ��һ����ͨ��
 * 
 * ������һ�������л��Ľӿ�   ,  ����: ���Խ����ݴ�01010101ת���ļ� , Ҳ���Խ��ļ���ת������
 * @author Administrator
 *
 */
public class Users implements Serializable{
	private static final long serialVersionUID = -3135932065250469668L;
	
	private String name;
	private String id;
	private int age;
	private Date birthday;
	
	public Users(String name, String id, int age, Date birthday) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Users [name=" + name + ", id=" + id + ", age=" + age + ", birthday=" + birthday + "]";
	}

	
	
}
