package com.oaec.cooper.model.service.imple;

import java.util.List;

import com.oaec.cooper.model.bean.Student;
import com.oaec.cooper.model.dao.IStudentDao;
import com.oaec.cooper.model.dao.imple.StudentDaoImpl;
import com.oaec.cooper.model.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	IStudentDao isd = new StudentDaoImpl();
	/**
	 * 增
	 * @return
	 */
	@Override
	public String AddStudent(Student student) {
		// TODO Auto-generated method stub
		int n = isd.AddStudent(student);
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
	public String removeStudent(int id) {
		int n = isd.removeStudent(id);
		if(n==1) {
			return "添加成功";
		}else {
			return "添加失败";
		}
	}
	/**
	 * 改
	 * @return
	 */
	@Override
	public String updateStudent() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 查（查询所用）
	 * @return
	 */
	@Override
	public List<Student> queryAllStudent() {
		// TODO Auto-generated method stub
		return isd.queryAllStudent();
	}
	/**
	 * End
	 */
}
