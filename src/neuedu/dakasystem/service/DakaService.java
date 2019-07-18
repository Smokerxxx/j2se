package neuedu.dakasystem.service;

import java.util.Date;

import neuedu.dakasystem.dao.DakaInfoDao;
import neuedu.dakasystem.entity.DakaInfo;

public class DakaService {
	DakaInfoDao dao = new DakaInfoDao();
	
	public void qiandao(int empid){
		DakaInfo qiandao = new DakaInfo(empid,new Date(),null);
		dao.insert(qiandao);
	}
	
	public void qiantui(int empid){
		DakaInfo empObj = dao.selectByEmpId(empid);
		
		if (null!=empObj && null!=empObj.getQdtime()) {
			//1.���ҵ������ǩ����¼,ɾ��
			dao.delete(empid);
			//2.�ٰѵ����ǩ����ǩ�˼�¼һ��д�뵽�ļ�,��֤ÿ���û�ֻ��һ����¼
			DakaInfo qiantui = new DakaInfo(empObj.getId(),empObj.getQdtime(),new Date());
			dao.insert(qiantui);
		}else{
			System.out.println("û��ǩ������ǩ��");
		}
	}
	
	public void chakandangtianqiandaoxinxi(int empid){
		DakaInfo empObj = dao.selectByEmpId(empid);
		if (null!=empObj) {
			System.out.println(empObj.toString());
		}else{
			System.out.println("����û��ǩ��");
		}
	}
}
