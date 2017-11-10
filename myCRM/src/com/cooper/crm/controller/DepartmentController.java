package com.cooper.crm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.cooper.crm.service.DepartmentService;
@Controller
public class DepartmentController {
	@Resource(name="departmentService")
	private DepartmentService departmentService;
	
}
