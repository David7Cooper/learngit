package com.cooper.crm.service.imple;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cooper.crm.bean.Department;
import com.cooper.crm.dao.DepartmentDao;
import com.cooper.crm.service.DepartmentService;
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
	@Resource(name="departmentDao")
	private DepartmentDao departmentDao;
	/**
	 * 查（查询所用）
	 */
	@Override
	public List<Department> selectAll() {
		// TODO Auto-generated method stub
		return this.departmentDao.selectAll();
	}

}
