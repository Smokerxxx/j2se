package TCP多线程聊天;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class EhcoThread implements Runnable {
	private Socket client = null;

	public EhcoThread(Socket client) {
		super();
		this.client = client;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			PrintStream printStream = new PrintStream(client.getOutputStream());
			BufferedReader bf = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			boolean flag = true;
			while(flag) {
				String str = bf.readLine();
				if(str == null || "".equals(str)) {
					flag = false;
				}else {
					if("bye".equals(str)) {
						flag = false;
					}else {
						printStream.println(client.getInetAddress().getHostAddress()+"输入了:"+str);
					}
				}
			}client.close();
			bf.close();
//			printStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
