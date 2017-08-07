package newDay;
import java.io.*;
import java.net.*;
public class ClientTCP {
	public static void main(String[] args) throws Exception{
//		my_Socket();
//		my1_Socket();
		my2_Socket();
	}
	
	/**Socket字节流*/
	public static void my_Socket() throws Exception{
		/*创建一个Socket对象*/
		Socket socket = new Socket("127.0.0.1",3000);
		/*从Socket中获取IO流*/
		OutputStream output = socket.getOutputStream();
		String str = "你好";
		output.write(str.getBytes());
		output.close();
		socket.close();
	}
	
	/**Socket字节流*/
	public static void my1_Socket() throws Exception{
		Socket socket = new Socket("127.0.0.1",3000);
		BufferedOutputStream output = new BufferedOutputStream(socket.getOutputStream());
		String str = "你好";
		output.write(str.getBytes());
		output.close();
		socket.close();
	}
	
	/**Socket字符流*/
	public static void my2_Socket() throws Exception{
		Socket socket = new Socket("127.0.0.1",3000);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		/*writer.write("lsadfjklasdsdalfasd"+"\n"+"alskdfjkalsj");*/
		writer.write("lsadfjklasdsdalfasd\nalskdfjkalsj");
		writer.close();
		socket.close();
	}
}
