package com.oaec.test.dao.imple;
import java.util.*;
import java.io.*;
import com.oaec.test.bean.User;
import com.oaec.test.dao.IUserDao;
public class UserDaoImple implements IUserDao {
	/**刷新,每次操作把数据库中的信息放入List集合中*/
	@Override
	public List<User> queryUser() {
		List<User> list=new ArrayList<>();
		BufferedReader reader=null;
		try {
			reader=new BufferedReader(new FileReader(file));
			while(reader.ready()){
				String[] str=reader.readLine().split(",");
				list.add(new User(Integer.valueOf(str[0]),str[1],str[2],str[3]));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public void addUser(String name,String sex,String password) {
		List<User> list=new ArrayList<>();
		BufferedReader reader=null;
		try {
			reader=new BufferedReader(new FileReader(file));
			while(reader.ready()){
				String[] str=reader.readLine().split(",");
				list.add(new User(Integer.valueOf(str[0]),str[1],str[2],str[3]));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/*++++++++++++++++++++++++++++++++++++++++++++++++++*/
		BufferedWriter writer=null;
		try {
			writer=new BufferedWriter(new FileWriter(file));
			list.add(new User(list.size(),name,sex,password));
			for(User user : list){
				writer.write(user.input());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
