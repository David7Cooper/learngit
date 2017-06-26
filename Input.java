import java.util.Scanner;
/**题目
*  用户输入一个三位整数，倒置后输出
*  如：789，输出987
*/
/**总结
*  /10的意思是去掉个位
*  %10的意思是留下个位
*  1/10输出结果为0
*/

// public class Input{
	// public static void main(String[] args){
		// Scanner input=new Scanner(System.in);
		// System.out.print("请输入一个三位整数：");
		// int a=input.nextInt();
		// int b=a/100;
		// int c=a%100/10;
		// int d=a%100%10;
		// System.out.println("颠倒后的结果是："+d+c+b);
	// }
// }

/**题目
*  用户输入一个int类型的数，倒置后输出
*/
public class Input{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个三位整数：");
		int a=input.nextInt();
		while(a/10!=0){
			int b=a%10;
			a/=10;
			System.out.print(b);
		}
		System.out.print(a);
	}
}