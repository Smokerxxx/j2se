package test;
/**
 * 鸡兔同笼
 * 上有35个头,下有94足,问鸡兔各几只
 * @author Administrator
 *
 */
public class Test1 {

	public static void main(String[] args) {
		int chookNum =0;
		int rabitNum = 0;
		
		
		for (chookNum = 0; chookNum < 36; chookNum++) {
			rabitNum = 35-chookNum;
			
			if (2*chookNum +4*rabitNum==94) {
				System.out.println("鸡的数量"+chookNum+",兔子数量是"+rabitNum);
				break;
			}
		}
		

	}

}
