package newDay;
import java.util.*;
/**题目
 * @author Cooper
 * 密码强度
 */
public class Password{
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入你的密码：");
		String str=input.next();
		int score=0;
		if(str.length()<=4){
			score+=5;
		}else if(str.length()<=7){
			score+=10;
		}else{
			score+=25;
		}
		
		/*运用ASCII码表，判断String变量中有没有符号，小写字母，大写字母，数字*/		
		int sumXiao=0,sumDa=0,sumShu=0,sumFu=0;
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c>=0 && c<48){
				sumFu++;
			}else if(c>=48 && c<58){
				sumShu++;
			}else if(c>=58 && c<65){
				sumFu++;
			}else if(c>=65 && c<91){
				sumDa++;
			}else if(c>=91 && c<97){
				sumFu++;
			}else if(c>=97 && c<123){
				sumXiao++;
			}else{
				sumFu++;
			}
		}	
		
		/*加分机制*/
		if(sumDa>0 && sumXiao>0){
			score+=20;
		}
		if(sumDa==0 && sumXiao==0){
			score+=0;
		}
		if((sumDa>0 && sumXiao==0)||((sumDa==0 && sumXiao>0))){
			score+=10;
		}
		if(sumShu==1){
			score+=10;
		}
		if(sumShu>1){
			score+=20;
		}
		if(sumFu==1){
			score+=10;
		}
		if(sumFu>1){
			score+=20;
		}
		if((sumDa>0&&sumShu>0)||(sumXiao>0&&sumShu>0)){
			score+=2;
		}
		if((sumDa>0&&sumShu>0&&sumFu>0)||(sumXiao>0&&sumShu>0&&sumFu>0)){
			score+=3;
		}
		if((sumDa>0&&sumShu>0&&sumFu>0)&&(sumXiao>0&&sumShu>0&&sumFu>0)){
			score+=5;
		}
		
		/*输出*/
		System.out.println(score);
		System.out.println("你输入了"+sumDa+"个大写字母");
		System.out.println("你输入了"+sumXiao+"个小写字母");
		System.out.println("你输入了"+sumFu+"个符号");
		System.out.println("你输入了"+sumShu+"个数字");
		
	}
}
