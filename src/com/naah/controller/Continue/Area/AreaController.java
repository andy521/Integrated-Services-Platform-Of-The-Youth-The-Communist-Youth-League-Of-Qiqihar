package com.naah.controller.Continue.Area;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naah.PO.Areas;
import com.naah.services.interfaces.Area;


@Controller
public class AreaController {

	private Area areas;
	
	@RequestMapping("SelArea.naah")
	public String SelArea(HttpServletRequest request)
	{
		request.setAttribute("Area", areas.SelArea());
		return "setSystem/areaManage";
	}
	@RequestMapping("UpdArea.naah")
	public String UpdArea(Areas area)
	{
		areas.UpdArea(area);
		return "redirect:SelArea.naah";
	}
	
	@RequestMapping("DelArea.naah")
	public String DelArea(Areas area)
	{
		
		areas.DelArea(area);
		return "redirect:SelArea.naah";
	}
	
	@RequestMapping("InsArea.naah")
	public String InsArea(Areas area)
	{
		areas.InsArea(area);
		return "redirect:SelArea.naah";
	}
	
	
	
	@Resource(name="Area")
	public void setAreas(Area areas) {
		this.areas = areas;
	}
	
	
}
