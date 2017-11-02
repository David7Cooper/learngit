package com.cooper.crm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cooper.crm.bean.Custom;
import com.cooper.crm.service.CustomService;
@Controller
public class CustomController {
	@Resource(name="customService")
	private CustomService customService;
	
	@RequestMapping(value="selectAll.do")
	public String selectAll(Model model) {
		List<Custom> list = customService.selectAll();
		model.addAttribute("customs",list);
		return "test.jsp";
		
	}
	/**
	 * END
	 */
	/*public static void main(String[] args) {
		for(Custom c : new CustomController().customService.selectAll()) {
			System.out.println(c.toString());
		}
	}*/
}
