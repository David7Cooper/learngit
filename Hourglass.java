import java.util.*;
/**题目
 * 打印沙漏
 */
public class Hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=7,m=7;
		Scanner input=new Scanner(System.in);
		System.out.print("请先确定沙漏第一行的星号数：");
		int n=input.nextInt();
		glass(n);
	}
	
	public static void glass(int n){
		int m=n;
		while(m-2>=-1){
			if(n!=m){
				for(int i=1;i<=(n-m)/2;i++){
					System.out.print(" ");
				}
			}
			for(int i=1;i<=m;i++){
				System.out.print("*");
			}
			m-=2;
			System.out.println();
			if(m<=-1){
				m*=-1;
				m+=2;//分割点
				break;
			}
		}
		while(m+2<=(n+2)){//9
			if(n!=m){
				for(int i=1;i<=(n-m)/2;i++){
					System.out.print(" ");
				}
			}
			for(int i=1;i<=m;i++){
				System.out.print("*");
			}
			m+=2;
			System.out.println();
		}
	}

}
