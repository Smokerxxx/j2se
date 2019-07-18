package 作业;

import java.util.Date;

public class DakaInfo {
	String name; 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	int 员工ID;
	String 签到时间;
	String 签退时间;
	
//	public DakaInfo(int 员工ID,String 签到时间,String 签退时间) {
//		super();
//		this.员工ID = 员工ID;
//		this.签到时间 = 签到时间;
//		this.签退时间 = 签退时间;
//		// TODO Auto-generated constructor stub
//	}

	public int get员工ID() {
		return 员工ID;
	}

	public void set员工ID(int 员工id) {
		员工ID = 员工id;
	}

	public String get签到时间() {
		return 签到时间;
	}

	public void set签到时间(String 签到时间) {
		this.签到时间 = 签到时间;
	}

	public String get签退时间() {
		return 签退时间;
	}

	public void set签退时间(String 签退时间) {
		this.签退时间 = 签退时间;
	}
}
