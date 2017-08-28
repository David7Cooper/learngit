package com.erhia.cxd.util;
/**
 * 类变量可以存在于对象方法中，但会爆出警告
 */
public class CurrName {
	private static int id;
	private static String name;

	public static String getName() {
		return name;
	}
	public static void setName(String name){
		CurrName.name = name;
	}
	public static int getId(){
		return id;
	}
	public static void setId(int id){
		CurrName.id = id;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setId(int id){
//		this.id = id;
//	}	
}
