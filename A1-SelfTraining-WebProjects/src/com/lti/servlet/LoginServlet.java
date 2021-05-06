package com.lti.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login.lti")
public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		//captcha validation
		HttpSession session = req.getSession();
		String captchaText = (String) session.getAttribute("captchaText");
		String captchaInput = req.getParameter("captchaInput");
		if(captchaText.equals(captchaInput)) {
			String username = req.getParameter("uname");
			String password = req.getParameter("pass");
			if(username.equals("Pooja") && password.equals("1234")) {
				String rememberMe = req.getParameter("rememberMe");
				if(rememberMe != null) {
					Cookie c1 = new Cookie("username",username);
					c1.setMaxAge(60*60);
					Cookie c2 = new Cookie("password",password);
					c2.setMaxAge(60*60);
					res.addCookie(c1);
					res.addCookie(c2);
					
				}
				res.sendRedirect("index.html");
			}
			else
				res.sendRedirect("Login.html?error=111");
		}
		else {
			res.sendRedirect("Login.html?error=222");
		}
	}
}
