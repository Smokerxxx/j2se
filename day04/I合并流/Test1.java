package I�ϲ���;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Test1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try{
			FileInputStream fis1 = new FileInputStream("e:"+File.separator+"mydoc"+File.separator+"test.txt");
			FileInputStream fis2 = new FileInputStream("e:"+File.separator+"mydoc"+File.separator+"����.txt");
			FileOutputStream fos = new FileOutputStream("e:\\mydoc\\�ϲ���.txt",true);
			SequenceInputStream seqstream = new SequenceInputStream(fis1,fis2);
			
			int data=0;
			while((data=seqstream.read())!=-1){
				fos.write(data);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
