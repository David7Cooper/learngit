package com.hwua.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwua.ssm.PageBean;
import com.hwua.ssm.dao.UserDao;
import com.hwua.ssm.entity.User;
import com.hwua.ssm.service.UserService;

//���������ļ�
@Service("userService")
public class UserServiceImpl implements UserService{
	//
	@Resource(name="userDao")
	private UserDao userDao;
	
	@Override
	public void insertUser(User user) {
		userDao.insertUser(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		userDao.deleteById(id);
	}

	@Override
	public User selectById(Integer id) {
		// TODO Auto-generated method stub
		System.out.println((userDao==null)+"+++++++++++++++++");
		return userDao.selectById(id);
	}

	@Override
	public List<User> selectAllUser() {
		// TODO Auto-generated method stub
		return userDao.selectAllUser();
	}

	@Override
	public PageBean queryForPage(int pageSize, int Page) {
		// TODO Auto-generated method stub
		System.out.println(111111111111L);
		int count = userDao.getCount(); // �ܼ�¼��
		int totalPage = PageBean.countTotalPage(pageSize, count); // ��ҳ��
		int offset = PageBean.countOffset(pageSize, Page); // ��ǰҳ��ʼ��¼
		int length = pageSize; // ÿҳ��¼��
		int currentPage = PageBean.countCurrentPage(Page);
		List<User> list = userDao.queryForPage(offset, length); // �÷�ҳ�ļ�¼
		// �ѷ�ҳ��Ϣ���浽Bean��
		PageBean pageBean = new PageBean();
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		pageBean.setAllRow(count);
		pageBean.setTotalPage(totalPage);
		pageBean.setList(list);
		pageBean.init();
		return pageBean;
	}



}
