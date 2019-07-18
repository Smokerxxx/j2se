package C文本输入输出流;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
/**
 * FileReader   和    FileWriter   配合 StringBuffer  和  char[ ]数组 实现文字的读写  
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		try {
			
			File file = new File("e:"+File.separator+"mydoc"+File.separator+"新闻.txt");
			
			File outfile = new File("e:"+File.separator+"mydoc"+File.separator+"新闻copy.txt");
			
			FileReader fr = null;
			FileWriter fw = null;
			StringBuffer sb = new StringBuffer("");
			fr = new FileReader(file);
			fw = new FileWriter(outfile);
			
			
			char[] c = new char[1024];
			int data = 0;
			//字符输入流
			while((data=fr.read(c))!=-1){ //一次读2k内容
				fw.write(c, 0, data);// 完整复制原文件的长度
				c=new char[1024];//重置数组
			}
			
			//注意: 该方法读取文件时, 最后可能会有多余的空格 ,  原因:每次都读2k ,即使没有内容了 ,多余的内容就用空白代替了
//			while(fr.read(c)!=-1){
//				sb.append(c);
//				c=new char[1024];
//			}
//			fw.write(sb.toString());
			
			fr.close();
			fw.close();
			System.out.println("写入完毕");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
