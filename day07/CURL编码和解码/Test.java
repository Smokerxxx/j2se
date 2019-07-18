package CURL编码和解码;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * URLEncoder   为信息编码( 通常要对信息进入2次的编码)
 * 
 * URLDecoder   为信息解码( 通常要对信息进入2次的解码 , 转换成正常的内容)
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		String s=" hello world   123   abc   ABC   天天向上 ";
		
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
