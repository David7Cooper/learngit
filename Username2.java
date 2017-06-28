package com.oaec.hello;
import java.util.Scanner;
public class Username2 {

	public static void main(String[] args) {
		String [] str = new String[10];//偶数是用户名，奇数是密码
		Scanner scanner = new Scanner(System.in);
		System.out.println("------------现在开始录入学生信息!------------");
		for(int i=0;i<str.length;i+=2){//str.length;限制你输入的次数
			System.out.println("----------请输入用户名及密码用#分隔!-------");
			String input = scanner.next();
			if (input.contains("#")) {//如果输入的字符串input中包含#返回true
				String[] split = input.split("#");
				if (split.length==2) {//分割为长度为2的字符串数组
					str[i] = split[0];
					str[i+1] = split[1];
				}else {
					System.out.println("用户名或密码不能为空!");
					i-=2;
				}
			}else {
				System.out.println("ERROR,请用#分隔！");
				i-=2;
			}
		}
		for (int i = 0; i < str.length; i+=2) {
			System.out.print("用户名："+str[i]+",");
			System.out.print("密码："+str[i+1]);
			System.out.println();
		}
		
		
	}

}

