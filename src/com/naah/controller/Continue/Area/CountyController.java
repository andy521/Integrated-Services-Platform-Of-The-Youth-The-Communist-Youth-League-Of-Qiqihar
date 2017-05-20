package com.naah.controller.Continue.Area;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naah.PO.Areas;
import com.naah.services.interfaces.Area;
import com.naah.services.interfaces.County;


@Controller
public class CountyController {

	private County County;
	
	@RequestMapping("SelCounty.naah")
	public String SelCounty(HttpServletRequest request,String id)
	{
		request.setAttribute("County", County.SelCounty(id));
		request.setAttribute("Id", id);
		return "setSystem/CountyManage";
	}
	@RequestMapping("UpdCounty.naah")
	public String UpdArea(Areas Countys)
	{
		County.UpdCounty(Countys);
		return "redirect:SelCounty.naah?id="+Countys.getAreaParent();
	}
	
	@RequestMapping("DelCounty.naah")
	public String DelArea(Areas Countys)
	{
		String id=Countys.getAreaParent();
		County.DelCounty(Countys);
		return "redirect:SelCounty.naah?id="+id;
	}
	
	@RequestMapping("InsCounty.naah")
	public String InsArea(Areas Countys)
	{
		County.InsArea(Countys);
		return "redirect:SelCounty.naah?id="+Countys.getAreaParent();
	}
	
	
	
	@Resource(name="County")
	public void setAreas(County County) {
		this.County = County;
	}
	
	
}
