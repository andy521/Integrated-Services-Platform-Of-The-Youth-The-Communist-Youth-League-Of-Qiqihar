package com.naah.controller.GoTo;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naah.DAO.implement.Select;

@Controller
public class GoTooShowTable
{
	private Select Sel;

	@RequestMapping("ShowDonatepersontable.naah")
	public String showDonatepersontable(HttpServletRequest request,String page,String name,String age,String sex)
	{
		request.setAttribute("list", null);
		return "login";
	}

	@RequestMapping("ShowIllnesshelptable.naah")
	public String showIllnesshelptable(HttpServletRequest request)
	{
		request.setAttribute("list", null);
		return "login";
	}

	@RequestMapping("ShowOnetoonetable.naah")
	public String showOnetoonetable(HttpServletRequest request)
	{
		request.setAttribute("list", null);
		return "login";
	}

	@RequestMapping("ShowSingleyouthtable.naah")
	public String showSingleyouthtable(HttpServletRequest request)
	{
		request.setAttribute("list", null);
		return "login";
	}

	@RequestMapping("ShowUniversitytable.naah")
	public String showUniversitytable(HttpServletRequest request)
	{
		request.setAttribute("list", null);
		return "login";
	}

	@RequestMapping("ShowWishtable.naah")
	public String showWishtable(HttpServletRequest request)
	{
		request.setAttribute("list", null);
		return "login";
	}

	@RequestMapping("ShowYouthlawhelptable.naah")
	public String showYouthlawhelptable(HttpServletRequest request)
	{
		request.setAttribute("list", null);
		return "login";
	}

	@RequestMapping("ShowYouthmentalitytable.naah")
	public String showYouthmentalitytable(HttpServletRequest request)
	{
		request.setAttribute("list", null);
		return "login";
	}

	@RequestMapping("ShowYouthworktable.naah")
	public String showYouthworktable(HttpServletRequest request)
	{
		request.setAttribute("list", null);
		return "login";
	}

	@Resource(name = "sel")
	public void setSel(Select sel)
	{
		Sel = sel;
	}
}
