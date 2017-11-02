package com.cooper.crm.service.imple;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cooper.crm.bean.Employee;
import com.cooper.crm.dao.EmployeeDao;
import com.cooper.crm.service.EmployeeService;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	@Resource(name = "employeeDao")/*相当于返回值*/
	private EmployeeDao employeeDao;
	 /**
	  * 查（查询全部）
	  */
	@Override
	public List<Employee> selectAll() {
		// TODO Auto-generated method stub
		List<Employee> list = employeeDao.selectAll();
		for(Employee e:list) {
			System.out.println(e.getUsername());
		}
		System.out.println("++++++++++++++++++");
		return list;
	}
	/**
	 * END
	 */
}
