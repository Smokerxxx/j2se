package BURL;

/**
 * ͳһ��Դ��λ����Uniform Resource Locator����дΪURL�����ֽ�����ҳ��ַ���ǻ������ϱ�׼����Դ�ĵ�ַ��Address����
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
			
			InputStream is = url.openStream();//���ٶ���ҳ���뵽��������
			URLConnection conn = url.openConnection();//URLConnection �ǻ�ȡurl��ͨ��Ϣ�Ĺ�����
			OutputStream os = conn.getOutputStream();//ͨ��conn���� ,��ȡһ�������  , �������������Ӧ��url��(��һ������)
			
			
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
