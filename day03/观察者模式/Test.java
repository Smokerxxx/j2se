package �۲���ģʽ;
/**
 * java.util.ObServable ��  ���۲��� 
 * java.util.Observer �ӿ�  �۲���   , ��д update���� ,
 * 
 * ���۲��߷����仯   ,���б��۲���  �ᱻ����update����
 * 
 * addObserver() ; ��ӹ۲���  
 * 
 * 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House house = new House("5¥1��",10000);
		
		KanFangZhe kanFangZhe = new KanFangZhe("����");
		KanFangZhe kanFangZhe2 = new KanFangZhe("����");
		
		house.addObserver(kanFangZhe);//���۲�����ӹ۲���
		house.addObserver(kanFangZhe2);//���۲�����ӹ۲���
		
		
		house.setDanjia(7500);
		house.setName("502");
		
		house.deleteObserver(kanFangZhe2);//ɾ��ĳ���۲���
		
		//house.setDanjia(9500);
	}

}
