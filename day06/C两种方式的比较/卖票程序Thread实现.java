package C���ַ�ʽ�ıȽ�;
/**
 * �޷���������
 * @author Administrator
 *
 */
public class ��Ʊ����Threadʵ�� {
	public static void main(String[] args) {
		mythread  p1 = new mythread();
		mythread  p2 = new mythread();
		mythread  p3 = new mythread();
		
		p1.start();
		p2.start();
		p3.start();
	}
}




//�ڲ���
class mythread extends Thread{
	 int tickets=5;
	 
	 public void run(){
		 for (int i = 0; i <10 ; i++) {
			if (tickets>0) {
				tickets--;
				System.out.println("��Ʊ:��ǰƱ="+tickets);
				
			}
		}
	 }
}