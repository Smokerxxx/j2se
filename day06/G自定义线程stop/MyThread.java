package G�Զ����߳�stop;

/**
 * �Զ���һ��stop()����,ʵ��ֹͣ��ǰ�̵߳Ĺ���
 * 
 * 1.����һ��flag ��ʼ��Ϊtrue
 * 
 * 2. ����һ��stop����  , ����־λ��Ϊfalse
 * 
 * 3. ��run������  ,  ����whileѭ�� , �ж�flag���Ϊfalse �Ͳ�ִ��  
 * @author Administrator
 *
 */
public class MyThread implements Runnable {
	private boolean flag = true;
	@Override
	public void run() {
		int i=0;
		while (flag) {
			System.out.println(Thread.currentThread().getName()+"i="+i);
			i++;
		}
		
	}
	
	public void stop(){
		flag = false;
	}
}
