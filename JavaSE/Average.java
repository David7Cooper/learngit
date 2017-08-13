import java.util.Scanner;
public class Average{                                         
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入3个数：");
		double[] a=new double[3];
		double sun=0;
		for(int i=0;i<3;i++){                 
			a[i]=input.nextDouble();
			sun+=a[i];
		}
		System.out.println("平均值为："+sun/3);
	}
}   