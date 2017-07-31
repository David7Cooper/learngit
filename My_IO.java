package com.oaec.test;
import java.io.*;
import java.util.*;
/**IO流案例*/
public class My_IO {
	public static void main(String[] args) throws Exception {
		copy();
//		copy1();
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
		File file=new File("F://Data.txt");
		FileReader reader=new FileReader(file);
		char[] c=new char[(int) file.length()];
		reader.read(c);
		/*输出流,字符流*/
		File file1=new File("E://"+file.getName());
		FileWriter writer=new FileWriter(file1);
		writer.write(c);
		reader.close();
		writer.close();
	}
}
