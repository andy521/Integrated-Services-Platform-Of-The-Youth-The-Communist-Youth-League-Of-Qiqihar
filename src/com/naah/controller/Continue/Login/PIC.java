package com.naah.controller.Continue.Login;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naah.tools.pic;

@Controller
public class PIC {
	@RequestMapping("pic.naah")
public void pic(HttpServletResponse response,HttpSession session)
{
	try {
		Object[] objs = pic.createImage();
		//将验证码存入Session
		session.setAttribute("imageCode",objs[0]);
		//将图片输出给浏览器
		BufferedImage image = (BufferedImage) objs[1];
		response.setContentType("image/png");
		OutputStream os = response.getOutputStream();
		ImageIO.write(image, "png", os);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
