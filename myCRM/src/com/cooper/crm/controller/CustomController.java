package com.cooper.crm.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;
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
	 * 查（查询结果）
	 * @throws ParseException 
	 */
	@RequestMapping(value="queryCustom.do")
	public void selectAll(HttpServletRequest request,HttpServletResponse response,
			@RequestParam(value="name",required=false)String name,
			@RequestParam(value="customStatu",required=false)String customStatu,
			@RequestParam(value="inviteName",required=false)String inviteName,
			@RequestParam(value="phoneNo",required=false)String phoneNo,
			@RequestParam(value="createDate",required=false)String createDate,
			@RequestParam(value="page",required=false)String page,
			@RequestParam(value="rows",required=false)String rows
			) throws IOException, ParseException {
		List<Custom> list = new ArrayList<>();
		Custom custom = new Custom();
		String listJson = "";
		if(name != null) {
			list = this.customService.selectByName(name.split("%")[1]);
			custom.setName(name.split("%")[1]);
		}else if(customStatu != null) {
			list = this.customService.selectByCustomStatu(customStatu);
			custom.setCustomStatu(customStatu);
		}else if(inviteName != null) {
			list = this.customService.selectByInviteName(inviteName.split("%")[1]);
			custom.setInviteName(inviteName.split("%")[1]);
		}else if(phoneNo != null) {
			list = this.customService.selectByPhoneNo(phoneNo.split("%")[1]);
			custom.setPhoneNo(phoneNo.split("%")[1]);
		}else if(createDate != null) {
			/**
			 * String类型转为Date类型
			 */
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date date = format.parse(createDate.split("%")[1]);
			list = this.customService.selectByCreateDate(date);
			custom.setCreateDate(date);
		}else {
			list = customService.selectAll();
		}
		List<Map<String,Object>> changeList = new ArrayList<>();
//		Map<String,Object> map = new HashMap<>();
		Map<String,Object> map = null;
		for(Custom c : list) {
			map = new HashMap<>();
			map.put("id",c.getId());
			map.put("name",c.getName());
			map.put("education",c.getEducation());
			map.put("phoneNo",c.getPhoneNo());
			map.put("qq",c.getQq());
			map.put("email",c.getEmail());
			map.put("customStatu",c.getCustomStatu());
			/**
			 * Date类型转为String类型
			 */
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			String cd = format.format(c.getCreateDate());
			map.put("createDate",cd);
			changeList.add(map);
		}
		/*int start = (Integer.valueOf(page)-1)*Integer.valueOf(rows);
		int limit = Integer.valueOf(rows);
		this.customService.page1(custom, start,limit);*/
		listJson = JSON.toJSONString(changeList);
		response.getWriter().write(listJson);
	}
	/**
	 * 改（保存修改）
	 */
	@RequestMapping(value="updateCustom.do")
	public void updateCustom(int id,String name,String education,String phoneNo,String qq,String email,String customStatu) {
		/*因为前端时间类型是String，与Custom中的Date类型不匹配，所以不可以直接传Custom
		System.out.println(custom);
		this.customService.updateCustom(custom);*/
		System.out.println(id+"\t"+name+"\t"+education+"\t"+phoneNo+"\t"+qq+"\t"+email+"\t"+customStatu);
		Custom custom = new Custom();
		custom.setId(id);
		custom.setName(name);
		custom.setEducation(education);
		custom.setPhoneNo(phoneNo);
		custom.setQq(qq);
		custom.setEmail(email);
		custom.setCustomStatu(customStatu);
		this.customService.updateCustom(custom);
	}
	
}
