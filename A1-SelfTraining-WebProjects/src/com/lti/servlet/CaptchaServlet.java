package com.lti.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Captcha.jpg")
public class CaptchaServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req , HttpServletResponse res ) throws IOException {
		res.setContentType("image/jpeg");
		ServletOutputStream out =res.getOutputStream();
		
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKMNOPQRSTUVWXYZ0123456789";
		String captchaText = "";
		for(int i=0;i<5;i++) {
			int rno = (int) (Math.random()*str.length());
			captchaText += str.charAt(rno);
		}
		HttpSession session = req.getSession();
		session.setAttribute("captchaText", captchaText);
		
		BufferedImage img = new BufferedImage(125, 75, BufferedImage.TYPE_INT_RGB);
		Graphics g = img.getGraphics();
		g.setColor(Color.blue);
		g.fillRect(0, 0, 125, 75);
		g.setColor(Color.YELLOW);
		g.setFont(new Font("Harrington",Font.BOLD,32));
		g.drawString(captchaText, 10, 50);
		
		ImageIO.write(img,"jpeg",out);
	}
}
