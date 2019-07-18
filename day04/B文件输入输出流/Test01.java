package B文件输入输出流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * FileInputStream 和 Fileoutputstream
 * 配合String 和bytes[] 数组   ,可以读写基本的文件操作了 
 * 
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		try {
			File file = new File("e:"+File.separator+"mydoc"+File.separator+"test.txt");
			
			
			// 输入流  表示  输入到内存中的数据

			FileInputStream fis = new FileInputStream(file);
//			FileInputStream fis2 = new FileInputStream("e:\\mydoc\\haha.txt"); 重载的多态
			
			System.out.println(fis.available());//获取文件的字节数量
			
			//显示在控制台上(可以利用byte数组,解决中文处理的问题)
			byte[] neirong = new byte[fis.available()];
			
			for (int i = 0; i < neirong.length; i++) {
				neirong[i]=(byte)fis.read();
			}
			
			String string = new String(neirong);
			System.out.println(string);
				
			
			
			//一个一个字节一个字节的读, 取到中文会有?产生
//			int data=0;
//			while((data=fis.read())!=-1) {
//				System.out.println((char)data+"");
//			}
			
			
			
			//-----------------------------------------
			// 输出流  表示  从内存中输出出去的数据  
			File outfile = new File("e:\\mydoc\\copytest.txt");
//			FileOutputStream fos = new FileOutputStream("");
//			FileOutputStream fos = new FileOutputStream(outfile);// 重载性
			FileOutputStream fos = new FileOutputStream(outfile,true);//第2个参数表示要将新内容追加到文件中
			
			//判断文件是否存在
			if (!outfile.exists()) {
				outfile.createNewFile();
			}
			
			string="\r\n这是我第三次要新追加的内容\r\n"+string;
			
			byte[] bytes_out = string.getBytes();
//			fos.write(bytes_out);//将字节数组全部追加到新文件中
//			fos.write(bytes_out,0,50); //追加一部分内容
			fos.write(bytes_out,0,bytes_out.length);//将字节数组全部追加到新文件中
			
//			fos.flush();// 清空缓冲中的数据,写到文件中
			fos.close();//  close方法实际已经包含了flush功能  ,所以写close就行
			System.out.println(" writer success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
