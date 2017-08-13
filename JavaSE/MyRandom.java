import java.util.*;
public class MyRandom{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		Random r=new Random();//默认当前系统时间的毫秒数作为种子数
		System.out.println(r.nextDouble());//返回值[0,1)
		System.out.println(r.nextInt());//返回值[-2147483648~2147483647]
		System.out.println(r.nextInt(10));//返回值[0,8)
		System.out.println(r.nextBoolean());//返回值true or flase
		
		/**********************************************************************/
		// Random r=new Random(10);//传入种子数为10
		// System.out.println(r.nextInt(10));//返回值[0,8)，不过值一直不变
		
	}
}