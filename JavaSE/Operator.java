/**
*  运算符
*/
public class Operator{
	
	public static void main(String[] args){
		char x='a';
		System.out.println(x);//输出结果a
		System.out.println(x+1);//输出结果98
		System.out.println((char)(x-32));//输出结果A
		
		int x1=10,x2=4;
		System.out.println(++x2+x1--*++x1);//输出结果5+10*10=105,5+10*11=115
		
		int num3=101,num4=6;
		System.out.println(num3|num4);//输出结果103
		System.out.println(num3&num4);//输出结果4
		System.out.println(~num3);//输出结果-102
		System.out.println(num4^num3);//输出结果99，一样为1
		
	}
}   