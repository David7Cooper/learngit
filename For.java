import java.util.*;

public class For {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����");
		int num = input.nextInt();
		
		/*************************************************
		*  while�������
		*/
		// while(num!=0){
			// int b=num%10;
			// System.out.print(b);
			// num/=10;
		// }
		//System.out.println(0/10);
		
		/************************************************
		*  for�������
		*/
		// for(int b=num%10;num!=0;b=num%10){
			// System.out.print(b);
			// num/=10;	
		// }
		
		// for(int i=0;true;i++){
			// System.out.print(i);
		// }
		
		/*************************************************
		*  for��while
		*/
		// int i=0;
		// while(i<10){
			// i++;//++i;
			// System.out.println(i);//1,2,3,4.5,6,7,8,9,10
		// }
		for(int i=0;i<10;i++){
			System.out.println(i);//0,1,2,3,4,5,6,7,8,9
		}
		
	
	}
}