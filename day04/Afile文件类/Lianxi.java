package AfileÎÄ¼şÀà;

import java.io.File;

public class Lianxi {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Lianxi io = new Lianxi();

		io.chek(new File("e:" + File.separator));
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000);

	}

	public void chek(File a) {
		if (a.exists()) {
			File[] listFiles = a.listFiles();
			if (listFiles != null){
				for (int i = 0; i < listFiles.length; i++) {
					System.out.println(listFiles[i]);
					chek(listFiles[i]);
				}
			}
		}
	}
}
