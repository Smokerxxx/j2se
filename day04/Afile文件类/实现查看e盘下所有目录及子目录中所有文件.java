package Afile文件类;

import java.io.File;
import java.io.IOException;

/**
 * 递归方式实现 show方法是递归
 * 
 * @author Administrator
 * 
 */
public class 实现查看e盘下所有目录及子目录中所有文件 {

	public static void show(File file) {
		if (file != null) {
			if (file.isDirectory()) {
				File[] listFiles = file.listFiles();
				if (listFiles != null) {
					for (int i = 0; i < listFiles.length; i++) {
						show(listFiles[i]);//递归调用
					}
				}else{
					System.out.println("listFiles类型错误,产生了空对象   ------------------------");
				}
			} else {
				System.out.println(file);
			}
		}else{
			System.out.println("file类型错误,产生了空对象   ------------------------");
		}
	}

	public static void main(String args[]) {
		long start = System.currentTimeMillis();
		File my = new File("e:" + File.separator);
		show(my);
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000);
	}

};