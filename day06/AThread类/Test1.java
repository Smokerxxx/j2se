package AThread��;

public class Test1 {

	public static void main(String[] args) {
		MyThread my1 = new MyThread("�߳�1");
		MyThread my2 = new MyThread("�߳�2");
		
//		my1.run();
//		my2.run();
		
		my1.start();
//		my2.start();
		
		
		//main����Ҳ��java�����е��߳�   ,������main����,��������Ҳ��һ���߳�
		//һ��java���������� , ����Ҫ��2���߳� ,һ����main����, һ�������������߳�
		for (int j = 0; j < 20; j++) {
			System.out.println("main����ִ��, j="+j);
		}

	}

}
