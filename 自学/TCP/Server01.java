package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(4546);
		boolean f = true;
		while(f) {
			System.out.println("�������Ѿ����У��ȴ��ͻ�������");
			Socket client = server.accept();
			
			BufferedReader bf = new BufferedReader(new InputStreamReader(client.getInputStream()));
			PrintStream printStream = new PrintStream(client.getOutputStream());
			
			boolean flag = true;
			while(flag) {
				String str = bf.readLine();
				if(str == null || "".equals(str)) {
					flag = false;
				}else {
					System.out.println("�ͻ��˷�������Ϣ�ǣ�"+str);
					printStream.println("�յ���"+str);
				}
			}client.close();
		}server.close();
	}
}
