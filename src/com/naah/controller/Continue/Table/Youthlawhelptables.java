package com.naah.controller.Continue.Table;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naah.PO.Youthlawhelptable;
import com.naah.services.interfaces.Table.YouthlawhelptableInt;

@Controller
public class Youthlawhelptables
{
	private YouthlawhelptableInt a;

	@RequestMapping("SelYouthlawhelptables.naah")
	public String Sel(String name,String age,String sex,String school,String status,String page,HttpSession session,HttpServletRequest request)
	{
		List<Youthlawhelptable> list = a.Sel(name, age, sex, school, status, page, session);
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("sex", sex);
		request.setAttribute("school", school);
		request.setAttribute("status", status);
		request.setAttribute("page", page);
		request.setAttribute("count", a.count(name, age, sex, school, status, page, session));
		return "table/Youthlawhelptable/Sel";
	}

	@RequestMapping("indexYouthlawhelptables.naah")
	public String indexSel(String name,String age,String sex,String school,String status,String page,HttpSession session,HttpServletRequest request)
	{
		List<Youthlawhelptable> list = a.Sel(name, age, sex, school, "4", page, null);
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("sex", sex);
		request.setAttribute("school", school);
		request.setAttribute("status", status);
		request.setAttribute("page", page);
		request.setAttribute("count", a.count(name, age, sex, school, "4", page, null));
		return "indexTable/Youthlawhelptable/Sel";
	}

	@RequestMapping("GoToUpdYouthlawhelptables.naah")
	public String GoToUpd(String id,HttpServletRequest request)
	{
		request.setAttribute("Youthlawhelptable", a.Get(id));
		return "table/Youthlawhelptable/upd";
	}

	@RequestMapping("GoToSelYouthlawhelptables.naah")
	public String GoToSel(String id,HttpServletRequest request)
	{
		request.setAttribute("Youthlawhelptable", a.Get(id));
		return "table/Youthlawhelptable/table";
	}

	@RequestMapping("GoToInsYouthlawhelptables.naah")
	public String GoToIns(String id,HttpServletRequest request)
	{

		return "table/Youthlawhelptable/add";
	}

	@RequestMapping("UpdYouthlawhelptables.naah")
	public String Upd(Youthlawhelptable s,HttpSession session)
	{
		a.Upd(s, session);
		return "redirect:SelYouthlawhelptables.naah?page=1";
	}

	@RequestMapping("UploadYouthlawhelptables.naah")
	public String Upload(String id,String status,HttpSession session,String reason)
	{
		a.PassOrBack(a.Get(id), status, session, reason);
		return "redirect:SelYouthlawhelptables.naah?page=1";
	}

	@RequestMapping("InsYouthlawhelptables.naah")
	public String Ins(Youthlawhelptable s,HttpSession session)
	{
		a.Ins(s, session);

		return "redirect:SelYouthlawhelptables.naah?page=1";
	}

	@RequestMapping("DelYouthlawhelptables.naah")
	public String Del(String id)
	{
		a.Del(id);
		return "redirect:SelYouthlawhelptables.naah?page=1";
	}

	@Resource(name = "Youthlawhelptable")
	public void setA(YouthlawhelptableInt a)
	{
		this.a = a;
	}

}
