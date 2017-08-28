package com.erhia.cxd.view;
import com.erhia.cxd.bean.User;
import com.erhia.cxd.service.IUserService;
import com.erhia.cxd.service.imple.UserServiceImpl;
import com.erhia.cxd.util.SCUtil;
/**
 * 登录注册界面
 * @author cxd
 * @para
 */
public class UserView {
	IUserService usi = new UserServiceImpl();
	/**
	 * 用户登录界面
	 */
	public void logIn(){
		System.out.println("======登录======>>>");
		System.out.println("用户名");
		String userName = SCUtil.getScanner().next();
		System.out.println("密码");
		String password = SCUtil.getScanner().next();
		String str = usi.queryUser(new User(userName,password));
		if(str.equals("0")){
			System.out.println("登录成功，进入普通用户界面");
			System.out.println("**********************");
			System.out.println("你好"+userName);
			new OrdinaryUserView().main();
		}else if(str.equals("1")){
			System.out.println("登录成功，进入管理员界面");
			System.out.println("**********************");
			System.out.println("你好"+"admin");
			new AdministrationUserView().main();;
		}else{
			System.out.println("登录失败!!!\t"+str);
			System.out.println("请重新登录");
		}
		}
	/**
	 * 用户注册界面
	 */
	public void logUp(){
		System.out.println("======注册======>>>");
		System.out.println("用户名");
		String userName = SCUtil.getScanner().next();
		System.out.println("密码");
		String password = SCUtil.getScanner().next();
		System.out.println("性别（男：0/女 ：1）");
		String sex = SCUtil.getScanner().next();
		System.out.println("身份证号码");
		String idNumber = SCUtil.getScanner().next();
		System.out.println("电话号码");
		String tel = SCUtil.getScanner().next();
		System.out.println("地址");
		String add = SCUtil.getScanner().next();
		String str = usi.addUser(new User(
						userName,
						password,
						Integer.valueOf(sex),
						idNumber,
						tel,
						add)
				);
		System.out.println(str);
	}
	/**
	 * 主界面
	 */
	public void main(){
		boolean b = true;
		while(b){
			System.out.println("============");
			System.out.println("欢迎访问二嗨租车");
			System.out.println("============");
			System.out.println("1.登录");
			System.out.println("2.注册");
			System.out.println("3.退出");
			switch(SCUtil.getScanner().next()){
			case "1" : 
				this.logIn();
				break;
			case "2" : 
				this.logUp();
				break;
			case "3" :
				System.out.println("感谢使用，已退出");
				b = false;
				break;
			}
		}	
	}
	/**
	 * End
	 */
}
