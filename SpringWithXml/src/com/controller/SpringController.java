package com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String view(HttpServletRequest req,HttpServletResponse resp){
		
		System.out.println("In Controller");
		return "login";
	}
	
	@RequestMapping(value="/loginForm",method=RequestMethod.POST)
	public void loginValidate(HttpServletRequest request,HttpServletResponse response){
		
		System.out.println("In loginValidate");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		try {
		if(username.equals(password))
				response.getWriter().write("Successfully Logged in...");	
		else
			response.getWriter().write("Invalid Credentials...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
