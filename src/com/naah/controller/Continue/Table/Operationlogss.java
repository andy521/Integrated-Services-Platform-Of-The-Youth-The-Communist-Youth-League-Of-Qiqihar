package com.naah.controller.Continue.Table;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naah.PO.Operationlogs;
import com.naah.services.interfaces.OperaLogs;

@Controller
public class Operationlogss
{
	private OperaLogs a;

	@RequestMapping("logs.naah")
	public String Sel(String username,String kind,String table,String value,String page,HttpSession session,HttpServletRequest request)
	{
		List<Operationlogs> list = a.Sel(username, kind, table, value, page, session);

		request.setAttribute("list", list);
		request.setAttribute("username", username);
		request.setAttribute("kind", kind);
		request.setAttribute("table", table);
		request.setAttribute("value", value);
		request.setAttribute("page", page);
		request.setAttribute("count", a.count(username, kind, table, value, page, session));
		return "log/log";
	}

	@Resource(name = "Logstable")
	public void setA(OperaLogs a)
	{
		this.a = a;
	}

}
