package Runtime;

public class Test01 {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();//��ȡjvm����ʱ����
		
		//��ȡ���jvm�ڴ�
		System.out.println(runtime.maxMemory());  //��λ��:�ֽ�
		
		//��ȡʣ���jvm�ڴ�
		System.out.println(runtime.freeMemory());
		
		String str="���";
		for (int i = 0; i < 1000; i++) {
			str+=i;
			System.out.println(str);
		}
		
		System.out.println(runtime.freeMemory());
		//��������
		runtime.gc();// java���Զ����������ڴ� ,Ҳ���Ե��ø÷����ֶ���������
		System.out.println(runtime.freeMemory());
	}

}
