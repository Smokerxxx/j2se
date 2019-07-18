package Afile文件类;

import java.io.File;
/**
 * File类   是 对文件本身的操作   , 不能操作文件里面的内容  , 如果操作内容 ,需要配合java io进行读取 写入等等
 * 
 * File类  不仅仅表示文件  ,也可以表示文件夹  
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		try {
			//  第一个反斜线表示转译  
			File file = new File("e:\\mydoc\\test.txt");
			File dir2 = new File("e:\\mydoc");
			File file3 = new File("e:\\mydoc\\test2.json");
			File file4 = new File(".\\1\\test3.txt");
			
			
			if (file4.isFile()) {
				System.out.println("是文件");
				
				System.out.println(file4.getAbsolutePath());//绝对路径
				System.out.println(file4.getPath());//相对路径
				System.out.println(file4.getName());//获取文件名
				System.out.println(file4.length());//获取文件内容的长度
			}
			
			if (file3.isDirectory()) {
				System.out.println("是文件夹");
			}else{
				System.out.println("不是文件夹");
			}
			
			//------------------------------------
			if (file.exists()) {
				//file.delete();//删除文件
				System.out.println("delete success");
			}else{
				file.createNewFile(); //创建文件

				System.out.println("create success");
			}
			
			//--------File.separator 是可以兼容各种操作系统 , 尽量在程序中使用该分隔符 
			File file5 = new File("e:"+File.separator+"mydoc"+File.separator+"test3.json");
			if (!file5.exists()) {
				
				System.out.println("file5 not exist");
			}
			
			
			File dir1 = new File("e:"+File.separator+"mydoc2");
			
			if (!dir1.exists()) {
				dir1.mkdirs();  // 如果文件夹不存在 ,就创建
				System.out.println("dirctory create success");
			}
			
			//---------------------------
			String[] list = dir2.list();// 查看某个目录下所有的文件和文件夹的名称(不包含子文件夹的内容)
			for (String s : list) {
				System.out.println(s);
			}
			
			
			//---------------------------
			File[] listFiles = dir2.listFiles();  // 获取某个目录下所有的文件夹(不包含子文件夹的内容)
			for (File f : listFiles) {
				System.out.println(f.getName());
			}
			
			
			//------------ 练习  :遍历信息,查看 d:  或者e: 盘所有的文件夹和子文件夹 ,以及对应的文件名称,并输出
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
