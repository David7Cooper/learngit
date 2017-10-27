package com.hwua.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hwua.ssm.PageBean;
import com.hwua.ssm.entity.User;
import com.hwua.ssm.service.UserService;


@Controller
public class UserController {
	
	@Resource(name="userService")
	private UserService userService;
	
	
//	@RequestMapping(value="/user.do",method=RequestMethod.POST)
//	public String queryUser(int id){
//		System.out.println(id);
//		System.out.println((userService==null)+"-------------------");
//		User user =userService.selectById(id);
//		System.out.println(user);
//		return "success";
//	}
	
	@RequestMapping("/userMain.do")
	public ModelAndView queryAllUser(String pages,Model model){
		int page =1;
		System.out.println(pages+"+++++++++++++++++");
		if(pages!=null){
			page =Integer.valueOf(pages);
		}
		System.out.println(page+"-----------");
		System.out.println("-------------------");
		PageBean pageBean = userService.queryForPage(2, page);
		model.addAttribute("pageBean", pageBean);
		return new ModelAndView("userMain.jsp");
	}
	
	@RequestMapping("/deleteUser.do")
	public String deleteUserByID(String id){
		userService.deleteById(Integer.valueOf(id));
		return "index.jsp";
	}
	
	
	
	
	
	
}
