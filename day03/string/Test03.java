package string;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(":");
		
		for (int i = 0; i < 10; i++) {
			sb.append(i);// ��sb��ĩβ����������
		}
		


		
		for (int i = sb.length()-3; i >0; i=i-3) {
			sb.insert(i, ","); //��sb���м����������
		}
		
		String newStr = sb.toString();
		System.out.println(newStr);
		
		
		
		
		//int  21��...
		//byte  ~128 - 127
		//long
		//double
		//char
		//short
		//float
		//boolean
		
	}

}
