import java.util.Scanner;
import java.lang.Math;
/**
*  �Ӽ�����������İ뾶����������ͱ����
*/
public class Ball{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("����������İ뾶��");
		double r=input.nextDouble();
		double v=Math.PI*r*r*r*4/3;
		double s=Math.PI*r*r*4;
		System.out.println("�������ǣ�"+v+"\t"+"��ı�����ǣ�"+s);
	}
}