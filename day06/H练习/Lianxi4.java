package H��ϰ;
/**
 * ��дһ����Ʊ����,ģ��4������Ʊ,˳������(100),����(50)����(20)����(10) ,
 *  Ʊÿ��10Ԫ , ��Ʊ����������3��10Ԫ . ���ʵ����Ʊ�߼�.
 * @author Administrator
 *
 */
public class Lianxi4 {
	public static void main(String[] args) {
		//��Ʊ�߼�   
		Sale sale = new Sale();
		
		//������Ʊ����
		Thread t1 = new Thread(sale,"100");
		Thread t2 = new Thread(sale,"50");
		Thread t3 = new Thread(sale,"20");
		Thread t4 = new Thread(sale,"10");
		
		
		Thread t5 = new Thread(sale,"20");
		Thread t6 = new Thread(sale,"10");
		Thread t7 = new Thread(sale,"20");
		Thread t8 = new Thread(sale,"10");
		Thread t9 = new Thread(sale,"10");
		Thread t10 = new Thread(sale,"10");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		
		try {
			Thread.sleep(5000);
			System.out.println("��ǰ10Ԫ��ֵ��:"+sale.number10);

			System.out.println("��ǰ20Ԫ��ֵ��:"+sale.number20);

			System.out.println("��ǰ50Ԫ��ֵ��:"+sale.number50);

			System.out.println("��ǰ100Ԫ��ֵ��:"+sale.number100);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}


class Sale implements Runnable{
	
	
	int number10 =3;
	int number20=0;
	int number50=0;
	int number100=0;
	
	@Override
	public void run() {
			String name = Thread.currentThread().getName();
			int bizhong = Integer.parseInt(name);
			
			if (bizhong==10) {
				number10 = number10+1;
				System.out.println("����"+bizhong+"Ԫ����Ʊ , �۳�һ��Ʊ,����,��������");
			} else if(bizhong==20&& number10>=1) {
				number20 = number20+1;
				number10 = number10-1;
				System.out.println("����"+bizhong+"Ԫ����Ʊ , �۳�һ��Ʊ,����10Ԫ");
			} else if(bizhong==50) {
				while((number20==1&&number10<2)
						||(number20==0&&number10<4)){
					Thread.currentThread().yield();//�����Ŷӵȴ���Ǯ��������
					System.out.println("����"+bizhong+"Ԫ����Ʊ , û����Ǯ,��ʱ�޷���Ʊ");
				}
				
				if (number20==1&&number10>=2) {
					number20 = number20-1;
					number10 = number10-2;
					number50 = number50+1;
					System.out.println("����"+bizhong+"Ԫ����Ʊ , �۳�һ��Ʊ,����20Ԫ*1,10Ԫ*2");
				} else if(number20==0&&number10>=4){
					number10 = number10-4;
					number50 = number50+1;
					System.out.println("����"+bizhong+"Ԫ����Ʊ , �۳�һ��Ʊ,����10Ԫ*4");
				}
			}else if(bizhong==100) {
				if ((number10*10+number20*20+number50*50)>=bizhong) {
					System.out.println("100ԪҲ����������");
				}else{
					Thread.currentThread().yield();//�����Ŷӵȴ���Ǯ��������
					System.out.println("����"+bizhong+"Ԫ����Ʊ , û����Ǯ,��ʱ�޷���Ʊ");
				}
			}
		}
		
}