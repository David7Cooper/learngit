import java.util.Scanner;
public class LeapYear{ 
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("��������ݣ�");
		int y=input.nextInt();
		System.out.print("�������£�");
		int m=input.nextInt();
		int[] a={31,29,31,30,31,30,31,31,30,31,30,31};
		int[] b={31,28,31,30,31,30,31,31,30,31,30,31};
		if(y%400==0 || y%4==0 && y%100!=0){
			System.out.println(y+"������");
			System.out.println(m+"����"+a[m-1]+"��");
		}else{
			System.out.println(y+"��������");
			System.out.println(m+"����"+b[m-1]+"��");
		}
		//int w=(y+(y/4)+(20/4)-(2*20)+(26*(m+1)/10))%7;
		//System.out.println(w);
		
		
		
	}
}