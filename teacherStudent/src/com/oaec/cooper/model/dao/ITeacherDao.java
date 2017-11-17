package com.oaec.cooper.model.dao;

import java.util.List;

import com.oaec.cooper.model.bean.Teacher;

public interface ITeacherDao {
	/**
	 * 增
	 * @return
	 */
	int addTeacher(Teacher teacher);
	/**
	 * 删
	 * @return
	 */
	int removeTeacher();
	/**
	 * 改
	 * @return
	 */
	int updateTeacher();
	/**
	 * 查（查询全部）
	 * @return
	 */
	List<Teacher> queryAllTeacher();
	/**
	 * 查（根据老师的名字查询）
	 * @param teacherName
	 * @return
	 */
	Teacher queryByTeacherName(String teacherName);
	/**
	 * End
	 */
}
