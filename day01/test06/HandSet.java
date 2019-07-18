package test06;

/**
 * 手机的基类
 * @author Administrator
 *
 */
public class HandSet {
	private String pinpai;
	private String xinghao;
	
	public void message(String str){
		System.out.println("短信内容:"+str);
	}
	
	public void call(String str){
		System.out.println("拨号:"+str);
	}
}
