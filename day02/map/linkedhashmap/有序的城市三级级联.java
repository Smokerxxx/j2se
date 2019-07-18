package map.linkedhashmap;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSON;

public class 有序的城市三级级联 {
	private static Map<String, Map<String, List<String>>> 省级映射 = new LinkedHashMap<String, Map<String, List<String>>>();

	//静态块
	static {
		addBeiJing();
		addLiaoNing();
		addJiLin();
	}
	public static void addBeiJing() {
		List<String> 朝阳区 = new ArrayList<String>();
		朝阳区.add(0, "永安里");
		朝阳区.add(1, "和平里");
		朝阳区.add(2, "三里屯");
		List<String> 西城区 = new ArrayList<String>();
		西城区.add(0, "建国门");
		西城区.add(1, "永定桥");
		西城区.add(2, "蓟门桥");
		List<String> 东城区 = new ArrayList<String>();
		东城区.add(0, "天安门");
		东城区.add(1, "地安门");
		东城区.add(2, "菜市口");
		HashMap<String, List<String>> 北京市城市与街道的映射 = new LinkedHashMap<String, List<String>>();
		北京市城市与街道的映射.put("朝阳区", 朝阳区);
		北京市城市与街道的映射.put("西城区", 西城区);
		北京市城市与街道的映射.put("东城区", 东城区);

		省级映射.put("北京市", 北京市城市与街道的映射);
	}

	public static void addLiaoNing() {
		List<String> 沈阳街道 = new ArrayList<String>();
		沈阳街道.add(0, "沈河区");
		沈阳街道.add(1, "和平区");
		沈阳街道.add(2, "皇姑区");
		沈阳街道.add(3, "铁西区");
		沈阳街道.add(4, "大东区");
		List<String> 大连街道 = new ArrayList<String>();
		大连街道.add(0, "金州区");
		大连街道.add(1, "银州区");
		大连街道.add(2, "旅顺区");
		大连街道.add(3, "庄河市");
		大连街道.add(4, "瓦房店市");
		List<String> 抚顺街道 = new ArrayList<String>();
		抚顺街道.add(0, "望花区");
		抚顺街道.add(1, "新抚区");
		抚顺街道.add(2, "清源县");
		HashMap<String, List<String>> 辽宁省城市与街道的映射 = new LinkedHashMap<String, List<String>>();
		辽宁省城市与街道的映射.put("沈阳市", 沈阳街道);
		辽宁省城市与街道的映射.put("大连市", 大连街道);
		辽宁省城市与街道的映射.put("抚顺市", 抚顺街道);

		省级映射.put("辽宁省", 辽宁省城市与街道的映射);
	}

	public static void addJiLin() {
		List<String> 长春街道 = new ArrayList<String>();
		长春街道.add(0, "长影区");
		长春街道.add(1, "西湖区");
		长春街道.add(2, "一汽区");
		List<String> 吉林街道 = new ArrayList<String>();
		吉林街道.add(0, "延边区");
		吉林街道.add(1, "长吉区");
		吉林街道.add(2, "万顺区");
		List<String> 四平街道 = new ArrayList<String>();
		四平街道.add(0, "铁西区");
		四平街道.add(1, "铁东区");
		四平街道.add(2, "新区");
		HashMap<String, List<String>> 吉林省城市与街道的映射 = new LinkedHashMap<String, List<String>>();
		吉林省城市与街道的映射.put("长春市", 长春街道);
		吉林省城市与街道的映射.put("吉林市", 吉林街道);
		吉林省城市与街道的映射.put("四平市", 四平街道);

		省级映射.put("吉林省", 吉林省城市与街道的映射);
	}

	public static void main(String[] args) {
		readFile2Map();
		
//		System.out.println("------");
//		Set<String> sheng = 省级映射.keySet();
//		Iterator<String> iterator = sheng.iterator();
//		while (iterator.hasNext()) {
//			String p = iterator.next();
//			System.out.println(p);
//			Map<String, List<String>> chengshiMap = 省级映射.get(p);
//			Set<String> chengshi = chengshiMap.keySet();
//			Iterator<String> it = chengshi.iterator();
//			while (it.hasNext()) {
//				String cityname =  it.next();
//				System.out.print(cityname+":\t");
//				List<String> jiedaolist = chengshiMap.get(cityname);
//				for (String s : jiedaolist) {
//					System.out.print(s+"\t");
//				}
//				System.out.println();
//				
//			}
		
		
//			System.out.println("------ 写入文件c:\\data-ligp.txt");			
//			write2File();
//			System.out.println("------ 写入完毕");
//		}
	}
	
	/**
	 * http://www.bejson.com/   在线检查json格式的网站
	 */
	private static void write2File(){
		File file = new File("c:\\data-ligp.txt");
		
		//如果文件不存在就创建该文件
		if (!file.exists()) {
			try {
				file.createNewFile(); //
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//JSON类  alibaba
		String jsonstr = JSON.toJSONString(省级映射);// 将一个复杂的map类型转换成一个字符串(符合json格式的字符串)
		System.out.println("json字符串:"+jsonstr);
		
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream(file);
			byte[] bytes = jsonstr.getBytes();
			out.write(bytes, 0, bytes.length);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 从一个文件中读取一段符合json格式的字符串,并将其转换为map集合
	 * 前提 : 假设这个文件已经存在 ,并且里面有一个符合json规范的字符串
	 */
	public static void readFile2Map(){
		File file = new File("c:\\data-ligp.txt");
		
		FileReader in = null;
		
		// 输入流进入读取  ,读到内存里,再放到一个字符串变量
		try {
			in = new FileReader(file);
			char[] c = new char[1024];
			StringBuffer sb = new StringBuffer("");
			while(in.read(c)!=-1){
				sb.append(c);
				c=new char[1024];
			}
			in.close();
			
			String jsonStr = sb.toString().trim();//将多余的空格截取掉  ,trim() :去左右空格 
			System.out.println(jsonStr);
			
			
			Map maps = JSON.parseObject(jsonStr);//将string转换成一个map对象
			
			
			//再循环这个map ,看一看能不能还原回原来的数据
			System.out.println("------");
			Set<String> sheng = maps.keySet();
			Iterator<String> iterator = sheng.iterator();
			while (iterator.hasNext()) {
				String p = iterator.next();
				System.out.println(p);
				Map<String, List<String>> chengshiMap = 省级映射.get(p);
				Set<String> chengshi = chengshiMap.keySet();
				Iterator<String> it = chengshi.iterator();
				while (it.hasNext()) {
					String cityname =  it.next();
					System.out.print(cityname+":\t");
					List<String> jiedaolist = chengshiMap.get(cityname);
					for (String s : jiedaolist) {
						System.out.print(s+"\t");
					}
					System.out.println();
					
				}
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
