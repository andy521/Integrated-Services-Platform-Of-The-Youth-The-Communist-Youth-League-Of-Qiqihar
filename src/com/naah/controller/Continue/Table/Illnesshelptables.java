package com.naah.controller.Continue.Table;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naah.PO.Illnesshelptable;
import com.naah.services.interfaces.Table.IllnesshelptableInt;

@Controller
public class Illnesshelptables
{

	private IllnesshelptableInt a;

	@RequestMapping("SelIllnesshelptables.naah")
	public String Sel(String name,String age,String sex,String nation,String company,String illness,String status,String page,HttpSession session,
			HttpServletRequest request)
	{
		List<Illnesshelptable> list = a.Sel(name, age, sex, nation, company, illness, status, page, session);
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("sex", sex);
		request.setAttribute("nation", nation);
		request.setAttribute("status", status);
		request.setAttribute("page", page);
		request.setAttribute("company", company);
		request.setAttribute("count", a.count(name, age, sex, nation, company, illness, status, page, session));
		return "table/Illnesshelptable/Sel";
	}

	@RequestMapping("indexIllnesshelptables.naah")
	public String indexSel(String name,String age,String sex,String nation,String company,String illness,String status,String page,HttpSession session,
			HttpServletRequest request)
	{
		List<Illnesshelptable> list = a.Sel(name, age, sex, nation, company, illness, "4", page, null);
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("sex", sex);
		request.setAttribute("nation", nation);
		request.setAttribute("status", status);
		request.setAttribute("page", page);
		request.setAttribute("company", company);
		request.setAttribute("count", a.count(name, age, sex, nation, company, illness, "4", page, null));
		return "indexTable/Illnesshelptable/Sel";
	}

	@RequestMapping("GoToUpdIllnesshelptables.naah")
	public String GoToUpd(String id,HttpServletRequest request)
	{
		request.setAttribute("Illnesshelptable", a.Get(id));
		return "table/Illnesshelptable/upd";
	}

	@RequestMapping("GoToSelIllnesshelptables.naah")
	public String GoToSel(String id,HttpServletRequest request)
	{
		request.setAttribute("Illnesshelptable", a.Get(id));
		return "table/Illnesshelptable/table";
	}

	@RequestMapping("GoToInsIllnesshelptables.naah")
	public String GoToIns(String id,HttpServletRequest request)
	{

		return "table/Illnesshelptable/add";
	}

	@RequestMapping("UpdIllnesshelptables.naah")
	public String Upd(Illnesshelptable s,HttpSession session)
	{
		a.Upd(s, session);
		return "redirect:SelIllnesshelptables.naah?page=1";
	}

	@RequestMapping("UploadIllnesshelptables.naah")
	public String Upload(String id,String status,HttpSession session,String reason)
	{
		a.PassOrBack(a.Get(id), status, session, reason);
		return "redirect:SelIllnesshelptables.naah?page=1";
	}

	@RequestMapping("InsIllnesshelptables.naah")
	public String Ins(Illnesshelptable s,HttpSession session)
	{
		a.Ins(s, session);

		return "redirect:SelIllnesshelptables.naah?page=1";
	}

	@RequestMapping("DelIllnesshelptables.naah")
	public String Del(String id)
	{
		a.Del(id);
		return "redirect:SelIllnesshelptables.naah?page=1";
	}

	@Resource(name = "Illnesshelptable")
	public void setA(IllnesshelptableInt a)
	{
		this.a = a;
	}
}
