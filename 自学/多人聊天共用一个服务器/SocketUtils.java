package 多人聊天共用一个服务器;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SocketUtils {
	
	public static void writeToDataOutputStream(DataOutputStream dos, String message) throws Exception {
		dos.writeUTF(message);
		dos.flush();
	}
	
	public static void writeToOutputStream(OutputStream os, String message) throws Exception {
		writeToDataOutputStream(new DataOutputStream(os), message);
	}
	
	public static void writeToSocket(Socket socket, String message) throws Exception {
		writeToOutputStream(socket.getOutputStream(), message);
	}
}
