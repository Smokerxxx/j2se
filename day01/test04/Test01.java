package test04;
/**
 * �������޵���ϰ
 * 1.Ҫ����һ����������  ,���� �γ�  , �ͳ� , ���� 3������  
 * 
 * 2.�ֱ���������޼۸�ķ��� 
 * 
 * 		�γ��۸����: ����Ǳ���320,ÿ��500Ԫ  ,����Ǳ��GL8 , ÿ��600Ԫ
 * 		�ͳ�����:   �����λ����16  , ÿ��1500 , С��16�� ,ÿ��1000
 * 		��������         �����λ����20��  , ÿ��3000 , С��20��,ÿ��2000
 * 
 * 3. ����һ���ͻ��� , ��һ�����������ܼ۵ķ��� ,Ҫ��ʹ�÷����Ķ�̬��ʵ��,����һ�������������� ,��������,�����ܼ۸�
 * 	public int ����( MotoCar[] , days);
 * 
 * 4. дһ������main����  ,����һ�� , ��1��320 ,��һ��gl8, ��1��16���Ŀͳ� , ��һ��20�ٵĿ���,����5��,һ����Ҫ����Ǯ?
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		
		//��̬����ת��
		MotoMachine car1=new Jiaoche("��a 82u42","����","320li");
		MotoMachine car2=new Jiaoche("��a 88u99","���","gl8");
		MotoMachine car3=new Keche("��a 44u55",16);
		MotoMachine car4=new Kache("��a 11u22",20);
		
		MotoMachine[] cars = {car1,car2,car3,car4};
		int jisuan = customer.jisuan(cars, 1);
		System.out.println("�����ܼ۸�"+jisuan);
	}

}
