package neuedu.dakasystem.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import neuedu.dakasystem.entity.DakaInfo;
import neuedu.dakasystem.entity.Employee;

public class BaseDao<T> {
	
	public int writer2FileByDelete(String filename, List<T> list){
		int result=0;
		
		try {
			//1.先清空文件内容
			File file = new File("e:"+File.separator+filename); 
			FileOutputStream fos = new FileOutputStream(file);
			
			String str="";
			
			fos.write(str.getBytes());
			fos.close();
			System.out.println("文件清空");
			
			//2.调用writer2file方法增加新内容
			for (int i = 0; i < list.size(); i++) {
				writer2file(filename,list.get(i));
			}
			result =1;
			
			
		} catch (Exception e) {
			e.printStackTrace();
			result=0;
		}
		
		return result;
	}
	
	/**
	 * 
	 * @param filename
	 * @param t   泛型 
	 * @return
	 */
	public int writer2file(String filename, T t){
		int result = 0;
		
		try {
			File file = new File("e:"+File.separator+filename); 
			FileOutputStream fos = new FileOutputStream(file,true);
			
			String str = JSON.toJSONString(t);
			str="\r\n"+str;
			
			fos.write(str.getBytes());
			fos.close();
			result=1;
			
		} catch (Exception e) {
			e.printStackTrace();
			result=0;
		}
		
		return result;
	}
	
	/**
	 * 泛型作为返回值的类型
	 * @param fname
	 * @return
	 */
	public List<T> string2List(String filename){
		String s = read2String(filename);
		if ("employeeinfo.txt".equals(filename)) {
			List<Employee> list =new ArrayList<Employee>();
			String[] split = s.split("\n");
			for (int i = 0; i < split.length; i++) {
				Employee temp = new Employee();
				JSONObject o = JSON.parseObject(split[i]);
				temp.setId(o.getIntValue("id"));
				temp.setName(o.getString("name"));
				list.add(temp);
			}
			return (List<T>)list;
			
		}else if("dakainfo.txt".equals(filename)){
			List<DakaInfo> list =new ArrayList<DakaInfo>();
			String[] split = s.split("\n");
			for (int i = 0; i < split.length; i++) {
				DakaInfo temp = new DakaInfo();
				JSONObject o = JSON.parseObject(split[i]);
				temp.setId(o.getIntValue("id"));
				temp.setQdtime(o.getDate("qdtime"));
				temp.setQttime(o.getDate("qttime"));
				list.add(temp);
			}
			return (List<T>)list;
		}else{
			return null;
		}

	}
	
	/**
	 * 通过给定一个文件名  , 将文件中的json数据转换成字符串 , 并返回
	 * @param filename 
	 * @return
	 */
	public String read2String(String filename){
		String s="";
		try {
			//io操作
			File file = new File("e:"+File.separator+filename);
			
			FileInputStream  fis = new FileInputStream(file);
			
			byte[] b = new byte[fis.available()];
			
			for (int i = 0; i < b.length; i++) {
				b[i]=(byte)fis.read();
			}
			
			s=new String(b).trim();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return s;
	}
	
	
	public static void main(String[] args) {
		BaseDao<Object> baseDao = new BaseDao<Object>();
		
//		String s = baseDao.read2String("employeeinfo.txt");
//		System.out.println(s);
		
		List<Object> list = baseDao.string2List("dakainfo.txt");
		
		System.out.println(list.size());
	}
}
