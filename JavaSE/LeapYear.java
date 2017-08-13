import java.util.Scanner;
public class LeapYear{ 
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入年份：");
		int y=input.nextInt();
		System.out.print("请输入月：");
		int m=input.nextInt();
		int[] a={31,29,31,30,31,30,31,31,30,31,30,31};
		int[] b={31,28,31,30,31,30,31,31,30,31,30,31};
		if(y%400==0 || y%4==0 && y%100!=0){
			System.out.println(y+"是闰年");
			System.out.println(m+"月有"+a[m-1]+"天");
		}else{
			System.out.println(y+"不是闰年");
			System.out.println(m+"月有"+b[m-1]+"天");
		}
		//int w=(y+(y/4)+(20/4)-(2*20)+(26*(m+1)/10))%7;
		//System.out.println(w);
		
		
		
	}
}