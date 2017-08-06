package com.oaec.test.view;
import java.util.*;
import com.oaec.test.service.IUserService;
import com.oaec.test.service.imple.UserServiceImple;
public class View {
	private Scanner input=new Scanner(System.in);
	
	/**用户登录注册界面*/
	public void loginView(){
		while(true){
			System.out.println("+++++请输入你要选择的操作+++++");
			System.out.println("1登录");
			System.out.println("2注册");
			switch(input.next()){
			case "1" : loginInView();break;
			case "2" : loginUpView();break;
			}
		}
	}
	
	/**登录界面*/
	public void loginInView(){
		IUserService userService=new UserServiceImple();
		System.out.println("请输入你的用户名与密码并用,号隔开");
		String[] str=input.next().split(",");
		boolean b=userService.loginInUser(str[0], str[1]);
		if(b){
			System.out.println("登录成功！！！");
		}else{
			System.out.println("你输入的密码或用户名不正确！！！");
		}
	}
	
	/**注册界面*/
	public void loginUpView(){
		IUserService userService=new UserServiceImple();
		System.out.println("请依次输入你的用户名,性别,登录密码");
		String[] str=input.next().split(",");
		if(userService.loginUpUser(str[0], str[1], str[2])){
			System.out.println("注册成功!!!");
		}else{
			System.out.println("注册失败!!!");
		}
	}
}
