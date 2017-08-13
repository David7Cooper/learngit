import java.util.Scanner;
import java.lang.Math;
/**
*  从键盘输入球体的半径，求其体积和表面积
*/
public class Ball{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入球体的半径：");
		double r=input.nextDouble();
		double v=Math.PI*r*r*r*4/3;
		double s=Math.PI*r*r*4;
		System.out.println("球的体积是："+v+"\t"+"球的表面积是："+s);
	}
}