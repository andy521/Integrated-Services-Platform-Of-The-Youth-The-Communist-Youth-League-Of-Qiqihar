package com.naah.controller.Continue.Table;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naah.PO.Singleyouthtable;
import com.naah.services.interfaces.Table.SingleYouthTableInt;

@Controller
public class Singleyouthtables
{

	private SingleYouthTableInt a;

	@RequestMapping("SelSingleyouthtables.naah")
	public String SelSingleyouthtable(String name,String age,String sex,String nation,String education,String company,String chooseSexStandard,
			String marryStatus,String status,String page,HttpSession session,HttpServletRequest request)
	{
		List<Singleyouthtable> list = a.SelSingleyouthtable(name, age, sex, nation, education, company, chooseSexStandard, marryStatus, status, page, session);
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("sex", sex);
		request.setAttribute("nation", nation);
		request.setAttribute("education", education);
		request.setAttribute("company", company);
		request.setAttribute("chooseSexStandard", chooseSexStandard);
		request.setAttribute("marryStatus", marryStatus);
		request.setAttribute("status", status);
		request.setAttribute("page", page);
		request.setAttribute("count", a.count(name, age, sex, nation, education, company, chooseSexStandard, marryStatus, status, page, session));
		return "table/Singleyouthtable/Sel";
	}

	@RequestMapping("indexSingleyouthtables.naah")
	public String indexSelSingleyouthtable(String name,String age,String sex,String nation,String education,String company,String chooseSexStandard,
			String marryStatus,String status,String page,HttpSession session,HttpServletRequest request)
	{
		List<Singleyouthtable> list = a.SelSingleyouthtable(name, age, sex, nation, education, company, chooseSexStandard, marryStatus, "4", page, null);
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("sex", sex);
		request.setAttribute("nation", nation);
		request.setAttribute("education", education);
		request.setAttribute("company", company);
		request.setAttribute("chooseSexStandard", chooseSexStandard);
		request.setAttribute("marryStatus", marryStatus);
		request.setAttribute("status", status);
		request.setAttribute("page", page);
		request.setAttribute("count", a.count(name, age, sex, nation, education, company, chooseSexStandard, marryStatus, "4", page, null));
		return "indexTable/Singleyouthtable/Sel";
	}

	@RequestMapping("GoToUpdSingleyouthtables.naah")
	public String GoToUpd(String id,HttpServletRequest request)
	{
		request.setAttribute("Singleyouthtable", a.Get(id));
		return "table/Singleyouthtable/upd";
	}

	@RequestMapping("GoToSelSingleyouthtables.naah")
	public String GoToSel(String id,HttpServletRequest request)
	{
		request.setAttribute("Singleyouthtable", a.Get(id));
		return "table/Singleyouthtable/table";
	}

	@RequestMapping("GoToInsSingleyouthtables.naah")
	public String GoToIns(String id,HttpServletRequest request)
	{

		return "table/Singleyouthtable/add";
	}

	@RequestMapping("UpdSingleyouthtables.naah")
	public String UpdSingleyouthtable(Singleyouthtable s,HttpSession session)
	{
		a.UpdSingleyouthtable(s, session);
		return "redirect:SelSingleyouthtables.naah?page=1";
	}

	@RequestMapping("UploadSingleyouthtables.naah")
	public String UploadSingleyouthtable(String id,String status,HttpSession session,String reason)
	{
		a.PassOrBack(a.Get(id), status, session, reason);
		return "redirect:SelSingleyouthtables.naah?page=1";
	}

	@RequestMapping("InsSingleyouthtables.naah")
	public String InsSingleyouthtable(Singleyouthtable s,HttpSession session)
	{
		a.InsSingleyouthtable(s, session);

		return "redirect:SelSingleyouthtables.naah?page=1";
	}

	@RequestMapping("DelSingleyouthtables.naah")
	public String DelSingleyouthtable(String id)
	{
		a.DelSingleyouthtable(id);
		return "redirect:SelSingleyouthtables.naah?page=1";
	}

	@Resource(name = "SingleYouthTable")
	public void setA(SingleYouthTableInt a)
	{
		this.a = a;
	}

}
