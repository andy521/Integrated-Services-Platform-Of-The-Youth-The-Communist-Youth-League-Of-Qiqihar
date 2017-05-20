package com.naah.controller.Continue.Ajax;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.naah.DAO.implement.Select;
import com.naah.PO.Areas;
import com.naah.PO.Users;
import com.naah.services.interfaces.Area;
import com.naah.services.interfaces.County;

@Controller
public class UserAjax
{

	private Area areas;
	private County County;
	private Select Sel;

	@RequestMapping("reason.naah")
	public @ResponseBody
	List reason(String id,String tablename)
	{
		String hql = "Select reason as showreason from " + tablename + " where id='" + id + "'";
		return Sel.HSQL(hql);

	}

	@RequestMapping("userCity.naah")
	public @ResponseBody
	List<Areas> userCity(HttpSession session)
	{
		List<Areas> area = new ArrayList<>();
		String roleid = ((Users) session.getAttribute("user")).getRoleId();
		if (roleid != null && roleid.equals("09"))
		{
			area = areas.SelArea();
		}
		else if (roleid != null && roleid.equals("01"))
		{
			area = areas.SelOneArea(((Users) session.getAttribute("user")).getAreasByCity().getAreaId());
		}
		return area;
	}

	@RequestMapping("userCounty.naah")
	public @ResponseBody
	List<Areas> userCounty(String cityid,HttpSession session)
	{
		List<Areas> county = new ArrayList<>();
		String roleid = ((Users) session.getAttribute("user")).getRoleId();
		if (roleid != null && roleid.equals("02"))
		{
			county = County.SelOneCounty(cityid, ((Users) session.getAttribute("user")).getAreasByCounty().getAreaId());
		}
		else
		{
			county = County.SelCounty(cityid);
		}

		return county;

	}

	@RequestMapping("closeWindow.naah")
	public void closerWindow(String id,HttpSession session)
	{
		//WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();

		//ServletContext application = webApplicationContext.getServletContext();
		//Set userlist = (Set) application.getAttribute("userlist");

		//userlist.remove(id);

		//application.setAttribute("userlist", userlist);

		//session.invalidate();
	}

	@Resource(name = "Area")
	public void setAreas(Area areas)
	{
		this.areas = areas;
	}

	@Resource(name = "County")
	public void setAreas(County County)
	{
		this.County = County;
	}

	@Resource(name = "sel")
	public void setSel(Select sel)
	{
		Sel = sel;
	}
}
