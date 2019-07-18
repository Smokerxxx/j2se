package dakasystem.service;

import java.util.List;

import dakasystem.dao.DakaInfoDao;
import dakasystem.dao.EmployeeDao;
import dakasystem.entity.Employee;

public class EmpService {
	EmployeeDao dao = new EmployeeDao();
	DakaInfoDao dao2 = new DakaInfoDao();
	//新增员工
	public void addEmployee(Employee e){
		dao.insert(e);
	}
	// 删除用户的信息  ,同时再删除打卡记录中的信息 ,所以里面调用了2次dao操作
		public void shanchuEmp(int empid){
			dao.delete(empid);
			dao2.delete(empid);
			
		}

		public List<Employee> chaxunyonghuliebiao(){
			return  dao.showAll();
		}
		
		
		public Employee chaxundangeyonghu(int empid){
			return dao.selectByEmpId(empid);
		}
}
