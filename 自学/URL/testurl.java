package URL;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class testurl {
	public static void main(String[] args) {
		try {
			URL url = new URL("http", "www.baidu.com", 80, "/index.html");
			
			InputStream is = url.openStream();
			URLConnection connection = url.openConnection();
			
			
			System.out.println(connection.getContentLength());
			System.out.println(connection.getContentEncoding());
			
			FileOutputStream fos = new FileOutputStream("d:"+File.separator+"duqu.html");
			byte [] bytes = new byte[is.available()];
			for (int i = 0; i < bytes.length; i++) {
				bytes[i] = (byte) is.read();
			}
			fos.write(bytes);
			
			fos.close();
			is.close();
			
			System.out.println("Íê³É");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
