package com.oaec.test;
import java.io.*;
import java.util.*;
/**IO流案例*/
public class My_IO {
	public static void main(String[] args) throws Exception {
		io_String();
//		copy();
//		copy1();
//		copy2();
//		copy3();
	}
	
	/**String的构造方法可以把字节直接转化为String
	 * @throws Exception */
	public static void io_String() throws Exception{
		File file = new File("F://DvdData.java");
		BufferedInputStream input = new BufferedInputStream(new FileInputStream(file));
		byte[] b = new byte[1024];
		input.read(b);
		System.out.println(new String(b));	
	}
	
	/**字节流*/
	public static void copy() throws Exception{
		/*输入流,字节流*/
		File file=new File("F://Data.txt");
		FileInputStream input=new FileInputStream(file);
		byte[] b=new byte[(int)file.length()];
		input.read(b);
		/*输出流,字节流*/
		File file1=new File("E://"+file.getName());
		FileOutputStream output=new FileOutputStream(file1);
		output.write(b);
		System.out.println(Arrays.toString(b));
		input.close();
		output.close();
	}
	
	/**字符流*/
	public static void copy1() throws Exception{
		/*输入流,字符流*/
		File file=new File("F://Data.java");
		FileReader reader=new FileReader(file);
		char[] c=new char[(int) file.length()];
		reader.read(c);
		/*输出流,字符流*/
		File file1=new File("E://"+file.getName());
		FileWriter writer=new FileWriter(file1,true);
		writer.write(c);
		reader.close();
		writer.close();
	}
	
	/**Buffered字节流*/
	public static void copy2() throws Exception{
		/*BufferedInputStream*/
		File file=new File("F://Data.java");
		BufferedInputStream input=new BufferedInputStream(new FileInputStream(file));
		byte[] b=new byte[(int)file.length()];
		input.read(b);
		System.out.println(new String(b));
		input.close();
		/*BufferedOutputStream*/
		File file1=new File("E://Data.java");
		BufferedOutputStream output=new BufferedOutputStream(new FileOutputStream(file1));
		output.write(b);
		output.close();
	}
	
	/**Buffered字符流*/
	public static void copy3() throws Exception{
		/*BufferedInputStream*/
		File file=new File("F://Data.java");
		BufferedReader reader=new BufferedReader(new FileReader(file));
		char[] c=new char[(int)file.length()];
		reader.read(c);
		System.out.println(new String(c));
		reader.close();
		/*BufferedOutputStream*/
		File file1=new File("E://Data.java");
		BufferedWriter writer=new BufferedWriter(new FileWriter(file1,true));
		writer.write(c);
		writer.close();
	}
	
	/**DataOutputStream与DavaInputStream*/
	public static void oneNote() throws Exception{
		File file=new File("F://Data.txt");
		DataOutputStream output=new DataOutputStream(new FileOutputStream(file));
		DataInputStream input=new DataInputStream(new FileInputStream(file));
		output.writeInt(123);
		output.writeUTF("abc");
		System.out.println(input.readInt());
		System.out.println(input.readUTF());
		output.close();
		input.close();
	}
}
