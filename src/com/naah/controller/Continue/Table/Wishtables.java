package com.naah.controller.Continue.Table;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naah.PO.Wishtable;
import com.naah.services.interfaces.Table.WishtableInt;

@Controller
public class Wishtables
{

	private WishtableInt a;

	@RequestMapping("SelWishtables.naah")
	public String Sel(String name,String age,String sex,String nation,String school,String community,String status,String page,HttpSession session,
			HttpServletRequest request)
	{
		List<Wishtable> list = a.Sel(name, age, sex, nation, school, community, status, page, session);
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("sex", sex);
		request.setAttribute("nation", nation);
		request.setAttribute("school", school);
		request.setAttribute("community", community);
		request.setAttribute("status", status);
		request.setAttribute("page", page);
		request.setAttribute("count", a.count(name, age, sex, nation, school, community, status, page, session));
		return "table/Wishtable/Sel";
	}

	@RequestMapping("indexSelWishtables.naah")
	public String indexSel(String name,String age,String sex,String nation,String school,String community,String status,String page,HttpSession session,
			HttpServletRequest request)
	{
		List<Wishtable> list = a.Sel(name, age, sex, nation, school, community, "4", page, null);
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("sex", sex);
		request.setAttribute("nation", nation);
		request.setAttribute("school", school);
		request.setAttribute("community", community);
		request.setAttribute("status", status);
		request.setAttribute("page", page);
		request.setAttribute("count", a.count(name, age, sex, nation, school, community, "4", page, null));
		return "indexTable/Wishtable/Sel";
	}

	@RequestMapping("GoToUpdWishtables.naah")
	public String GoToUpd(String id,HttpServletRequest request)
	{
		request.setAttribute("Wishtable", a.Get(id));
		return "table/Wishtable/upd";
	}

	@RequestMapping("GoToSelWishtables.naah")
	public String GoToSel(String id,HttpServletRequest request)
	{
		request.setAttribute("Wishtable", a.Get(id));
		return "table/Wishtable/table";
	}

	@RequestMapping("GoToInsWishtables.naah")
	public String GoToIns(String id,HttpServletRequest request)
	{

		return "table/Wishtable/add";
	}

	@RequestMapping("UpdWishtables.naah")
	public String Upd(Wishtable s,HttpSession session)
	{
		a.Upd(s, session);
		return "redirect:SelWishtables.naah?page=1";
	}

	@RequestMapping("UploadWishtables.naah")
	public String Upload(String id,String status,HttpSession session,String reason)
	{
		a.PassOrBack(a.Get(id), status, session, reason);
		return "redirect:SelWishtables.naah?page=1";
	}

	@RequestMapping("InsWishtables.naah")
	public String Ins(Wishtable s,HttpSession session)
	{
		a.Ins(s, session);

		return "redirect:SelWishtables.naah?page=1";
	}

	@RequestMapping("DelWishtables.naah")
	public String Del(String id)
	{
		a.Del(id);
		return "redirect:SelWishtables.naah?page=1";
	}

	@Resource(name = "Wishtable")
	public void setA(WishtableInt a)
	{
		this.a = a;
	}

}
