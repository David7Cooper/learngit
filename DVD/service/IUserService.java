package com.oaec.test.service;
import java.util.*;
import com.oaec.test.bean.User;
public interface IUserService {
	public abstract boolean loginInUser(String name,String password);
	
	public abstract boolean loginUpUser(String name,String sex,String password);
}
