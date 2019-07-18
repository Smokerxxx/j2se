package string;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(":");
		
		for (int i = 0; i < 10; i++) {
			sb.append(i);// 在sb的末尾插入新内容
		}
		


		
		for (int i = sb.length()-3; i >0; i=i-3) {
			sb.insert(i, ","); //在sb的中间插入新内容
		}
		
		String newStr = sb.toString();
		System.out.println(newStr);
		
		
		
		
		//int  21亿...
		//byte  ~128 - 127
		//long
		//double
		//char
		//short
		//float
		//boolean
		
	}

}
