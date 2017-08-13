package oracle;
/**题目
 *   打印菱形
 */
public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i1,k1,t1,i2,k2,t2;
		//System.out.print(i1);局部变量必须赋值后才可使用
		int n=30;//行数
 
		/*输入上半行*/
		for(int i1=1;i1<=n;i1++){//换行n次
			for(int k1=1;k1<=n-i1;k1++){//打印空格，行数与空格关系
				System.out.print(" ");
			}
			for(int t1=1;t1<=2*i1-1;t1++){//打印星号，行数与星号关系
				if(t1>=2&&t1<=(2*i1-2)){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		/*输出下半行*/
		for(int i2=n-1;i2>=1;i2--){//行数，
		for(int k2=1;k2<=n-i2;k2++){
			System.out.print(" ");
		}
		for(int t2=1;t2<=2*i2-1;t2++){
			if(t2>=2&&t2<=(2*i2-2)){
				System.out.print(" ");
			}else{
				System.out.print("*");
			}	
		}
		System.out.println();

	}
		
		
	}

}
