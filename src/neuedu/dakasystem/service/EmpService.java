package neuedu.dakasystem.service;

import java.util.List;

import neuedu.dakasystem.dao.DakaInfoDao;
import neuedu.dakasystem.dao.EmployeeDao;
import neuedu.dakasystem.entity.Employee;
/**
 * ҵ���߼��� , ����ϲ�ͬdao�еĵ�Ԫ����ȥ�����ֲ��� ,����С���������һ�� ,����һ������߼�
 * @author Administrator
 *
 */
public class EmpService {
	EmployeeDao dao = new EmployeeDao();
	DakaInfoDao dao2 = new DakaInfoDao();
	
	public void addEmployee(Employee e){
		dao.insert(e);
	}
	
	// ɾ���û�����Ϣ  ,ͬʱ��ɾ���򿨼�¼�е���Ϣ ,�������������2��dao����
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
