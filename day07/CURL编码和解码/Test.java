package CURL����ͽ���;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * URLEncoder   Ϊ��Ϣ����( ͨ��Ҫ����Ϣ����2�εı���)
 * 
 * URLDecoder   Ϊ��Ϣ����( ͨ��Ҫ����Ϣ����2�εĽ��� , ת��������������)
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		String s=" hello world   123   abc   ABC   �������� ";
		
		try {
			String encode1 = URLEncoder.encode(s, "utf-8");
			System.out.println(encode1);
			
			String encode2 = URLEncoder.encode(encode1, "utf-8");
			System.out.println(encode2);
			
			
			
			String decode2 = URLDecoder.decode(encode2, "utf-8");
			String decode1 = URLDecoder.decode(decode2, "utf-8");
			System.out.println(decode1);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
