package com.naah.controller.Continue.Table;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naah.PO.Donatepersontable;
import com.naah.services.interfaces.Table.DonatePersonTableInt;

@Controller
public class DonatePersonTables
{

	private DonatePersonTableInt a;

	@RequestMapping("SelDonatePersonTables.naah")
	public String Sel(String name,String age,String sex,String nation,String status,String page,HttpSession session,HttpServletRequest request)
	{
		List<Donatepersontable> list = a.Sel(name, age, sex, nation, status, page, session);
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("sex", sex);
		request.setAttribute("nation", nation);
		request.setAttribute("status", status);
		request.setAttribute("page", page);
		request.setAttribute("count", a.count(name, age, sex, nation, status, page, session));
		return "table/Donatepersontable/Sel";
	}

	@RequestMapping("indexDonatePersonTables.naah")
	public String indexSel(String name,String age,String sex,String nation,String status,String page,HttpSession session,HttpServletRequest request)
	{
		List<Donatepersontable> list = a.Sel(name, age, sex, nation, "4", page, null);
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("sex", sex);
		request.setAttribute("nation", nation);
		request.setAttribute("status", status);
		request.setAttribute("page", page);
		request.setAttribute("count", a.count(name, age, sex, nation, "4", page, null));
		return "indexTable/Donatepersontable/Sel";
	}

	@RequestMapping("GoToUpdDonatePersonTables.naah")
	public String GoToUpd(String id,HttpServletRequest request)
	{
		request.setAttribute("DonatePersonTable", a.Get(id));
		return "table/Donatepersontable/upd";
	}

	@RequestMapping("GoToSelDonatePersonTables.naah")
	public String GoToSel(String id,HttpServletRequest request)
	{
		request.setAttribute("DonatePersonTable", a.Get(id));
		return "table/Donatepersontable/table";
	}

	@RequestMapping("GoToInsDonatePersonTables.naah")
	public String GoToIns(String id,HttpServletRequest request)
	{

		return "table/Donatepersontable/add";
	}

	@RequestMapping("GoToIndexInsDonatePersonTables.naah")
	public String GoToIndexIns(String id,HttpServletRequest request)
	{

		return "indexTable/Donatepersontable/add";
	}

	@RequestMapping("InsIndexDonatePersonTables.naah")
	public String InsIndex(Donatepersontable s,HttpSession session)
	{
		a.Ins(s, session);

		return "redirect:indexDonatePersonTables.naah?page=1";
	}

	@RequestMapping("UpdDonatePersonTables.naah")
	public String Upd(Donatepersontable s,HttpSession session)
	{
		a.Upd(s, session);
		return "redirect:SelDonatePersonTables.naah?page=1";
	}

	@RequestMapping("UploadDonatePersonTables.naah")
	public String Upload(String id,String status,HttpSession session,String reason)
	{

		a.PassOrBack(a.Get(id), status, session, reason);
		return "redirect:SelDonatePersonTables.naah?page=1";
	}

	@RequestMapping("InsDonatePersonTables.naah")
	public String Ins(Donatepersontable s,HttpSession session)
	{
		a.Ins(s, session);

		return "redirect:SelDonatePersonTables.naah?page=1";
	}

	@RequestMapping("DelDonatePersonTables.naah")
	public String Del(String id)
	{
		a.Del(id);
		return "redirect:SelDonatePersonTables.naah?page=1";
	}

	@Resource(name = "DonatePersonTable")
	public void setA(DonatePersonTableInt a)
	{
		this.a = a;
	}

}
