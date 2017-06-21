import java.util.Scanner;
public class Compare{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] a=new int[3];
		System.out.println("请输入3个数比较大小：");
		for(int i=0;i<3;i++){
			a[i]=input.nextInt();
		}
		if(a[0]>a[1] & a[0]>a[2]){//用&的方式来比较大小，&两边多要判断
			System.out.println("最大的数是："+a[0]);
		}
		if(a[1]>a[0] & a[1]>a[2]){
			System.out.println("最大的数是："+a[1]);
		}
		if(a[2]>a[0] & a[2]>a[1]){
			System.out.println("最大的数是："+a[2]);
		}
	}
}