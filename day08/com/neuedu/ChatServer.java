package com.neuedu;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * 聊天室服务器
 * @author Administrator
 *
 */
public class ChatServer {

	public static final String EXIT = "exit";
	
	public static final int PORT=8888;
	
	static Map<String ,Socket> nickNameSocketMap = new HashMap<>();
	
	public static void main(String[] args) {
		//try括号里所有实现了closeAble接口的类都可以写在这里 ,
		// 最常见的包括   , 流操作 , socket操作 ,
		// 允许写多行语句 ,执行完毕后 ,会自动关闭try中声明的对象,自动调用close方法
		try(ServerSocket ss = new ServerSocket(PORT);) {
			System.out.println("聊天室服务器已经启动 , 正在监听"+PORT+"端口");
			while(true){
				Socket socket = ss.accept();//阻断程序运行 ,直到有一个客户端连接到服务器端后 ,程序才会向下走
				
				System.out.println("有新用户连接到服务器,当前用户的信息"+socket.toString());
				
				new Thread(new ChatServerRunnable(socket)).start();//将一个客户端添加到一个线程中 ,并调用start()启动线程
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
