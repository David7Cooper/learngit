package com.oaec.cooper.model.service.imple;

import java.util.List;

import com.oaec.cooper.model.bean.Teacher;
import com.oaec.cooper.model.dao.ITeacherDao;
import com.oaec.cooper.model.dao.imple.TeacherDaoImpl;
import com.oaec.cooper.model.service.ITeacherService;

public class TeacherServiceImpl implements ITeacherService {
	ITeacherDao itd = new TeacherDaoImpl();
	/**
	 * 增
	 * @return
	 */
	@Override
	public String addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		int n = itd.addTeacher(teacher);
		if(n==1) {
			return "添加成功";
		}else {
			return "添加失败";
		}
	}
	/**
	 * 删
	 * @return
	 */
	@Override
	public String removeTeacher() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 改
	 * @return
	 */
	@Override
	public String updateTeacher() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 查
	 * @return
	 */
	@Override
	public List<Teacher> queryAllTeacher() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 查（根据老师的名字查询）
	 * @param teacherName
	 * @return
	 */
	@Override
	public Teacher queryByTeacherName(String teacherName) {
		// TODO Auto-generated method stub		
		return itd.queryByTeacherName(teacherName);
	}
	/**
	 * End
	 */
}
