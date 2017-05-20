package com.naah.controller.Continue.Information;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naah.PO.Users;
import com.naah.services.interfaces.User;

@Controller
public class InformationController {
private User user;

@RequestMapping("SelInfo.naah")
public String Info(HttpServletRequest request,HttpSession session)
{
	request.setAttribute("Info", user.SelInfo(session));
	return "setSystem/infomanage";
}

@RequestMapping("UpdInfo.naah")
public String UpdInfo(Users users)
{
	System.out.println("open");
	user.UpdUser(users);
	return "redirect:SelInfo.naah";
}


@Resource(name="User")
public void setUser(User user) {
	this.user = user;
}
	
	
}
