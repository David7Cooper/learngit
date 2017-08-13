package newDay;
import java.util.Arrays;
import java.util.Scanner;

public class My_Sort {
	public static void main(String[] args) {
		bubbleSort();
		selectSort();
	}
	
	public static void bubbleSort(){
		int[] a={5,4,3,2,1};
		/*去掉的值放前面*/
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){//每次把最小的放在前面，然后去掉第一位
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		/*去掉的值放后面*/
		/*for(int i=0;i<a.length-1;i++){//每次将数组中的最大的数放在最后，然后判断前面的数
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}*/
		System.out.println(Arrays.toString(a));
	}
	
	public static void selectSort(){
		int[] a={5,4,3,2,1};
		for(int i=0;i<a.length-1;i++){
			int index=i;
			for(int j=i+1;j<a.length;j++){
					if(a[index]>a[j]){
						index=j;//每次把最小的下标赋值给index
				}
			}
			if(index!=i){
				int temp=a[index];
				a[index]=a[i];
				a[i]=temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
	
}