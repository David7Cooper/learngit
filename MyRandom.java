import java.util.*;
public class MyRandom{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		Random r=new Random();//Ĭ�ϵ�ǰϵͳʱ��ĺ�������Ϊ������
		System.out.println(r.nextDouble());//����ֵ[0,1)
		System.out.println(r.nextInt());//����ֵ[-2147483648~2147483647]
		System.out.println(r.nextInt(10));//����ֵ[0,8)
		System.out.println(r.nextBoolean());//����ֵtrue or flase
		
		/**********************************************************************/
		// Random r=new Random(10);//����������Ϊ10
		// System.out.println(r.nextInt(10));//����ֵ[0,8)������ֵһֱ����
		
	}
}