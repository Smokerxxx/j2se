package H练习;
/**
 * 编写一个售票程序,模拟4个人买票,顺序张三(100),李四(50)王五(20)赵六(10) ,
 *  票每张10元 , 售票者手里现有3张10元 . 编程实现卖票逻辑.
 * @author Administrator
 *
 */
public class Lianxi4 {
	public static void main(String[] args) {
		//卖票逻辑   
		Sale sale = new Sale();
		
		//创建买票的人
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
			System.out.println("当前10元面值有:"+sale.number10);

			System.out.println("当前20元面值有:"+sale.number20);

			System.out.println("当前50元面值有:"+sale.number50);

			System.out.println("当前100元面值有:"+sale.number100);
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
				System.out.println("拿了"+bizhong+"元来买票 , 售出一张票,正好,无需找零");
			} else if(bizhong==20&& number10>=1) {
				number20 = number20+1;
				number10 = number10-1;
				System.out.println("拿了"+bizhong+"元来买票 , 售出一张票,找零10元");
			} else if(bizhong==50) {
				while((number20==1&&number10<2)
						||(number20==0&&number10<4)){
					Thread.currentThread().yield();//重新排队等待零钱够了再买
					System.out.println("拿了"+bizhong+"元来买票 , 没有零钱,暂时无法售票");
				}
				
				if (number20==1&&number10>=2) {
					number20 = number20-1;
					number10 = number10-2;
					number50 = number50+1;
					System.out.println("拿了"+bizhong+"元来买票 , 售出一张票,找零20元*1,10元*2");
				} else if(number20==0&&number10>=4){
					number10 = number10-4;
					number50 = number50+1;
					System.out.println("拿了"+bizhong+"元来买票 , 售出一张票,找零10元*4");
				}
			}else if(bizhong==100) {
				if ((number10*10+number20*20+number50*50)>=bizhong) {
					System.out.println("100元也可以找零了");
				}else{
					Thread.currentThread().yield();//重新排队等待零钱够了再买
					System.out.println("拿了"+bizhong+"元来买票 , 没有零钱,暂时无法售票");
				}
			}
		}
		
}