import java.util.Scanner;
public class Compare{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] a=new int[3];
		System.out.println("������3�����Ƚϴ�С��");
		for(int i=0;i<3;i++){
			a[i]=input.nextInt();
		}
		if(a[0]>a[1] & a[0]>a[2]){//��&�ķ�ʽ���Ƚϴ�С��&���߶�Ҫ�ж�
			System.out.println("�������ǣ�"+a[0]);
		}
		if(a[1]>a[0] & a[1]>a[2]){
			System.out.println("�������ǣ�"+a[1]);
		}
		if(a[2]>a[0] & a[2]>a[1]){
			System.out.println("�������ǣ�"+a[2]);
		}
	}
}