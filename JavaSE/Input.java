import java.util.Scanner;
/**��Ŀ
*  �û�����һ����λ���������ú����
*  �磺789�����987
*/
/**�ܽ�
*  /10����˼��ȥ����λ
*  %10����˼�����¸�λ
*  1/10������Ϊ0
*/

// public class Input{
	// public static void main(String[] args){
		// Scanner input=new Scanner(System.in);
		// System.out.print("������һ����λ������");
		// int a=input.nextInt();
		// int b=a/100;
		// int c=a%100/10;
		// int d=a%100%10;
		// System.out.println("�ߵ���Ľ���ǣ�"+d+c+b);
	// }
// }

/**��Ŀ
*  �û�����һ��int���͵��������ú����
*/
public class Input{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ����λ������");
		int a=input.nextInt();
		while(a/10!=0){
			int b=a%10;
			a/=10;
			System.out.print(b);
		}
		System.out.print(a);
	}
}