package newDay;
import java.io.*;
import java.net.*;
public class ServerTcp {
	public static void main(String[] args) throws Exception {	
//		my_Socket();
//		my1_Socket();
//		my2_Socket();
		my3_Socket();
	}
	
	/**Socket字节输入流*/
	public static void my_Socket() throws Exception{
		/*创建一个ServerSocket对象*/
		ServerSocket serverSocket = new ServerSocket(3000);
		/*等待接受客户端请求*/
		Socket socket = serverSocket.accept();
		/*从Socket中获取IO流*/
		InputStream input = socket.getInputStream();
		byte[] b = new byte[1024];
		input.read(b);
		System.out.println(new String(b));
		input.close();
		socket.close();	
		serverSocket.close();
	}
	
	/**Socket字节输入流*/
	public static void my1_Socket() throws Exception{
		ServerSocket serverSocket = new ServerSocket(3000);
		Socket socket = serverSocket.accept();
		BufferedInputStream input = new BufferedInputStream(socket.getInputStream());
		byte[] b = new byte[1024];
		input.read(b);
		System.out.println(new String(b));
		input.close();
		socket.close();	
		/*serverSocket.close();*/
	}
	
	/**Socket字符输入流*/
	public static void my2_Socket() throws Exception{
		ServerSocket serverSocket = new ServerSocket(3000);
		Socket socket = serverSocket.accept();
		BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		while(reader.ready()){
			System.out.println("server"+reader.readLine());
		}	
		reader.close();
		socket.close();
		serverSocket.close();
	}
	
	public static void my3_Socket() throws Exception{
		ServerSocket serverSocket = new ServerSocket(3000);
		Socket socket = serverSocket.accept();
		BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.print(reader.readLine());
		reader.close();
		socket.close();
		serverSocket.close();
	}
}
