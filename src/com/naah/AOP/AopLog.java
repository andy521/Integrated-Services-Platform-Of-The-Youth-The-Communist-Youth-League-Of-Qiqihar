package com.naah.AOP;

import java.sql.Timestamp;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.naah.PO.Areas;
import com.naah.PO.Operationlogs;
import com.naah.PO.Users;
import com.naah.services.implement.logstoolsImp;
import com.naah.services.interfaces.OperaLogs;
import com.naah.services.interfaces.logstoolInt;
import com.naah.tools.RealIp;

@Aspect
@Component
public class AopLog
{
	private logstoolInt tools = new logstoolsImp();

	private OperaLogs logs;

	//	@AfterReturning("execution(* com.naah.controller.Continue.Table.*.Sel*(..))")
	//	public void sel(JoinPoint pjp)
	//	{
	//
	//		logs.Ins(tools.sel(pjp));
	//
	//	}

	@AfterReturning("execution(* com.naah.controller.Continue.Table.*.Ins*(..))")
	public void ins(JoinPoint pjp)
	{
		logs.Ins(tools.ins(pjp));
	}

	@AfterReturning("execution(* com.naah.controller.Continue.Table.*.Upd*(..))")
	public void upd(JoinPoint pjp)
	{

		logs.Ins(tools.upd(pjp));

	}

	@AfterReturning("execution(* com.naah.controller.Continue.Table.*.Del*(..))")
	public void del(JoinPoint pjp)
	{

		logs.Ins(tools.del(pjp));

	}

	@AfterReturning("execution(* com.naah.controller.Continue.Table.*.Upload*(..))")
	public void Upload(JoinPoint pjp)
	{

		logs.Ins(tools.upload(pjp));

	}

	//	@AfterReturning("execution(* com.naah.controller.Continue.Table.*.GoTo*(..))")
	//	public void GoTo(JoinPoint pjp)
	//	{
	//
	//		logs.Ins(tools.GoTo(pjp));
	//
	//	}

	@AfterReturning("execution(* com.naah.controller.Continue.Login.login.login*(..))")
	public void login(JoinPoint pjp)
	{

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		if (session.getAttribute("user") != null)
		{
			logs.Ins(tools.login(pjp));
		}

	}

	@AfterReturning("execution(* com.naah.controller.Continue.Area.*.Ins*(..))")
	public void insarea(JoinPoint pjp)
	{

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		Operationlogs a = new Operationlogs();
		String targetClassName = pjp.getTarget().getClass().getName();
		a.setUsers((Users) session.getAttribute("user"));
		a.setOperationKind("录入");
		a.setOperationIp(RealIp.Ip());
		a.setOperationTime(new Timestamp(System.currentTimeMillis()));
		if (targetClassName.substring(targetClassName.lastIndexOf('.') + 1).equals("AreaController"))
		{
			a.setOperationObject("区县");
		}
		else
		{
			a.setOperationObject("街道");
		}
		a.setOpeartionValue(((Areas) pjp.getArgs()[0]).getAreaName());
		logs.Ins(a);

	}

	@AfterReturning("execution(* com.naah.controller.Continue.Area.*.Del*(..))")
	public void delarea(JoinPoint pjp)
	{

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		Operationlogs a = new Operationlogs();
		String targetClassName = pjp.getTarget().getClass().getName();
		a.setUsers((Users) session.getAttribute("user"));
		a.setOperationKind("删除");
		a.setOperationIp(RealIp.Ip());
		a.setOperationTime(new Timestamp(System.currentTimeMillis()));
		if (targetClassName.substring(targetClassName.lastIndexOf('.') + 1).equals("AreaController"))
		{
			a.setOperationObject("区县");
		}
		else
		{
			a.setOperationObject("街道");
		}
		a.setOpeartionValue(((Areas) pjp.getArgs()[0]).getAreaName());

		logs.Ins(a);

	}

	@AfterReturning("execution(* com.naah.controller.Continue.Area.*.Upd*(..))")
	public void updarea(JoinPoint pjp)
	{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		Operationlogs a = new Operationlogs();
		String targetClassName = pjp.getTarget().getClass().getName();
		a.setUsers((Users) session.getAttribute("user"));
		a.setOperationKind("修改");
		a.setOperationIp(RealIp.Ip());
		a.setOperationTime(new Timestamp(System.currentTimeMillis()));
		if (targetClassName.substring(targetClassName.lastIndexOf('.') + 1).equals("AreaController"))
		{
			a.setOperationObject("区县");
		}
		else
		{
			a.setOperationObject("街道");
		}
		a.setOpeartionValue(((Areas) pjp.getArgs()[0]).getAreaName());

		logs.Ins(a);
	}

	@AfterReturning("execution(* com.naah.controller.Continue.User.*.Ins*(..))")
	public void insuser(JoinPoint pjp)
	{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		Operationlogs a = new Operationlogs();
		String targetClassName = pjp.getTarget().getClass().getName();
		a.setUsers((Users) session.getAttribute("user"));
		a.setOperationKind("录入");
		a.setOperationIp(RealIp.Ip());
		a.setOperationTime(new Timestamp(System.currentTimeMillis()));
		a.setOperationObject("用户");

		a.setOpeartionValue(((Users) pjp.getArgs()[0]).getUsername());

		logs.Ins(a);
	}

	@AfterReturning("execution(* com.naah.controller.Continue.User.*.Del*(..))")
	public void deluser(JoinPoint pjp)
	{
		logs.Ins(tools.deluser(pjp));
	}

	@AfterReturning("execution(* com.naah.controller.Continue.User.*.Save*(..))")
	public void SavePrivilege(JoinPoint pjp)
	{
		logs.Ins(tools.SavePrivilege(pjp));
	}

	@AfterReturning("execution(* com.naah.controller.Continue.User.*.Upd*(..))")
	public void upduser(JoinPoint pjp)
	{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		Operationlogs a = new Operationlogs();
		String targetClassName = pjp.getTarget().getClass().getName();
		a.setUsers((Users) session.getAttribute("user"));
		a.setOperationKind("修改");
		a.setOperationIp(RealIp.Ip());
		a.setOperationTime(new Timestamp(System.currentTimeMillis()));
		a.setOperationObject("用户");

		a.setOpeartionValue(((Users) pjp.getArgs()[0]).getUsername());

		logs.Ins(a);
	}

	@Resource(name = "Logstable")
	public void setLogs(OperaLogs logs)
	{
		this.logs = logs;
	}

	@Resource(name = "logstools")
	public void setTools(logstoolInt tools)
	{
		this.tools = tools;
	}

}
