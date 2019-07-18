package Runtime;

public class Test01 {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();//获取jvm运行时对象
		
		//获取最大jvm内存
		System.out.println(runtime.maxMemory());  //单位是:字节
		
		//获取剩余的jvm内存
		System.out.println(runtime.freeMemory());
		
		String str="你好";
		for (int i = 0; i < 1000; i++) {
			str+=i;
			System.out.println(str);
		}
		
		System.out.println(runtime.freeMemory());
		//垃圾回收
		runtime.gc();// java是自动回收垃圾内存 ,也可以调用该方法手动回收垃圾
		System.out.println(runtime.freeMemory());
	}

}
