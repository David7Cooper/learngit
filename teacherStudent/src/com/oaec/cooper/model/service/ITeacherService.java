package com.oaec.cooper.model.service;

import java.util.List;

import com.oaec.cooper.model.bean.Teacher;

public interface ITeacherService {
	/**
	 * 增
	 * @return
	 */
	String addTeacher(Teacher teacher);
	/**
	 * 删
	 * @return
	 */
	String removeTeacher();
	/**
	 * 改
	 * @return
	 */
	String updateTeacher();
	/**
	 * 查
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
