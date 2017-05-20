package com.naah.controller.Continue.Table;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naah.PO.Youthworktable;
import com.naah.services.interfaces.Table.YouthworktableInt;

@Controller
public class Youthworktables
{
	private YouthworktableInt a;

	@RequestMapping("SelYouthworktables.naah")
	public String Sel(String name,String sex,String nation,String education,String graduateSchool,String community,String wordDirection,String status,
			String page,HttpSession session,HttpServletRequest request)
	{
		List<Youthworktable> list = a.Sel(name, sex, nation, education, graduateSchool, community, wordDirection, status, page, session);
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.setAttribute("sex", sex);
		request.setAttribute("nation", nation);
		request.setAttribute("education", education);
		request.setAttribute("graduateSchool", graduateSchool);
		request.setAttribute("community", community);
		request.setAttribute("wordDirection", wordDirection);
		request.setAttribute("status", status);
		request.setAttribute("page", page);
		request.setAttribute("count", a.count(name, sex, nation, education, graduateSchool, community, wordDirection, status, page, session));
		return "table/Youthworktable/Sel";
	}

	@RequestMapping("indexYouthworktables.naah")
	public String indexSel(String name,String sex,String nation,String education,String graduateSchool,String community,String wordDirection,String status,
			String page,HttpSession session,HttpServletRequest request)
	{
		List<Youthworktable> list = a.Sel(name, sex, nation, education, graduateSchool, community, wordDirection, "4", page, null);
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.setAttribute("sex", sex);
		request.setAttribute("nation", nation);
		request.setAttribute("education", education);
		request.setAttribute("graduateSchool", graduateSchool);
		request.setAttribute("community", community);
		request.setAttribute("wordDirection", wordDirection);
		request.setAttribute("status", status);
		request.setAttribute("page", page);
		request.setAttribute("count", a.count(name, sex, nation, education, graduateSchool, community, wordDirection, "4", page, null));
		return "indexTable/Youthworktable/Sel";
	}

	@RequestMapping("GoToUpdYouthworktables.naah")
	public String GoToUpd(String id,HttpServletRequest request)
	{
		request.setAttribute("Youthworktable", a.Get(id));
		return "table/Youthworktable/upd";
	}

	@RequestMapping("GoToSelYouthworktables.naah")
	public String GoToSel(String id,HttpServletRequest request)
	{
		request.setAttribute("Youthworktable", a.Get(id));
		return "table/Youthworktable/table";
	}

	@RequestMapping("GoToInsYouthworktables.naah")
	public String GoToIns(String id,HttpServletRequest request)
	{

		return "table/Youthworktable/add";
	}

	@RequestMapping("UpdYouthworktables.naah")
	public String Upd(Youthworktable s,HttpSession session)
	{
		a.Upd(s, session);
		return "redirect:SelYouthworktables.naah?page=1";
	}

	@RequestMapping("UploadYouthworktables.naah")
	public String Upload(String id,String status,HttpSession session,String reason)
	{
		a.PassOrBack(a.Get(id), status, session, reason);
		return "redirect:SelYouthworktables.naah?page=1";
	}

	@RequestMapping("InsYouthworktables.naah")
	public String Ins(Youthworktable s,HttpSession session)
	{
		a.Ins(s, session);

		return "redirect:SelYouthworktables.naah?page=1";
	}

	@RequestMapping("DelYouthworktables.naah")
	public String Del(String id)
	{
		a.Del(id);
		return "redirect:SelYouthworktables.naah?page=1";
	}

	@Resource(name = "Youthworktable")
	public void setA(YouthworktableInt a)
	{
		this.a = a;
	}
}
