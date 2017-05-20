package com.naah.controller.Continue.Table;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naah.PO.Onetoonetable;
import com.naah.services.interfaces.Table.OnetoonetableInt;

@Controller
public class Onetoonetables
{

	private OnetoonetableInt a;

	@RequestMapping("SelOnetoonetables.naah")
	public String Sel(String name,String age,String sex,String nation,String school,String community,String status,String page,HttpSession session,
			HttpServletRequest request)
	{
		List<Onetoonetable> list = a.Sel(name, age, sex, nation, school, community, status, page, session);
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("sex", sex);
		request.setAttribute("nation", nation);
		request.setAttribute("status", status);
		request.setAttribute("page", page);
		request.setAttribute("school", school);
		request.setAttribute("community", community);
		request.setAttribute("count", a.count(name, age, sex, nation, school, community, status, page, session));
		return "table/Onetoonetable/Sel";
	}

	@RequestMapping("indexOnetoonetables.naah")
	public String indexSel(String name,String age,String sex,String nation,String school,String community,String status,String page,HttpSession session,
			HttpServletRequest request)
	{
		List<Onetoonetable> list = a.Sel(name, age, sex, nation, school, community, "4", page, null);
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("sex", sex);
		request.setAttribute("nation", nation);
		request.setAttribute("status", status);
		request.setAttribute("page", page);
		request.setAttribute("school", school);
		request.setAttribute("community", community);
		request.setAttribute("count", a.count(name, age, sex, nation, school, community, "4", page, null));
		return "indexTable/Onetoonetable/Sel";
	}

	@RequestMapping("GoToUpdOnetoonetables.naah")
	public String GoToUpd(String id,HttpServletRequest request)
	{
		request.setAttribute("Onetoonetable", a.Get(id));
		return "table/Onetoonetable/upd";
	}

	@RequestMapping("GoToSelOnetoonetables.naah")
	public String GoToSel(String id,HttpServletRequest request)
	{
		request.setAttribute("Onetoonetable", a.Get(id));
		return "table/Onetoonetable/table";
	}

	@RequestMapping("GoToInsOnetoonetables.naah")
	public String GoToIns(String id,HttpServletRequest request)
	{

		return "table/Onetoonetable/add";
	}

	@RequestMapping("UpdOnetoonetables.naah")
	public String Upd(Onetoonetable s,HttpSession session)
	{
		a.Upd(s, session);
		return "redirect:SelOnetoonetables.naah?page=1";
	}

	@RequestMapping("UploadOnetoonetables.naah")
	public String Upload(String id,String status,HttpSession session,String reason)
	{
		a.PassOrBack(a.Get(id), status, session, reason);
		return "redirect:SelOnetoonetables.naah?page=1";
	}

	@RequestMapping("InsOnetoonetables.naah")
	public String Ins(Onetoonetable s,HttpSession session)
	{
		a.Ins(s, session);

		return "redirect:SelOnetoonetables.naah?page=1";
	}

	@RequestMapping("DelOnetoonetables.naah")
	public String Del(String id)
	{
		a.Del(id);
		return "redirect:SelOnetoonetables.naah?page=1";
	}

	@Resource(name = "Onetoonetable")
	public void setA(OnetoonetableInt a)
	{
		this.a = a;
	}

}
