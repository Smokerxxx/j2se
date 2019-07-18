package neuedu.dakasystem.service;

import java.util.List;

import neuedu.dakasystem.dao.DakaInfoDao;
import neuedu.dakasystem.dao.EmployeeDao;
import neuedu.dakasystem.entity.Employee;
/**
 * 业务逻辑类 , 会组合不同dao中的单元方法去做各种操作 ,各种小操作组合在一起 ,就是一个大的逻辑
 * @author Administrator
 *
 */
public class EmpService {
	EmployeeDao dao = new EmployeeDao();
	DakaInfoDao dao2 = new DakaInfoDao();
	
	public void addEmployee(Employee e){
		dao.insert(e);
	}
	
	// 删除用户的信息  ,同时再删除打卡记录中的信息 ,所以里面调用了2次dao操作
	public void shanchuEmp(int empid){
		dao.delete(empid);
//		dao2.delete(empid);
		
	}
	
	
	
	public List<Employee> chaxunyonghuliebiao(){
		return  dao.selectAll();
	}
	
	
	public Employee chaxundangeyonghu(int empid){
		return dao.selectByEmpId(empid);
	}
}
