public class Judge{                                         
	
	public static void main(String[] args){
		String a="";
		String b=null;//�ֲ��������븳ֵ֮��ſ���ʹ�ã���Ա������Ĭ��ֵ
		String c="java";
		
		/**
		*else if���ֻ��ִ������һ�����
		*��if֮��  ��else if֮��  ��else֮��
		*/
		if(a==b){
			System.out.println("11111111111");
		}else if(c!=""){
			System.out.println("aaaaaaaaaaa");
		}else if(c!=null){
			System.out.println("null null null null");
		}else{
			System.out.println("else else else else");
		}
		System.out.println("over over over over");
	}
}   