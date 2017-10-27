package com.hwua.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hwua.ssm.entity.User;
import com.hwua.ssm.service.UserService;


@Controller
public class UserController {
	
	@Resource(name="userService")
	private UserService userService;
	
	/*@RequestMapping("/insertStudent")
	public String insertStudent(User student){
		studentService.insertUser(student);
		return "studentList.jsp";
	}*/
	/*@RequestMapping(value="/user.do",method=RequestMethod.POST)
	public String queryUser(int id){
		System.out.println(id);
		System.out.println((userService==null)+"-------------------");
		User user =userService.selectById(id);
		System.out.println(user);
		return "success";
	}*/
	
	/**
	 * 查（查询全部）
	 */
	@RequestMapping("/userMain.do")
	public ModelAndView queryAllUser(Model model) {
		List<User> list = userService.selectAllUser();
		/*for(User user : list) {
			System.out.println("qwer"+user.getUserpass());
		}*/
		model.addAttribute("users",list);
		return new ModelAndView("userMain.jsp");
	}
	/**
	 * 查（按照姓名查询）
	 * 
	 */
	@RequestMapping(value="user.do",method=RequestMethod.POST)
	public String selectUserByName(String username,Model model) {
		User user = userService.selectUserByName(username);
		model.addAttribute("user",user);
		return "userMain.jsp";
	}
	/**
	 * 增
	 */
	@RequestMapping(value="add.do",method=RequestMethod.POST)
	public String addUser(@ModelAttribute("user")User user) {
		userService.addUser(user);
		return "index.jsp";
	}
	/**
	 * 删
	 */
	@RequestMapping(value="removeUser.do")
	public String removeUser(String id) {
		userService.removeUser(Integer.valueOf(id));
		return "index.jsp";
	}
	/**
	 * 改
	 */
	@RequestMapping(value="updateUser.do",method=RequestMethod.POST)
	public String updateUser(@ModelAttribute("user")User user) {
		userService.updateUser(user);
		return "index.jsp";
	}
}
