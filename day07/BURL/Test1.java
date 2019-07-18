package BURL;

/**
 * 统一资源定位符（Uniform Resource Locator，缩写为URL），又叫做网页地址，是互联网上标准的资源的地址（Address）。
 */
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http","www.baidu.com",80,"/index.html");
			
			InputStream is = url.openStream();//将百度首页读入到输入流中
			URLConnection conn = url.openConnection();//URLConnection 是获取url普通信息的工具类
			OutputStream os = conn.getOutputStream();//通过conn对象 ,获取一个输出流  , 将内容输出到对应的url上(不一定好用)
			
			
			System.out.println(conn.getContentEncoding());
			System.out.println(conn.getContentLength());
			System.out.println(conn.getLastModified());
			System.out.println(conn.getContentType());
			
			
			byte[] b = new byte[is.available()];
			FileOutputStream fos = new FileOutputStream("e:\\hahah.html");
			for (int i = 0; i < b.length; i++) {
				b[i]=(byte)is.read();
			}
			fos.write(b, 0, b.length);
			
			is.close();
			fos.close();
			
			System.out.println("over");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
