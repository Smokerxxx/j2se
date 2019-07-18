package dakasystem.dao;

import java.util.List;

import dakasystem.entity.Employee;

public class EmployeeDao extends BaseDao<Employee>{
	BaseDao<Employee> baseDao = new BaseDao<Employee>();
	
	
	//����Ա��
	public void insert(Employee e) {
		List<Employee> list = string2List("employeeinfo.txt");
		boolean flag = false;
		
		if(null != list && list.size()>0 ) {
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getId() == e.getId()) {
					System.out.println("Ա������ظ���,��������");
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
	//ɾ��
	public void delete(int empid){
		List<Employee> list = baseDao.string2List("employeeinfo.txt");
		boolean flag = false; // �Ƿ��ҵ���Ա����¼�ı�־λ
		
		if (null!=list  && list.size()>0) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId()==empid) {
					System.out.println("Ա������ҵ���,����ɾ��");
					flag= true;
					list.remove(i);
					break;
				}
			}
		}
		
		if (flag) {
			int i  = baseDao.writer2FileByDelete("employeeinfo.txt",list);
			
			if (i==1) {
				System.out.println("ɾ���ɹ�");
			} else {
				System.out.println("ɾ��ʧ��");
			}
		}else{
			System.out.println("û�иü�¼");
		}
	}
	//��ѯ����
	public List<Employee> showAll(){
		List<Employee> list = baseDao.string2List("employeeinfo.txt");
		return list;
	}
	//��ѯĳ��
	public Employee  selectByEmpId(int empid){
		List<Employee> list = baseDao.string2List("employeeinfo.txt");
		
		boolean flag = false; // �Ƿ��ҵ���Ա����¼�ı�־λ
		Employee temp = null;
		if (null!=list  && list.size()>0) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId()==empid) {
					System.out.println("Ա������ҵ���");
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
