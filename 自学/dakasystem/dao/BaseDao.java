package dakasystem.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import dakasystem.entity.DakaInfo;
import dakasystem.entity.Employee;


public class BaseDao<T> {

	//读取文件中的json数据，并返回一个字符串
	public String read2file(String filename) {
		String s = "";
		try {
			File file = new File("D:"+File.separator+filename);
			FileInputStream fis = new FileInputStream(file);
			
			byte [] bytes = new byte[fis.available()];
			
			for (int i = 0; i < bytes.length; i++) {
				bytes [i] = (byte) fis.read();
			}
			s = new String(bytes).trim();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return s;
	}
	
	//利用raad2file方法将文件中的json数据先转换为字符串，   再将字符串以\n分割为数组，
	//把数组转化为一个个json对象提取数据；写入list中
	//泛型
	public List<T> string2List(String filename){
		String s = read2file(filename);
		if("employeeinfo.txt".equals(filename)) {
			String [] splite = s.split("\n");
			List<Employee> list = new ArrayList<Employee>();
			for (int i = 0; i < splite.length; i++) {
				Employee employee = new Employee();
				JSONObject o = JSON.parseObject(splite[i]);
				employee.setId(o.getIntValue("id"));
				employee.setName(o.getString("name"));
				list.add(employee);
			}
			return (List<T>)list;
		}else if("dakainfo".equals(filename)) {
			String [] splite = s.split("\n");
			List<DakaInfo> list = new ArrayList<DakaInfo>();
			for (int i = 0; i < splite.length; i++) {
				DakaInfo dakainfo = new DakaInfo();
				JSONObject o = JSON.parseObject(splite[i]);
				dakainfo.setId(o.getIntValue("id"));
				dakainfo.setQdtime(o.getDate("qdtime"));
				dakainfo.setQttime(o.getDate("qttime"));
				list.add(dakainfo);
			}
			return (List<T>) list;
		}
		else return null;
	}
	
	//泛型 T t(对象)；传入泛型，将泛型转换为字符串，用fos.write方法（输入byte型）输入文件
	public int write2file(String filename,T t) {
		int result = 0;
		try {
			File file = new File("D:"+File.separator+filename);
			FileOutputStream fos = new FileOutputStream(file,true);
			
			String str = JSON.toJSONString(t);
			str = "\r\n"+ str;
			
			fos.write(str.getBytes());
			fos.close();
			result = 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result = 0;
		}
		return result;
	}
	
	//将传入的list写入文件
	public int writer2FileByDelete(String filename, List<T> list) {
		int result = 0;
		try {
			//清空文件
			File file = new File("D:"+File.separator+filename); 
			FileOutputStream fos = new FileOutputStream(file);
			
			String str = "";
			fos.write(str.getBytes());
			fos.close();
			
			//调用write2file写入文件
			for (int i = 0; i < list.size(); i++) {
				write2file(filename, list.get(i));
				result = 1;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result = 0;
		}
		return result;
	}
	
}
