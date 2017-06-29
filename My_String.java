package newDay;
import java.util.*;
public class My_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		my_contains();
		my_charAt();
		my2_charAt();
	}
	
	/*从键盘输入一串字符串，如果包含1那就将这串字符串的字母全部转化为小写*/
	public static void my_contains(){
		System.out.println("从键盘输入一串字符串：");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		if (str.contains("1")) {
			System.out.println(str.toLowerCase());
		}else {
			System.out.println("您输入的字符串不符合规范");
		}
	}
	
	/*输入字符串，倒叙输出*/
	public static void my_charAt(){
		Scanner input=new Scanner(System.in);
		System.out.println("输入字符串，倒叙输出：");
		String str=input.next();
//		String str1=null;//null不能用作字符串连接
		String str1="";
		/*将字符串中的字符镜像对调*/
		for(int i=str.length()-1;i>=0;i--){
			str1+=str.charAt(i);
		}
		System.out.println(str1);
	}
	
	/*找出字符串中“abacafagajatay”字符为a的下标*/
	public static void my2_charAt(){
		System.out.println("找出字符串中“abacafagajatay”字符为a的下标，并且将a替换成*");
		String str = "abacafagajatay";
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='a') {
				s += i;
				s += " ";
			}
		}
		str = str.replace("a", "*");
		System.out.println("该字符中字符为a的下标为"+s);
		System.out.println(str);
	}
	
	
}
