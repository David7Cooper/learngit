package oracle;
/**��Ŀ
 *   ��ӡ����
 */
public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i1,k1,t1,i2,k2,t2;
		//System.out.print(i1);�ֲ��������븳ֵ��ſ�ʹ��
		int n=30;//����
 
		/*�����ϰ���*/
		for(int i1=1;i1<=n;i1++){//����n��
			for(int k1=1;k1<=n-i1;k1++){//��ӡ�ո�������ո��ϵ
				System.out.print(" ");
			}
			for(int t1=1;t1<=2*i1-1;t1++){//��ӡ�Ǻţ��������ǺŹ�ϵ
				if(t1>=2&&t1<=(2*i1-2)){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		/*����°���*/
		for(int i2=n-1;i2>=1;i2--){//������
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
