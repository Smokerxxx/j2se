package test04;
/**
 * 汽车租赁的练习
 * 1.要求定义一个机动车类  ,派生 轿车  , 客车 , 卡车 3个子类  
 * 
 * 2.分别定义计算租赁价格的方法 
 * 
 * 		轿车价格计算: 如果是宝马320,每天500元  ,如果是别克GL8 , 每天600元
 * 		客车计算:   如果座位大于16  , 每天1500 , 小于16座 ,每天1000
 * 		卡车计算         如果吨位大于20吨  , 每天3000 , 小于20吨,每天2000
 * 
 * 3. 定义一个客户类 , 有一个计算租赁总价的方法 ,要求使用方法的多态性实现,传入一个机动车的数组 ,传入天数,计算总价格
 * 	public int 计算( MotoCar[] , days);
 * 
 * 4. 写一个测试main方法  ,计算一下 , 租1辆320 ,租一辆gl8, 租1辆16座的客车 , 租一个20顿的卡车,共租5天,一共需要多少钱?
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		
		//多态向上转型
		MotoMachine car1=new Jiaoche("辽a 82u42","宝马","320li");
		MotoMachine car2=new Jiaoche("辽a 88u99","别克","gl8");
		MotoMachine car3=new Keche("辽a 44u55",16);
		MotoMachine car4=new Kache("辽a 11u22",20);
		
		MotoMachine[] cars = {car1,car2,car3,car4};
		int jisuan = customer.jisuan(cars, 1);
		System.out.println("租赁总价格"+jisuan);
	}

}
