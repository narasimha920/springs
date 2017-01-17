package com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringController {

	@RequestMapping(value={"/"},method=RequestMethod.GET)
	public String view()
	{
		System.out.println("Welcome to new Controller");
		
		return "home";
	}
	
	@RequestMapping(value="/loginForm",method=RequestMethod.POST)
	public void loginForm(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		System.out.println("In login Form");
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		
		if(username.equals(password))
			response.getWriter().write("Successfully Logged in...");
		else
			response.getWriter().write("Invalid Credentials...");
		
		
		
	}
	
}
