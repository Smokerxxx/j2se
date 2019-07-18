package string;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] b = new byte[1024];
		
		String string = new String(b);
		
		byte[] bytes = string.getBytes();
		
		
		
		char[] c = new char[1024];
		
		String string2 = new String(c);
		
		char[] charArray = string2.toCharArray();
	}

}
