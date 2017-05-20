package com.naah.controller.Continue.Table;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naah.PO.Youthmentalitytable;
import com.naah.services.interfaces.Table.YouthmentalitytableInt;

@Controller
public class Youthmentalitytables
{
	private YouthmentalitytableInt a;

	@RequestMapping("SelYouthmentalitytables.naah")
	public String Sel(String name,String age,String sex,String nation,String school,String education,String status,String page,HttpSession session,
			HttpServletRequest request)
	{
		List<Youthmentalitytable> list = a.Sel(name, age, sex, nation, school, education, status, page, session);
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("sex", sex);
		request.setAttribute("nation", nation);
		request.setAttribute("school", school);
		request.setAttribute("education", education);
		request.setAttribute("status", status);
		request.setAttribute("page", page);
		request.setAttribute("count", a.count(name, age, sex, nation, school, education, status, page, session));
		return "table/Youthmentalitytable/Sel";
	}

	@RequestMapping("indexYouthmentalitytables.naah")
	public String indexSel(String name,String age,String sex,String nation,String school,String education,String status,String page,HttpSession session,
			HttpServletRequest request)
	{
		List<Youthmentalitytable> list = a.Sel(name, age, sex, nation, school, education, "4", page, null);
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("sex", sex);
		request.setAttribute("nation", nation);
		request.setAttribute("school", school);
		request.setAttribute("education", education);
		request.setAttribute("status", status);
		request.setAttribute("page", page);
		request.setAttribute("count", a.count(name, age, sex, nation, school, education, "4", page, null));
		return "indexTable/Youthmentalitytable/Sel";
	}

	@RequestMapping("GoToUpdYouthmentalitytables.naah")
	public String GoToUpd(String id,HttpServletRequest request)
	{
		request.setAttribute("Youthmentalitytable", a.Get(id));
		return "table/Youthmentalitytable/upd";
	}

	@RequestMapping("GoToSelYouthmentalitytables.naah")
	public String GoToSel(String id,HttpServletRequest request)
	{
		request.setAttribute("Youthmentalitytable", a.Get(id));
		return "table/Youthmentalitytable/table";
	}

	@RequestMapping("GoToInsYouthmentalitytables.naah")
	public String GoToIns(String id,HttpServletRequest request)
	{

		return "table/Youthmentalitytable/add";
	}

	@RequestMapping("UpdYouthmentalitytables.naah")
	public String Upd(Youthmentalitytable s,HttpSession session)
	{
		a.Upd(s, session);
		return "redirect:SelYouthmentalitytables.naah?page=1";
	}

	@RequestMapping("UploadYouthmentalitytables.naah")
	public String Upload(String id,String status,HttpSession session,String reason)
	{
		a.PassOrBack(a.Get(id), status, session, reason);
		return "redirect:SelYouthmentalitytables.naah?page=1";
	}

	@RequestMapping("InsYouthmentalitytables.naah")
	public String Ins(Youthmentalitytable s,HttpSession session)
	{
		a.Ins(s, session);

		return "redirect:SelYouthmentalitytables.naah?page=1";
	}

	@RequestMapping("DelYouthmentalitytables.naah")
	public String Del(String id)
	{
		a.Del(id);
		return "redirect:SelYouthmentalitytables.naah?page=1";
	}

	@Resource(name = "Youthmentalitytable")
	public void setA(YouthmentalitytableInt a)
	{
		this.a = a;
	}

}
