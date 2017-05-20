package com.naah.controller.GoTo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoToLogin
{

	@RequestMapping("login.naah")
	public String gotologin()
	{
		return "login";
	}

	@RequestMapping("logout.naah")
	public String logout()
	{
		return "login";
	}

}
