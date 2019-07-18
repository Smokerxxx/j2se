package AThread类;

public class Test1 {

	public static void main(String[] args) {
		MyThread my1 = new MyThread("线程1");
		MyThread my2 = new MyThread("线程2");
		
//		my1.run();
//		my2.run();
		
		my1.start();
//		my2.start();
		
		
		//main方法也是java程序中的线程   ,不光是main方法,垃圾回收也是一个线程
		//一个java程序启动后 , 至少要有2各线程 ,一个是main方法, 一个是垃圾回收线程
		for (int j = 0; j < 20; j++) {
			System.out.println("main方法执行, j="+j);
		}

	}

}
