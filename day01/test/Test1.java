package test;
/**
 * ����ͬ��
 * ����35��ͷ,����94��,�ʼ��ø���ֻ
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
				System.out.println("��������"+chookNum+",����������"+rabitNum);
				break;
			}
		}
		

	}

}
