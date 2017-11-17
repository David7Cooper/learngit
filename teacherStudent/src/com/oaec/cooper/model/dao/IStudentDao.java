package com.oaec.cooper.model.dao;

import java.util.List;

import com.oaec.cooper.model.bean.Student;

public interface IStudentDao {
	/**
	 * 增
	 * @return
	 */
	int AddStudent(Student student);
	/**
	 * 删
	 * @return
	 */
	int removeStudent(int id);
	/**
	 * 改
	 * @return
	 */
	int updateStudent();
	/**
	 * 查（查询所用）
	 * @return
	 */
	List<Student> queryAllStudent();
	/**
	 * End
	 */
}
