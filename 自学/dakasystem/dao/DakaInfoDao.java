package dakasystem.dao;

import java.util.List;

import dakasystem.entity.DakaInfo;
import neuedu.dakasystem.dao.BaseDao;

public class DakaInfoDao extends BaseDao<DakaInfo>{
	
	BaseDao<DakaInfo> baseDao = new BaseDao<DakaInfo>();
	//���Ա����
	public void insert(DakaInfo e) {
		List<DakaInfo> list = string2List("dakainfo.txt");
		boolean flag = true;
		if(null != list && list.size()>0) {
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getId() == e.getId()) {
					System.out.println("��Ա���Ѿ�����");
					flag = false;
					break;
				}
			}
		}if(flag) {
			int i = baseDao.writer2file("dakainfo.txt", e);
			if (i==1) {
				System.out.println("��ӳɹ�");
			} else {
				System.out.println("ɾ���ɹ�");
			}
		}
	}
	//ɾ��Ա����
	public void delete(int empid) {
		List<DakaInfo> list = string2List("dakainfo.txt");
		
		boolean flag  = false;
		if(null != list && list.size()>0) {
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getId() == empid) {
					System.out.println("�ҵ���Ա��������ɾ��");
					list.remove(i);
					flag = true;
					break;
				}
			}
		}if(flag) {
			int a = writer2FileByDelete("dakainfo.txt", list);
			if(a == 1) {
				System.out.println("ɾ���ɹ�");
			}else{
				System.out.println("ɾ��ʧ��");
			}
		}else {
			System.out.println("û�иü�¼");
		}
		
	}
	
	//��ѯԱ��
	public List<DakaInfo> showAll(int empid){
		List<DakaInfo> list = string2List("dakainfo.txt");
		return list;
	}
	
	//ͨ��id��ѯĳ����¼
	public DakaInfo withID(int empid) {
		List<DakaInfo> list = string2List("dakainfo.txt");
		
		boolean flag = false;
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
			System.out.println("δ�ҵ�Ա��");
			return null;
		}
	}
}
