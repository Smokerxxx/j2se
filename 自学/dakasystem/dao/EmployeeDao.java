package dakasystem.dao;

import java.util.List;

import dakasystem.entity.Employee;

public class EmployeeDao extends BaseDao<Employee>{
	BaseDao<Employee> baseDao = new BaseDao<Employee>();
	
	
	//插入员工
	public void insert(Employee e) {
		List<Employee> list = string2List("employeeinfo.txt");
		boolean flag = false;
		
		if(null != list && list.size()>0 ) {
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getId() == e.getId()) {
					System.out.println("员工编号重复了,不能增加");
					flag= false;
					break;
				}
			}
		}
		if (flag) {
			int i = baseDao.write2file("employeeinfo.txt",e);
			if (i==1) {
				System.out.println("inser success");
			} else {
				System.out.println("inser failure");
			}
		}
	}
	//删除
	public void delete(int empid){
		List<Employee> list = baseDao.string2List("employeeinfo.txt");
		boolean flag = false; // 是否找到该员工记录的标志位
		
		if (null!=list  && list.size()>0) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId()==empid) {
					System.out.println("员工编号找到了,可以删除");
					flag= true;
					list.remove(i);
					break;
				}
			}
		}
		
		if (flag) {
			int i  = baseDao.writer2FileByDelete("employeeinfo.txt",list);
			
			if (i==1) {
				System.out.println("删除成功");
			} else {
				System.out.println("删除失败");
			}
		}else{
			System.out.println("没有该纪录");
		}
	}
	//查询所有
	public List<Employee> showAll(){
		List<Employee> list = baseDao.string2List("employeeinfo.txt");
		return list;
	}
	//查询某个
	public Employee  selectByEmpId(int empid){
		List<Employee> list = baseDao.string2List("employeeinfo.txt");
		
		boolean flag = false; // 是否找到该员工记录的标志位
		Employee temp = null;
		if (null!=list  && list.size()>0) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId()==empid) {
					System.out.println("员工编号找到了");
					flag= true;
					temp=list.get(i);
					break;
				}
			}
		}
		
		if (flag) {
			return temp;
		} else {
			return null;
		}
	}
}
