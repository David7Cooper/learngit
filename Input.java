import java.util.Scanner;
public class Input{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个三位整数：");
		int a=input.nextInt();
		int b=a/100;
		int c=a%100/10;
		int d=a%100%10;
		//int e=d*100+c*10+b;
		System.out.println("颠倒后的结果是："+d+c+b);
	}
}