package C反射调用方法;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class FileInput {
	public  void write2File(String filename,Object o) {
		try {
			File file = new File("D:"+File.separator+filename);
			FileOutputStream fos = new FileOutputStream(file,true);
			
			String str = JSON.toJSONString(o);
			str = "\r\n"+ str;
			
			fos.write(str.getBytes());
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public int writer2FileByDelete(String filename, List list) {
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
				write2File(filename, list.get(i));
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
