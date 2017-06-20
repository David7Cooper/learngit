public class Judge{                                         
	
	public static void main(String[] args){
		String a="";
		String b=null;//局部变量必须赋值之后才可以使用，成员变量有默认值
		String c="java";
		
		/**
		*else if语句只能执行其中一个语句
		*或if之后  或else if之后  或else之后
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