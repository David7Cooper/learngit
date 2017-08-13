package newDay;
import java.util.*;
public class Password2 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你的密码：");
		String str=input.next();
		int score=0;
		if(str.length()<=4){//(0,4]，0取不到，因为必须要输入一个字符，空格键与enter键不算
			score+=5;
		}else if(str.length()<=7){
			score+=10;
		}else{
			score+=25;
		}
		
		/*运用ASCII码表，判断String变量中有没有符号，小写字母，大写字母，数字*/	
		int sumMax=0,sumMin=0,sumNum=0,sumFu=0;
		for(int i=0;i<str.length();i++){
			char a=str.charAt(i);
			if(a>=65&&a<=90){
				sumMax++;
			}else if(a>=97&&a<=122){
				sumMin++;
			}else if(a>=48&&a<=57){
				sumNum++;
			}else{
				sumFu++;
			}
		}
		
	    /*加分机制*/
		if((sumMax==0&&sumMin!=0)||(sumMax!=0&&sumMin==0)){
			score+=10;
		}else if(sumMax==0&&sumMin==0){
			score+=0;
		}else{
			score+=20;
		}
		if(sumNum==0){
			score+=0;
		}else if(sumNum==1){
			score+=10;
		}else{
			score+=20;
		}
		if(sumFu==0){
			score+=0;
		}else if(sumFu==1){
			score+=10;
		}else{
			score+=20;
		}
		
		/*奖励机制*/
		if((sumMax!=0&&sumNum!=0)||(sumMin!=0&&sumNum!=0)){
			score+=2;
		}
		if((sumMax!=0&&sumNum!=0&&sumFu!=0)||(sumMin!=0&&sumNum!=0&&sumFu!=0)){
			score+=3;
		}
		if((sumMax!=0&&sumNum!=0&&sumFu!=0)&&(sumMin!=0&&sumNum!=0&&sumFu!=0)){
			score+=5;
		}
		
		/*打印输出*/
		System.out.println(score);
		
	}
	
}
