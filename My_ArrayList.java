package com.oaec.hello;
import java.util.*;
public class My_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		my_add();
//		my_remove();
//		my_contains();
//		my_isEmpty();
//		my_indexOf();
//		my_size();
//		my_get();
	}
	
	/*arrayList.add(E e);  --return boolean*/
	/*arrayList.add(int index,E element);  --void*/
	public static void my_add(){
		ArrayList arrayList=new ArrayList();
		String str="123";
		int[] a=new int[3];
		char[] b=new char[3];
		String str2=new String("789");
		arrayList.add(str);
		arrayList.add(a);
		arrayList.add(b);
		arrayList.add(str2);
		/*arrayList.toString();  --return String*/
		System.out.println(arrayList.toString());//输出结果[123, [I@2f57d162, [C@2e739136, 789]
	}
	
	/*arrayList.remove(Object o);  -return boolean*/
	/*arrayList.remove(int index);  -return E*/
	public static void my_remove(){
		ArrayList arrayList=new ArrayList();
		String str="123";
		String str1="456";
		String str2=new String("789");
		arrayList.add(str);
		arrayList.add(str1);
		arrayList.add(str2);
		arrayList.remove(str);
		System.out.println(arrayList.toString());//输出结果[456, 789]
	}
	
	/*arrayList.contains(Object o);  --return boolean*/
	public static void my_contains(){
		ArrayList arrayList=new ArrayList();
		String str="123";
		int[] a=new int[3];
		String str2=new String("789");
		arrayList.add(str);
		arrayList.add(a);
		arrayList.add(str2);
		System.out.println(arrayList.contains(a));//输入结果true
	}
	
	/*arrayList.isEmpty();  --return boolean*/
	public static void my_isEmpty(){
		ArrayList arrayList=new ArrayList();
		System.out.println(arrayList.isEmpty());//输出结果true
	}
	
	/*arrayList.indexOf(Object o);  --return int*/
	public static void my_indexOf(){
		ArrayList arrayList=new ArrayList();
		String str="123";
		int[] a=new int[3];
		String str2=new String("789");
		arrayList.add(str);
		arrayList.add(a);
		arrayList.add(str2);
		System.out.println(arrayList.indexOf(a));//输出结果1
	}
	
	/*arrayList.size();  --return int*/
	public static void my_size(){
		ArrayList arrayList=new ArrayList();
		String str="123";
		int[] a=new int[3];
		String str2=new String("789");
		arrayList.add(str);
		arrayList.add(a);
		arrayList.add(str2);
		System.out.println(arrayList.size());//输出结果3
	}
	
	/*arrayList.get(int index);  return E*/
	public static void my_get(){
		ArrayList arrayList=new ArrayList();
		String str="123";
		int[] a=new int[3];
		String str2=new String("789");
		arrayList.add(str);
		arrayList.add(a);
		arrayList.add(str2);
		System.out.println(arrayList.get(1));
	}
	
	
}
