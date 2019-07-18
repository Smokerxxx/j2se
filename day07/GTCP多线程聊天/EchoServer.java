package GTCP多线程聊天;

import java.net.* ;
import java.io.* ;
/**
 * 使用多线程 ,可以让多个客户端同时连接服务器,进行通话
 * @author lgp
 *
 */
public class EchoServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket server = null;
		Socket client =null;
		PrintStream out= null;//打印流对象,向客户端输出内容
		BufferedReader buf=null;
		server = new ServerSocket(8888);
		boolean f=true;
		while(f){
			System.out.println("服务器运行,等待客户端连接");
			client = server.accept();
			
			// 每一个客户端表示一个线程  ,每个线程都包含 一个当前客户端与同一个服务器的交互
			new Thread(new EchoThread(client)).start() ;	
		}
		server.close();
	}

}
