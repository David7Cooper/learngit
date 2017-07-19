package com.oaec.hello;
import java.text.DateFormat;
import java.util.*;
public class My_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		my_DateFormat();
		my_Calendar();
	}

	public static void my_DateFormat(){
		Date date=new Date();
		/*默认调用date.toString();  date中的toString()方法被重写过了*/
//		System.out.println(date);//输出结果Tue Jul 11 10:23:11 CST 2017
		/*******DateFormat.getDateInstance();*******/
		/*(format格式化)(instance例子)*/
		DateFormat df=DateFormat.getDateInstance();
		System.out.println(df.format(date));//输出结果2017-7-11
		/*******DateFormat.getDateTimeInstance();*******/
		DateFormat df1=DateFormat.getDateTimeInstance();
		System.out.println(df1.format(date));//输出结果2017-7-11 10:34:45
		DateFormat df2=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		System.out.println(df2.format(date));//输出结果2017年7月11日 星期二 上午10时50分37秒 CST
		DateFormat df3=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		System.out.println(df3.format(date));//输出结果2017年7月11日 上午10时55分18秒
		DateFormat df4=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
		System.out.println(df4.format(date));//输出结果17-7-11 上午10:59
		DateFormat df5=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
		System.out.println(df5.format(date));//输出结果2017-7-11 11:01:23
	}
	
	public static void my_Calendar(){
		 Calendar cal = Calendar.getInstance();
		 int y=cal.get(Calendar.YEAR);
		 System.out.println(y);//输出结果2017
		 int m=cal.get(Calendar.MONTH);
		 System.out.println(m);//输出结果6
		 int d=cal.get(Calendar.DATE);
		 System.out.println(d);//输出结果11
		 int hour=cal.get(Calendar.HOUR);
		 System.out.println(hour);//输出结果6
		 int minute=cal.get(Calendar.MINUTE);
		 System.out.println(minute);//输出结果6
		 int second=cal.get(Calendar.SECOND);
		 System.out.println(second);//输出结果23
		 /*返回值int类型,返回是一周的第几天,星期天是0*/
		 int WeekOfYear = cal.get(Calendar.DAY_OF_WEEK);
		 System.out.println(WeekOfYear);//输出结果3
	}
	
}
