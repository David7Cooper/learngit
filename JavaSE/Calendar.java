package com.oaec.hello;
import java.util.*;
/**题目
 * 日历
 */
public class Calendar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leapyear();
	}
	
	/*用面向过程的方式实现*/
	public static void leapyear(){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入年份：");
		int y=input.nextInt();
		System.out.print("请输入月：");
		int m=input.nextInt();
		int[] a={31,29,31,30,31,30,31,31,30,31,30,31};
		int[] b={31,28,31,30,31,30,31,31,30,31,30,31};
		int w=(y+(y/4)+(20/4)-(2*20)+(26*(m+1)/10))%7+1;
		String str="";
		for(int i=0;i<w;i++){
			str+="\t"+",";
		}
		int num=0;
		if(y%400==0 || y%4==0 && y%100!=0){
			System.out.println(y+"是闰年");
			System.out.println(m+"月有"+a[m-1]+"天");
			num=a[m-1];
		}else{
			System.out.println(y+"不是闰年");
			System.out.println(m+"月有"+b[m-1]+"天");
			num=b[m-1];
		}
		System.out.println("星期天"+"\t"+"星期一"+"\t"+"星期二"+"\t"+"星期三"+"\t"+"星期四"+"\t"+"星期五"+"\t"+"星期六");
		for(int i=1;i<=num;i++){
			str+=i+"\t"+",";
		}
		String[] str1=str.split(",");
		for(int i=0;i<str1.length;i++){
			if(i%7==0){
				System.out.println();
			}
			System.out.print(str1[i]);
		}
	}

}
