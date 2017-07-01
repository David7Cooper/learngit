package newDay;
import java.util.*;
public class My_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		my_contains();
		my_charAt();
		my2_charAt();
		my3_charAt();
		my_substring();
		my_indexOf();
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
	
	/*输入字符串，倒叙输出*/
	public static void my3_charAt(){
		Scanner input=new Scanner(System.in);
		String str=input.next();
		/*for(int i=1;i<str.length()-1;i++){
			char ch=str.charAt(i);
			str.charAt(i)=str.charAt(str.length()-i);
			str.charAt(str.length()-i)=ch;//str.charAt(str.length()-i)不是一个变量，不可赋值
		}*/
		char[] ch=new char[str.length()];//动态初始化数组规定数组的长度为字符串的长度
		for(int i=0;i<ch.length;i++){
			ch[i]=str.charAt(i);//把String分割成字符放入字符数组ch中
		}
		for(int i=1;i<=(ch.length-1)/2;i++){//i<(ch.length-1)/2得出的范围对调不了偶数中间的的两个数
			char temp=ch[i];
			ch[i]=ch[ch.length-i-1];
			ch[ch.length-i-1]=temp;
		}
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]);
		}
	}
	
	/*从键盘输入字符串，然后再输入你要查找的字符串，判断字符串的个数*/
	public static void my_substring(){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入字符串：");
		String str=input.nextLine();
		System.out.print("请输入你要查询的字符串：");
		String str1=input.nextLine();
		int count=0;
		int i=0;
		while(i<str.length()){
			if(i>=str.length()-(str1.length()-1)){//i>=str.length()-(str1.length()-1)
				break;	
			}
			if(add(str,str1,i)){
				count++;
				str=str.substring(i+str1.length());
				i=0;
				continue;//break直接跳出循环
			}	
			i++;
		}
		System.out.println("字符串"+"\t"+str1+"\t"+"的个数为"+count);	
	}
	/*my_substring()的内调方法*/
	public static boolean add(String str,String str1,int i){
		int count=0;
		for(int j=0;j<str1.length();j++){
			if(str.charAt(i+j)==str1.charAt(j)){
				count++;
			}
		}
		return count==str1.length();
	}
	
	/*查找指定的任意字符串的个数，用indexOf()方法实现*/
	public static void my_indexOf(){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入你的字符串");
		String str=input.nextLine();
		System.out.print("请输入你要查询的字符串");
		String str1=input.nextLine();
		int num=0;
		for(int i=0;i<str.length();){
			if(str.indexOf(str1,i)!=-1){
				i=str.indexOf(str1,i)+str1.length();
				num++;
			}else{
				break;
			}
		}
		System.out.println(num);
	}
	
	
}
