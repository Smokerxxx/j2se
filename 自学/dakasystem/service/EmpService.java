package dakasystem.service;

import java.util.List;

import dakasystem.dao.DakaInfoDao;
import dakasystem.dao.EmployeeDao;
import dakasystem.entity.Employee;

public class EmpService {
	EmployeeDao dao = new EmployeeDao();
	DakaInfoDao dao2 = new DakaInfoDao();
	//����Ա��
	public void addEmployee(Employee e){
		dao.insert(e);
	}
	// ɾ���û�����Ϣ  ,ͬʱ��ɾ���򿨼�¼�е���Ϣ ,�������������2��dao����
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
