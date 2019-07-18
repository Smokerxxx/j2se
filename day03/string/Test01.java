package string;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s1= new String("beijing");
		String s2= new String("beijing");
		
		System.out.println(s1==s2);
		System.out.println(s1.hashCode() +"    "+s2.hashCode());
	}

}
