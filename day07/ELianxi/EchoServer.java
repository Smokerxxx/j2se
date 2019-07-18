package ELianxi;

import java.net.* ;
import java.io.* ;
/**
 * 说明:
 * 从客户端输入信息   服务器都会返回信息如下:
 * 
 * 输入信息:uuu
	Echo:uuu
	输入信息:矛
	Echo:矛
	输入信息:
 * @author lgp
 *
 */
public class EchoServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket server = null;//服务器端的类
		Socket client =null;//客户端
		PrintStream outputStream= null;//打印流对象,向客户端输出内容
		BufferedReader buf=null;//输入流
		server = new ServerSocket(8888);//端口
		boolean f=true;
		while(f){
			System.out.println("服务器运行,等待客户端连接");
			client = server.accept();//接受一个客户端
			outputStream=new PrintStream(client.getOutputStream());//获取客户端的输出流
			buf= new BufferedReader(new InputStreamReader(client.getInputStream()));//获取客户端的输入信息
			
			boolean flag = true;
			
			while(flag){
				String str = buf.readLine();//从客户端的输入流中读取一行内容
				if (str==null || "".equals(str)) {//判断客户端结束的情况1
					flag=false;
				} else {
					if ("bye".equals(str)) {//判断客户端结束的情况2
						flag=false;
					} else {
						System.out.println("接收到客户端发来的信息是:"+str);
						outputStream.println("收到:"+str);//向客户端回显信息
					}
				}
			}
			
			client.close();
		}
		server.close();
	}

}

