package Afile�ļ���;

import java.io.File;
import java.io.IOException;

/**
 * �ݹ鷽ʽʵ�� show�����ǵݹ�
 * 
 * @author Administrator
 * 
 */
public class ʵ�ֲ鿴e��������Ŀ¼����Ŀ¼�������ļ� {

	public static void show(File file) {
		if (file != null) {
			if (file.isDirectory()) {
				File[] listFiles = file.listFiles();
				if (listFiles != null) {
					for (int i = 0; i < listFiles.length; i++) {
						show(listFiles[i]);//�ݹ����
					}
				}else{
					System.out.println("listFiles���ʹ���,�����˿ն���   ------------------------");
				}
			} else {
				System.out.println(file);
			}
		}else{
			System.out.println("file���ʹ���,�����˿ն���   ------------------------");
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