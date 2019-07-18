package FLianxi2;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ECHOServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = null;
			Socket client =null;
			PrintStream outputStream= null;// 服务端的输出流  ---> 相当于客户端的输入流
			BufferedReader buf=null;// 服务端的输入流
			Scanner input = new Scanner(System.in);
			
			server = new ServerSocket(8888);
			
			boolean f= true;
			
			while(f){
				System.out.println("server is running , Waiting for client connection");
				client = server.accept();
				
				outputStream=new PrintStream(client.getOutputStream());//客户端的输出流,就是服务器端发送的内容
				
				buf=new BufferedReader(new InputStreamReader(client.getInputStream()));//客户端的输入流,即使服务器端接受的内容
				
				boolean flag  =true;
				
				while(flag){
					String str = buf.readLine();
					if (str==null || "".equals(str)) {//判断客户端结束的情况1
						flag=false;
					} else {
						if ("bye".equals(str)) {//判断客户端结束的情况2
							flag=false;
						} else {
							System.out.println("接收到客户端发来的信息是:"+str);
							System.out.println("请回复:");
							String nextLine = input.nextLine();
							outputStream.println("服务器端回复:"+nextLine);//向客户端回显信息
						}
					}
				}
				
				client.close();
			}
			server.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
