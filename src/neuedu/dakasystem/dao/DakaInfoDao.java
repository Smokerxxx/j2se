package neuedu.dakasystem.dao;

import java.util.List;

import neuedu.dakasystem.entity.DakaInfo;

public class DakaInfoDao extends BaseDao<DakaInfo> {
	BaseDao<DakaInfo> baseDao = new BaseDao<DakaInfo>();
	
	//����
	public void insert(DakaInfo e){
		List<DakaInfo> list = baseDao.string2List("dakainfo.txt");
		boolean flag = true;  //�Ƿ��ظ��ı�־λ
		
		if (null!=list  && list.size()>0) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId()==e.getId()) {
					System.out.println("Ա������ظ���,��������");
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
	
	
	//ɾ��
	public void delete(int empid){
		List<DakaInfo> list = baseDao.string2List("dakainfo.txt");
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
			int i  = baseDao.writer2FileByDelete("dakainfo.txt",list);
			
			if (i==1) {
				System.out.println("ɾ���ɹ�");
			} else {
				System.out.println("ɾ��ʧ��");
			}
		}else{
			System.out.println("û�иü�¼");
		}
	}
	
	//��ѯ���м�¼
	public List<DakaInfo> selectAll(){
		List<DakaInfo> list = baseDao.string2List("dakainfo.txt");
		return list;
	}
	
	//ͨ��id ��ѯĳһ����¼
	public DakaInfo  selectByEmpId(int empid){
		List<DakaInfo> list = baseDao.string2List("dakainfo.txt");
		
		boolean flag = false; // �Ƿ��ҵ���Ա����¼�ı�־λ
		DakaInfo temp = null;
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
	
	
	public static void main(String[] args) {
		DakaInfoDao dao = new DakaInfoDao();
		
//		DakaInfo DakaInfo = new DakaInfo(1004, "fsdfdsafds");
//		dao.insert(DakaInfo);
		
		dao.delete(1004);
	}
}
