package F������;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Test01 {

	public static void main(String[] args) {
		try {
			
			FileReader fr = new FileReader("e:\\mydoc\\����.txt");
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("e:\\mydoc\\����_buffered.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			StringBuffer sb = new StringBuffer("");
			String line="";
			while ((line=br.readLine())!=null) {
				sb.append(line+"\r\n");
				
			}
			
			System.out.println(sb.toString());
			bw.newLine();
			bw.newLine();
			bw.write("���ŵ�����");
			bw.newLine();
			bw.newLine();
			bw.write(sb.toString());
			
			
			
			//�ڲ�����ȹر�
			br.close();
			bw.close();
			//�������ٹر�  ,������׳��쳣
			fr.close();
			fw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
