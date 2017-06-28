package com.oaec.hello;
import java.util.*;
/**题目
 * 连续输入你的用户名#密码，一次打印出来，效果：
 * 请输入你的用户名#密码：
 *   kdfjkd#123
 *   jsdkl#254
 *   用户名：kdfjkd	密码：123	
 *	   用户名：jsdkl	            密码：254	
 */
public class Username {

	/*NUM是你连续输入的次数*/
	private static final int NUM=2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner input=new Scanner(System.in);
		System.out.println("请输入你的用户名#密码：");
		String str=input.next();
		String[] str1=str.split("#");
		for(int i=0;i<str1.length;i++){
			System.out.println(str1[i]);
		}*/
		
		/*int a;不使用时可以通过编译，使用时必须要初始化（局部变量必须赋值才可使用，成员变量有默认值）*/
//		int a = 0;
//		System.out.println(a);
		
		/*连续输入3次，一次打印出来*/
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你的用户名#密码：");
		String[] str=new String[3];
		for(int i=0;i<NUM;i++){
			str[i]=input.next();	
		}
		
		/*打印出来*/
		for(int i=0;i<NUM;i++){
			String[] str1=str[i].split("#");//String.split();以#号将字符串分割存入字符串数组中
			for(int j=0;j<str1.length;j++){
				if(j%2==0){//判断数组的下标，偶数的是用户名，奇数的是密码
					System.out.print("用户名："+str1[j]+"\t");
				}else{
					System.out.print("密码："+str1[j]+"\t");
				}
			}
			System.out.println();
		}
		
		
	}

}
