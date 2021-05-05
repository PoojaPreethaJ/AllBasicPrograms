package com.lti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		String user = req.getParameter("name");
		String pass = req.getParameter("pass");
		pw.println("Login successful...");
		
		if(user.equals("pooja") && pass.equals("pooja@123"))
			pw.println("Login sucess");
		else
			pw.println("Login Failed");
	
		pw.close();
	}
	
}
