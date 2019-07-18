package neuedu.dakasystem.dao;

import java.util.List;

import neuedu.dakasystem.entity.DakaInfo;

public class DakaInfoDao extends BaseDao<DakaInfo> {
	BaseDao<DakaInfo> baseDao = new BaseDao<DakaInfo>();
	
	//插入
	public void insert(DakaInfo e){
		List<DakaInfo> list = baseDao.string2List("dakainfo.txt");
		boolean flag = true;  //是否重复的标志位
		
		if (null!=list  && list.size()>0) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId()==e.getId()) {
					System.out.println("员工编号重复了,不能增加");
					flag= false;
					break;
				}
			}
		}
		
		if (flag) {
			int i = baseDao.writer2file("dakainfo.txt",e);
			if (i==1) {
				System.out.println("inser success");
			} else {
				System.out.println("inser failure");
			}
		}
	}
	
	
	//删除
	public void delete(int empid){
		List<DakaInfo> list = baseDao.string2List("dakainfo.txt");
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
			int i  = baseDao.writer2FileByDelete("dakainfo.txt",list);
			
			if (i==1) {
				System.out.println("删除成功");
			} else {
				System.out.println("删除失败");
			}
		}else{
			System.out.println("没有该纪录");
		}
	}
	
	//查询所有记录
	public List<DakaInfo> selectAll(){
		List<DakaInfo> list = baseDao.string2List("dakainfo.txt");
		return list;
	}
	
	//通过id 查询某一条记录
	public DakaInfo  selectByEmpId(int empid){
		List<DakaInfo> list = baseDao.string2List("dakainfo.txt");
		
		boolean flag = false; // 是否找到该员工记录的标志位
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
			return null;
		}
	}
	
	
	public static void main(String[] args) {
		DakaInfoDao dao = new DakaInfoDao();
		
//		DakaInfo DakaInfo = new DakaInfo(1004, "fsdfdsafds");
//		dao.insert(DakaInfo);
		
		dao.delete(1004);
	}
}
