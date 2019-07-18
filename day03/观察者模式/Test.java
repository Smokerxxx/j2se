package 观察者模式;
/**
 * java.util.ObServable 类  被观察者 
 * java.util.Observer 接口  观察者   , 重写 update方法 ,
 * 
 * 当观察者发生变化   ,所有被观察者  会被触发update方法
 * 
 * addObserver() ; 添加观察者  
 * 
 * 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House house = new House("5楼1号",10000);
		
		KanFangZhe kanFangZhe = new KanFangZhe("张三");
		KanFangZhe kanFangZhe2 = new KanFangZhe("李四");
		
		house.addObserver(kanFangZhe);//被观察者添加观察者
		house.addObserver(kanFangZhe2);//被观察者添加观察者
		
		
		house.setDanjia(7500);
		house.setName("502");
		
		house.deleteObserver(kanFangZhe2);//删除某个观察者
		
		//house.setDanjia(9500);
	}

}
