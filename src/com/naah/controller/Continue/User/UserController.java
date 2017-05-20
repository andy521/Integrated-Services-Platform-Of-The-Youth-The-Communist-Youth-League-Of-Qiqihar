package com.naah.controller.Continue.User;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naah.PO.Users;
import com.naah.services.interfaces.User;

@Controller
public class UserController
{

	private User users;

	@RequestMapping("SelUser.naah")
	public String SelUser(HttpSession session,String page,String name,String unit,HttpServletRequest request)
	{
		request.setAttribute("name", name);
		request.setAttribute("unit", unit);
		request.setAttribute("page", page);
		request.setAttribute("users", users.SelUser(session, page, name, unit));
		request.setAttribute("count", users.count(session, name, unit));
		return "userManage/userManage";
	}

	@RequestMapping("InsUser.naah")
	public String InsUser(Users user,HttpServletRequest request)
	{
		if (users.SelUserHql("from Users where username='" + user.getUsername() + "'") != null)
		{
			request.setAttribute("message", "用户名重复，请重新输入！");
			return "msg";
		}
		else
		{
			users.InsUser(user);
			return "redirect:SelUser.naah?page=1";
		}
	}

	@RequestMapping("GoToInsUser.naah")
	public String GoToInsUser()
	{
		return "userManage/addUser";
	}

	@RequestMapping("UpdUser.naah")
	public String UpdUser(Users user,HttpServletRequest request)
	{
		users.UpdUser(user);
		return "redirect:SelUser.naah?page=1";
	}

	@RequestMapping("GoToUpdUser.naah")
	public String GoToUpdUser(String id,HttpServletRequest request)
	{
		request.setAttribute("user", users.GoToUpdUser(id));
		return "userManage/updUser";
	}

	@RequestMapping("DelUser.naah")
	public String DelUser(String id)
	{
		users.DelUser(id);
		return "redirect:SelUser.naah?page=1";
	}

	@RequestMapping("GoToPrivilege.naah")
	public String GoToPrivilege(String id,HttpServletRequest request)
	{
		request.setAttribute("privilege", users.SelUserprivileges(id));
		request.setAttribute("id", id);
		return "userManage/powerManage";
	}

	@RequestMapping("SavePrivilege.naah")
	public String SavePrivilege(String[] checkbox2,String id,HttpServletRequest request)
	{
		request.setAttribute("message", "close");
		users.SavePrivilege(checkbox2, id);
		return "msg";
	}

	@Resource(name = "User")
	public void setUsers(User users)
	{
		this.users = users;
	}

	@RequestMapping("userManage.naah")
	public String Index()
	{

		return "userManage/userManage";
	}

}
