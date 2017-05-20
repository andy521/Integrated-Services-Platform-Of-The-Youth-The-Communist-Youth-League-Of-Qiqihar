package com.naah.controller.Continue.Login;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naah.PO.Users;
import com.naah.services.interfaces.Login;

@Controller
public class login
{

	private Login LoginImp;

	@RequestMapping("Admin")
	public String loginVerify(HttpSession session,HttpServletRequest request,Users user,String pic)
	{
		Map re = LoginImp.Login(session, user, pic);
		if (re.get("return") != null && re.get("return").equals("messSystem"))
		{
			return "manageSystem";
		}
		else
		{
			request.setAttribute("message", re.get("message"));
			return "login";
		}
	}

	@Resource(name = "loginImp")
	public void setLogin(Login LoginImp)
	{
		this.LoginImp = LoginImp;
	}
}
