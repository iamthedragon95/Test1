package com.niit.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class controller {
	@RequestMapping(value ={"/","/home"})
	public String home()
	{
		return "index";
	}
	@RequestMapping(value = {"/login","/admin/login","/user/login"},method = RequestMethod.GET)
	public String getlogin(ModelMap map,HttpServletRequest req) {
		return "login";
	}
	@RequestMapping(value ={"/view2all"})
	public String home1()
	{
		return "view2all";
	}
	
}
