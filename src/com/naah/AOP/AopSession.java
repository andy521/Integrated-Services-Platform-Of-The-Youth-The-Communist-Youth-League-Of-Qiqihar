package com.naah.AOP;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.naah.PO.Users;

@Aspect
@Component
public class AopSession
{

	@Pointcut(value = "execution(* com.naah.controller..*(..)) " + "&& !execution(* com.naah.controller.Continue.Ajax.*.*(..))"
			+ " && !execution(* com.naah.controller.Continue.Login.*.*(..))" + " && !execution(* com.naah.controller.GoTo..*.*(..))"
			+ " && !execution(* com.naah.controller.Continue.Table.*.index*(..))"
			+ " && !execution(* com.naah.controller.Continue.Table.DonatePersonTables.GoToIndexIns(..))"
			+ " && !execution(* com.naah.controller.Continue.Table.DonatePersonTables.InsIndex(..))")
	public void beforeSession()
	{

	}

	//,JoinPoint joinPoint
	@Around("beforeSession()")
	public Object checkSecurity(ProceedingJoinPoint pjp) throws Throwable
	{

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();

		if (session != null && session.getAttribute("user") != null && ((Users) session.getAttribute("user")).getRoleId().equals("") == false)
		{

			return pjp.proceed();
		}
		else
		{
			request.setAttribute("message", "norole");
			return "msg";
		}
	}

}
