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
			//1.先找到当天的签到记录,删掉
			dao.delete(empid);
			//2.再把当天的签到和签退记录一起写入到文件,保证每天用户只有一个记录
			DakaInfo qiantui = new DakaInfo(empObj.getId(),empObj.getQdtime(),new Date());
			dao.insert(qiantui);
		}else{
			System.out.println("没有签到不能签退");
		}
	}
	
	public void chakandangtianqiandaoxinxi(int empid){
		DakaInfo empObj = dao.selectByEmpId(empid);
		if (null!=empObj) {
			System.out.println(empObj.toString());
		}else{
			System.out.println("当天没有签到");
		}
	}
}
