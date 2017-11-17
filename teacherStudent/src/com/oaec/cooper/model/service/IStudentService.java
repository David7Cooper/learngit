package com.oaec.cooper.model.service;

import java.util.List;

import com.oaec.cooper.model.bean.Student;

public interface IStudentService {
	/**
	 * 增
	 * @return
	 */
	String AddStudent(Student student);
	/**
	 * 删
	 * @return
	 */
	String removeStudent(int id);
	/**
	 * 改
	 * @return
	 */
	String updateStudent();
	/**
	 * 查（查询所用）
	 * @return
	 */
	List<Student> queryAllStudent();
	/**
	 * End
	 */
}
