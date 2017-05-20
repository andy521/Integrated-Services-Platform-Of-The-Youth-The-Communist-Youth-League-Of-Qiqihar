package com.naah.controller.Continue.Table;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naah.PO.Universitytable;
import com.naah.services.interfaces.Table.UniversitytableInt;

@Controller
public class Universitytables
{

	private UniversitytableInt a;

	@RequestMapping("SelUniversitytables.naah")
	public String Sel(String name,String sex,String nation,String highSchool,String university,String status,String page,HttpSession session,
			HttpServletRequest request)
	{
		List<Universitytable> list = a.Sel(name, sex, nation, highSchool, university, status, page, session);
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.setAttribute("sex", sex);
		request.setAttribute("nation", nation);
		request.setAttribute("highSchool", highSchool);
		request.setAttribute("university", university);
		request.setAttribute("status", status);
		request.setAttribute("page", page);
		request.setAttribute("count", a.count(name, sex, nation, highSchool, university, status, page, session));
		return "table/Universitytable/Sel";
	}

	@RequestMapping("indexUniversitytables.naah")
	public String indexSel(String name,String sex,String nation,String highSchool,String university,String status,String page,HttpSession session,
			HttpServletRequest request)
	{
		List<Universitytable> list = a.Sel(name, sex, nation, highSchool, university, "4", page, null);
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.setAttribute("sex", sex);
		request.setAttribute("nation", nation);
		request.setAttribute("highSchool", highSchool);
		request.setAttribute("university", university);
		request.setAttribute("status", status);
		request.setAttribute("page", page);
		request.setAttribute("count", a.count(name, sex, nation, highSchool, university, "4", page, null));
		return "indexTable/Universitytable/Sel";
	}

	@RequestMapping("GoToUpdUniversitytables.naah")
	public String GoToUpd(String id,HttpServletRequest request)
	{
		request.setAttribute("Universitytable", a.Get(id));
		return "table/Universitytable/upd";
	}

	@RequestMapping("GoToSelUniversitytables.naah")
	public String GoToSel(String id,HttpServletRequest request)
	{
		request.setAttribute("Universitytable", a.Get(id));
		return "table/Universitytable/table";
	}

	@RequestMapping("GoToInsUniversitytables.naah")
	public String GoToIns(String id,HttpServletRequest request)
	{

		return "table/Universitytable/add";
	}

	@RequestMapping("UpdUniversitytables.naah")
	public String Upd(Universitytable s,HttpSession session)
	{
		a.Upd(s, session);
		return "redirect:SelUniversitytables.naah?page=1";
	}

	@RequestMapping("UploadUniversitytables.naah")
	public String Upload(String id,String status,HttpSession session,String reason)
	{
		a.PassOrBack(a.Get(id), status, session, reason);
		return "redirect:SelUniversitytables.naah?page=1";
	}

	@RequestMapping("InsUniversitytables.naah")
	public String Ins(Universitytable s,HttpSession session)
	{
		a.Ins(s, session);

		return "redirect:SelUniversitytables.naah?page=1";
	}

	@RequestMapping("DelUniversitytables.naah")
	public String Del(String id)
	{
		a.Del(id);
		return "redirect:SelUniversitytables.naah?page=1";
	}

	@Resource(name = "Universitytable")
	public void setA(UniversitytableInt a)
	{
		this.a = a;
	}
}
