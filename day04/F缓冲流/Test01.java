package F缓冲流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Test01 {

	public static void main(String[] args) {
		try {
			
			FileReader fr = new FileReader("e:\\mydoc\\新闻.txt");
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("e:\\mydoc\\新闻_buffered.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			StringBuffer sb = new StringBuffer("");
			String line="";
			while ((line=br.readLine())!=null) {
				sb.append(line+"\r\n");
				
			}
			
			System.out.println(sb.toString());
			bw.newLine();
			bw.newLine();
			bw.write("新闻的正文");
			bw.newLine();
			bw.newLine();
			bw.write(sb.toString());
			
			
			
			//内层的流先关闭
			br.close();
			bw.close();
			//外层的流再关闭  ,否则会抛出异常
			fr.close();
			fw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
