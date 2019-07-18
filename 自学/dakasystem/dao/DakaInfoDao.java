package dakasystem.dao;

import java.util.List;

import dakasystem.entity.DakaInfo;
import neuedu.dakasystem.dao.BaseDao;

public class DakaInfoDao extends BaseDao<DakaInfo>{
	
	BaseDao<DakaInfo> baseDao = new BaseDao<DakaInfo>();
	//添加员工；
	public void insert(DakaInfo e) {
		List<DakaInfo> list = string2List("dakainfo.txt");
		boolean flag = true;
		if(null != list && list.size()>0) {
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getId() == e.getId()) {
					System.out.println("该员工已经存在");
					flag = false;
					break;
				}
			}
		}if(flag) {
			int i = baseDao.writer2file("dakainfo.txt", e);
			if (i==1) {
				System.out.println("添加成功");
			} else {
				System.out.println("删除成功");
			}
		}
	}
	//删除员工；
	public void delete(int empid) {
		List<DakaInfo> list = string2List("dakainfo.txt");
		
		boolean flag  = false;
		if(null != list && list.size()>0) {
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getId() == empid) {
					System.out.println("找到该员工，可以删除");
					list.remove(i);
					flag = true;
					break;
				}
			}
		}if(flag) {
			int a = writer2FileByDelete("dakainfo.txt", list);
			if(a == 1) {
				System.out.println("删除成功");
			}else{
				System.out.println("删除失败");
			}
		}else {
			System.out.println("没有该记录");
		}
		
	}
	
	//查询员工
	public List<DakaInfo> showAll(int empid){
		List<DakaInfo> list = string2List("dakainfo.txt");
		return list;
	}
	
	//通过id查询某条记录
	public DakaInfo withID(int empid) {
		List<DakaInfo> list = string2List("dakainfo.txt");
		
		boolean flag = false;
		DakaInfo temp = null;
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
			System.out.println("未找到员工");
			return null;
		}
	}
}
