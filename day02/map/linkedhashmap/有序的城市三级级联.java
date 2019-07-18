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

public class ����ĳ����������� {
	private static Map<String, Map<String, List<String>>> ʡ��ӳ�� = new LinkedHashMap<String, Map<String, List<String>>>();

	//��̬��
	static {
		addBeiJing();
		addLiaoNing();
		addJiLin();
	}
	public static void addBeiJing() {
		List<String> ������ = new ArrayList<String>();
		������.add(0, "������");
		������.add(1, "��ƽ��");
		������.add(2, "������");
		List<String> ������ = new ArrayList<String>();
		������.add(0, "������");
		������.add(1, "������");
		������.add(2, "������");
		List<String> ������ = new ArrayList<String>();
		������.add(0, "�찲��");
		������.add(1, "�ذ���");
		������.add(2, "���п�");
		HashMap<String, List<String>> �����г�����ֵ���ӳ�� = new LinkedHashMap<String, List<String>>();
		�����г�����ֵ���ӳ��.put("������", ������);
		�����г�����ֵ���ӳ��.put("������", ������);
		�����г�����ֵ���ӳ��.put("������", ������);

		ʡ��ӳ��.put("������", �����г�����ֵ���ӳ��);
	}

	public static void addLiaoNing() {
		List<String> �����ֵ� = new ArrayList<String>();
		�����ֵ�.add(0, "�����");
		�����ֵ�.add(1, "��ƽ��");
		�����ֵ�.add(2, "�ʹ���");
		�����ֵ�.add(3, "������");
		�����ֵ�.add(4, "����");
		List<String> �����ֵ� = new ArrayList<String>();
		�����ֵ�.add(0, "������");
		�����ֵ�.add(1, "������");
		�����ֵ�.add(2, "��˳��");
		�����ֵ�.add(3, "ׯ����");
		�����ֵ�.add(4, "�߷�����");
		List<String> ��˳�ֵ� = new ArrayList<String>();
		��˳�ֵ�.add(0, "������");
		��˳�ֵ�.add(1, "�¸���");
		��˳�ֵ�.add(2, "��Դ��");
		HashMap<String, List<String>> ����ʡ������ֵ���ӳ�� = new LinkedHashMap<String, List<String>>();
		����ʡ������ֵ���ӳ��.put("������", �����ֵ�);
		����ʡ������ֵ���ӳ��.put("������", �����ֵ�);
		����ʡ������ֵ���ӳ��.put("��˳��", ��˳�ֵ�);

		ʡ��ӳ��.put("����ʡ", ����ʡ������ֵ���ӳ��);
	}

	public static void addJiLin() {
		List<String> �����ֵ� = new ArrayList<String>();
		�����ֵ�.add(0, "��Ӱ��");
		�����ֵ�.add(1, "������");
		�����ֵ�.add(2, "һ����");
		List<String> ���ֵֽ� = new ArrayList<String>();
		���ֵֽ�.add(0, "�ӱ���");
		���ֵֽ�.add(1, "������");
		���ֵֽ�.add(2, "��˳��");
		List<String> ��ƽ�ֵ� = new ArrayList<String>();
		��ƽ�ֵ�.add(0, "������");
		��ƽ�ֵ�.add(1, "������");
		��ƽ�ֵ�.add(2, "����");
		HashMap<String, List<String>> ����ʡ������ֵ���ӳ�� = new LinkedHashMap<String, List<String>>();
		����ʡ������ֵ���ӳ��.put("������", �����ֵ�);
		����ʡ������ֵ���ӳ��.put("������", ���ֵֽ�);
		����ʡ������ֵ���ӳ��.put("��ƽ��", ��ƽ�ֵ�);

		ʡ��ӳ��.put("����ʡ", ����ʡ������ֵ���ӳ��);
	}

	public static void main(String[] args) {
		readFile2Map();
		
//		System.out.println("------");
//		Set<String> sheng = ʡ��ӳ��.keySet();
//		Iterator<String> iterator = sheng.iterator();
//		while (iterator.hasNext()) {
//			String p = iterator.next();
//			System.out.println(p);
//			Map<String, List<String>> chengshiMap = ʡ��ӳ��.get(p);
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
		
		
//			System.out.println("------ д���ļ�c:\\data-ligp.txt");			
//			write2File();
//			System.out.println("------ д�����");
//		}
	}
	
	/**
	 * http://www.bejson.com/   ���߼��json��ʽ����վ
	 */
	private static void write2File(){
		File file = new File("c:\\data-ligp.txt");
		
		//����ļ������ھʹ������ļ�
		if (!file.exists()) {
			try {
				file.createNewFile(); //
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//JSON��  alibaba
		String jsonstr = JSON.toJSONString(ʡ��ӳ��);// ��һ�����ӵ�map����ת����һ���ַ���(����json��ʽ���ַ���)
		System.out.println("json�ַ���:"+jsonstr);
		
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
	 * ��һ���ļ��ж�ȡһ�η���json��ʽ���ַ���,������ת��Ϊmap����
	 * ǰ�� : ��������ļ��Ѿ����� ,����������һ������json�淶���ַ���
	 */
	public static void readFile2Map(){
		File file = new File("c:\\data-ligp.txt");
		
		FileReader in = null;
		
		// �����������ȡ  ,�����ڴ���,�ٷŵ�һ���ַ�������
		try {
			in = new FileReader(file);
			char[] c = new char[1024];
			StringBuffer sb = new StringBuffer("");
			while(in.read(c)!=-1){
				sb.append(c);
				c=new char[1024];
			}
			in.close();
			
			String jsonStr = sb.toString().trim();//������Ŀո��ȡ��  ,trim() :ȥ���ҿո� 
			System.out.println(jsonStr);
			
			
			Map maps = JSON.parseObject(jsonStr);//��stringת����һ��map����
			
			
			//��ѭ�����map ,��һ���ܲ��ܻ�ԭ��ԭ��������
			System.out.println("------");
			Set<String> sheng = maps.keySet();
			Iterator<String> iterator = sheng.iterator();
			while (iterator.hasNext()) {
				String p = iterator.next();
				System.out.println(p);
				Map<String, List<String>> chengshiMap = ʡ��ӳ��.get(p);
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
