package 线程作业;
/**
 * 设计一个生产电脑和搬运电脑的类, 要求生产出一台电脑就搬走一台电脑,如果没有新电脑生产出来,则搬运工要等待新电脑产出;
如果生产出的电脑没有搬走,则要等待电脑搬走之后再生产  ,并显示出生产电脑的数量;


如:
张三生产了一台编号为: 1 的电脑
李四搬运了编号为: 1 的电脑

张三生产了一台编号为: 2 的电脑
李四搬运了编号为: 2 的电脑

张三生产了一台编号为: 3 的电脑
李四搬运了编号为: 3 的电脑  
 * @author Smoke
 *
 */

public class Test {
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		Producer producer = new Producer(computer);
		Transiter transiter = new Transiter(computer);
		
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(transiter);
		
		t1.start();
		t2.start();
	}
}
