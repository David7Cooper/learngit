package com.oaec.hello;
import java.util.*;
/**
 * DVD管理系统
 * */
public class Dvd {
	
	/*DVD库中的容量*/
	private static final int MAX_DVD=10;
	
	/*人库中的容量*/
	private static final int MAX=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*人库*/
		String[] name=new String[MAX];
		String[] nickName=new String[MAX];
		String[] passWord=new String[MAX];
		String[] sex=new String[MAX];
		String[] age=new String[MAX];
		String[] idNumble=new String[MAX];
		String[] phone=new String[MAX];
		String[] address=new String[MAX];
		name[0]="Cooper";
		passWord[0]="123";
		int index=1;
		
		/*DVD库*/
		int[] dvdId=new int[MAX_DVD];
		String[] dvdName=new String[MAX_DVD];
		String[] dvdDirector=new String[MAX_DVD];
		String[] dvdDate=new String[MAX_DVD];
		int[] dvdStock=new int[MAX_DVD];
		int[] dvdRent=new int[MAX_DVD];
		dvdId[0]=1;
		dvdName[0]="军师联盟";
		dvdDirector[0]="张永新";
		dvdDate[0]="2017/7/5";
		dvdStock[0]=10;
		dvdRent[0]=2;
		dvdId[1]=2;
		dvdName[1]="楚乔传";
		dvdDirector[1]="李威";
		dvdDate[1]="2017/7/5";
		dvdStock[1]=5;
		dvdRent[1]=2;
		
		userMain(index,name,nickName,passWord,sex,age,idNumble,phone,address,dvdId,dvdName,dvdDirector,dvdDate,dvdStock,dvdRent);
		
		/*String[] a=new String[3];
		System.out.println(a[0].equals(null));*/
	}
	
	public static void userMain(int index,String[] name,String[] nickName,String[] passWord,String[] sex,String[] age,String[] idNumble,String[] phone,String[] address,int[] dvdId,String[] dvdName,String[] dvdDirector,String[] dvdDate,int[] dvdStock,int[] dvdRent){
		Scanner input=new Scanner(System.in);
		/*测试*/
		System.out.println("测试所用"+"\t"+"库中已存在的用户");
		for(int i=0;i<MAX;i++){
			if(name[i]!=null){
				System.out.println(name[i]+"\t"+passWord[i]);
			}
			
		}
		for(int i=0;i<1;i++){
			System.out.println("*****欢迎使用DVD租片系统*****");
			System.out.println("1.用户注册");
			System.out.println("2.用户登录");
			int a=input.nextInt();
			switch(a){
				case 1: 
					index=userRegistration(index,name,nickName,passWord,sex,age,idNumble,phone,address);
					i--;
					break;
				case 2: 
					userLogin(index,name,nickName,passWord,sex,age,idNumble,phone,address,dvdId,dvdName,dvdDirector,dvdDate,dvdStock,dvdRent);//1
					i--;
					break;
				default:
					System.out.println("请按流程走!!!");
					i--;
			}
		}
	}
	
	/*注册*/
	public static int userRegistration(int i,String[] name,String[] nickName,String[] passWord,String[] sex,String[] age,String[] idNumble,String[] phone,String[] address){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你的用户名:");
		name[i]=input.nextLine();
		System.out.println("请输入你的昵称:");
		nickName[i]=input.nextLine();
		System.out.println("请输入你的密码:");
		passWord[i]=input.nextLine();
		System.out.println("请输入你的性别:");
		sex[i]=input.nextLine();
		System.out.println("请输入你的年龄:");
		age[i]=input.nextLine();
		System.out.println("请输入你的身份证号码:");
		idNumble[i]=input.nextLine();
	    System.out.println("请输入你的电话号码:");
		phone[i]=input.nextLine();
		System.out.println("请输入你的地址:");
		address[i]=input.nextLine();
		System.out.println("*********以存入***********");
		return i+1;
	}
	
	/*登录*/
	public static void userLogin(int index,String[] name,String[] nickName,String[] passWord,String[] sex,String[] age,String[] idNumble,String[] phone,String[] address,int[] dvdId,String[] dvdName,String[] dvdDirector,String[] dvdDate,int[] dvdStock,int[] dvdRent){
		Scanner input=new Scanner(System.in);
		for(int j=0;j<1;j++){
			System.out.println("请输入用户名:");
			String nameStr=input.nextLine();
			System.out.println("请输入用户密码:");
			String passWordStr=input.nextLine();
			for(int i=0;i<3;i++){
				if(name[i].equals(nameStr) && passWord[i].equals(passWordStr)){
					System.out.println("登录成功!!!");
					customer(index,name,nickName,passWord,sex,age,idNumble,phone,address,dvdId,dvdName,dvdDirector,dvdDate,dvdStock,dvdRent);
					
				}/*else if(name[i]==nameStr){
					System.out.println("你输入的密码不正确");
				}else{
					System.out.println("没有查找到此用户");
				}*/
			}
			System.out.println("登录失败,请重新登录!!!");
			
			for(int i=0;i<1;i++){
				System.out.println("你想回到登录界面吗?Y or N");
				String str=input.next();
				if(str.equals("Y")||str.equals("y")){
					
				}else if(str.equals("N")||str.equals("n")){
					j--;
					//break;
				}else{
					System.out.println("请输入合法字符!!!");
					i--;
				}
			}
			//j--;
		}
		
	}
	
	/*DVD主界面*/
	public static void customer(int index,String[] name,String[] nickName,String[] passWord,String[] sex,String[] age,String[] idNumble,String[] phone,String[] address,int[] dvdId,String[] dvdName,String[] dvdDirector,String[] dvdDate,int[] dvdStock,int[] dvdRent){
		Scanner input=new Scanner(System.in);
		for(int i=0;i<1;i++){
			System.out.println("******DVD租片系统******");
			System.out.println("1.查看所有DVD信息");
			System.out.println("2.根据编号修改所有DVD信息");
			System.out.println("3.根据编号删除所有DVD信息");
			System.out.println("4.新增DVD信息");
			System.out.println("5.租DVD");
			System.out.println("6.还DVD");
			System.out.println("7.返回登录界面");
			int a=input.nextInt();
			switch(a){
			case 1 : look(dvdId,dvdName,dvdDirector,dvdDate,dvdStock,dvdRent);i--;break;
			case 2 : modify(dvdId,dvdName,dvdDirector,dvdDate,dvdStock,dvdRent);i--;break;
			case 3 : delete(dvdId,dvdName,dvdDirector,dvdDate,dvdStock,dvdRent);i--;break;
			case 4 : add(dvdId,dvdName,dvdDirector,dvdDate,dvdStock);i--;break;
			case 5 : rent(dvdStock,dvdId,dvdRent);i--;break;
			case 6 : guiHuan(dvdStock,dvdId,dvdRent);i--;break;
			case 7 : back(index,name,nickName,passWord,sex,age,idNumble,phone,address,dvdId,dvdName,dvdDirector,dvdDate,dvdStock,dvdRent);break;
			default : i--;
			}
		}
		
	}
	public static void look(int[] dvdId,String[] dvdName,String[] dvdDirector,String[] dvdDate,int[] dvdStock,int[] dvdRent){
		for(int i=0;i<MAX_DVD;i++){
			if(dvdId[i]==0){
				break;
			}
		 	System.out.println(dvdId[i]+"\t"+dvdName[i]+"\t"+dvdDirector[i]+"\t"+dvdDate[i]+"\t"+dvdStock[i]+"\t"+dvdRent[i]);
		}
	}
	
	/*修改影片*/
	public static void modify(int[] dvdId,String[] dvdName,String[] dvdDirector,String[] dvdDate,int[] dvdStock,int[] dvdRent){
		Scanner input=new Scanner(System.in);
		int a=0;
		for(int i=0;i<1;i++){
			System.out.println("请输入你要修改的编号:");
			a=input.nextInt();
			if(a==0){
				System.out.println("请输入正确的编号!!!");
				i--;
			}
		}
		   
		for(int i=0;i<dvdId.length;i++){
			if(a==dvdId[i]){//a影片的编号
				System.out.println(dvdId[i]+"\t"+dvdName[i]+"\t"+dvdDirector[i]+"\t"+dvdDate[i]+"\t"+dvdStock[i]+"\t"+dvdRent[i]);
				String str=input.next();
				String[] str1=str.split(",");
				dvdId[i]=Integer.parseInt(str1[0]);
				dvdName[i]=str1[1];
				dvdDirector[i]=str1[2];
				dvdDate[i]=str1[3];
				dvdStock[i]=Integer.parseInt(str1[4]);
				dvdRent[i]=Integer.parseInt(str1[5]);	
				/*dvdId[i]=input.nextInt();
				dvdName[i]=input.next();
				dvdDirector[i]=input.next();
				dvdDate[i]=input.next();
				dvdStock[i]=input.nextInt();
				dvdRent[i]=input.nextInt();*/
				System.out.println("影片信息更改成功!!!");
				break;
			}
		}
	}
	
	/*删除影片,但没有改变影片的编号*/
	public static void delete(int[] dvdId,String[] dvdName,String[] dvdDirector,String[] dvdDate,int[] dvdStock,int[] dvdRent){
		Scanner input=new Scanner(System.in);
		int a=0;
		for(int i=0;i<1;i++){
			System.out.println("请输入你要删除的编号:");
			a=input.nextInt();
			if(a==0){
				System.out.println("请输入正确的编号!!!");
				i--;
			}
		}
		for(int i=0;i<dvdId.length;i++){
			if(a==dvdId[i]){//a影片的编号
				for(;i<dvdId.length-1;i++){
					/*优化*/
					dvdId[i]=dvdId[i+1];
					dvdName[i]=dvdName[i+1];
					dvdDirector[i]=dvdDirector[i+1];
					dvdDate[i]=dvdDate[i+1];
					dvdStock[i]=dvdStock[i+1];
					dvdRent[i]=dvdRent[i+1];
				}
				System.out.println("删除完成!!!");
				break;
			}
		}
	}
	
	/*增加影片*/
	public static void add(int[] dvdId,String[] dvdName,String[] dvdDirector,String[] dvdDate,int[] dvdStock){
		Scanner input=new Scanner(System.in);
		int i=0;
		for(;i<dvdId.length;i++){
			if(dvdId[i]==0){
				break;
			}
		}
		System.out.println("请输入新增DVD的信息:");
		
		System.out.println("编号:");
		dvdId[i]=input.nextInt();
			/*System.out.println("名称:");
			dvdName[i]=input.nextLine();
			System.out.println("导演:");*/
		System.out.println("名称:");
		dvdName[i]=input.next();
		System.out.println("导演:");
		dvdDirector[i]=input.next();
		System.out.println("新增日期:");
		dvdDate[i]=input.next();
		System.out.println("库存数量:");
		dvdStock[i]=input.nextInt();
	}
	
	/*租影片*/
	public static void rent(int[] dvdStock,int[] dvdId,int[] dvdRent){
		Scanner input=new Scanner(System.in);
		int a=0;
		for(int i=0;i<1;i++){
			System.out.println("请输入你要租片的编号:");
			a=input.nextInt();
			if(a==0){
				System.out.println("请输入正确的编号!!!");
				i--;
			}
		}
		/*switch(a){
		case 1 : 
			if(dvdStock[0]>0){
				dvdStock[0]--;
			}else{
				System.out.println("DVD已经全部租出");
			}
			break;	
		}*/
		for(int i=0;i<dvdId.length;i++){
			if(a==dvdId[i]){//a影片的编号
				if(dvdStock[i]>0){
					dvdStock[i]--;
					dvdRent[i]++;
					System.out.println("影片成功租出");
					break;
				}else{
					System.out.println("库存不足,无法租售!!!");
					break;
				}
			}
		}
	}
	
	/*归还影片*/
	public static void guiHuan(int[] dvdStock,int[] dvdId,int[] dvdRent){
		Scanner input=new Scanner(System.in);
		int a=0;
		for(int i=0;i<1;i++){
			System.out.println("请输入你要还片的编号:");
			a=input.nextInt();
			if(a==0){
				System.out.println("请输入正确的编号!!!");
				i--;
			}
		}
		for(int i=0;i<dvdId.length;i++){
			if(a==dvdId[i]){//a影片的编号
					dvdStock[i]++;
					System.out.println("影片成功归还");
					break;	
			}
		}
	}
	
	/*返回上一层*/
	public static void back(int index,String[] name,String[] nickName,String[] passWord,String[] sex,String[] age,String[] idNumble,String[] phone,String[] address,int[] dvdId,String[] dvdName,String[] dvdDirector,String[] dvdDate,int[] dvdStock,int[] dvdRent){
		userMain(index,name,nickName,passWord,sex,age,idNumble,phone,address,dvdId,dvdName,dvdDirector,dvdDate,dvdStock,dvdRent);
	}

}
