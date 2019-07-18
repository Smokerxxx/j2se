package G字节流与字符流之间的转换;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("e:\\mydoc\\日文.txt");
			FileOutputStream fos = new FileOutputStream("e:\\mydoc\\日文_222.txt");
			
			
			//转换过程  , 包装
			
			// ISO-8859-1  国际编码    UTF-8也是国际编码     gbk 繁体+简体的编码    gb2312  简体字编码
			new InputStreamReader(fis);
			InputStreamReader inputstreamReader = new InputStreamReader(fis, "ISO-8859-1"); // 将字节流以utf-8的编码格式,读入到内存中
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fos, "ISO-8859-1");// 将字符流转换到字节流
			char[] c = new char[1024];
			int data=0;
			
			while((data=inputstreamReader.read(c))!=-1){
				for (int i = 0; i < c.length; i++) {
					System.out.print(c[i]);
				}
				System.out.println();
				outputStreamWriter.write(c, 0, data);
			}
			
			inputstreamReader.close();
			outputStreamWriter.close();
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
