package com.oaec.test.dao;
import java.util.*;
import com.oaec.test.bean.User;
import java.io.*;
public interface IUserDao {
	public static final File file=new File("D://Data.java");
	
	/**每次操作把数据库中的信息放入List集合中*/
	public abstract List<User> queryUser();
	
	/**每次将集合中的数据放入数据库中*/
	public abstract void addUser(String name,String sex,String password);
}
