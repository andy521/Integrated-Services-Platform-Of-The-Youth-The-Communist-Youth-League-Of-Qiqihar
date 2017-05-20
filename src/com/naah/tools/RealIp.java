package com.naah.tools;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class RealIp
{
	public static String Ip()
	{

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();

		String ip = request.getHeader("x-forwarded-for");
		if (null == ip || 0 == ip.length() || "unknown".equalsIgnoreCase(ip))
		{
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (null == ip || 0 == ip.length() || "unknown".equalsIgnoreCase(ip))
		{
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (null == ip || 0 == ip.length() || "unknown".equalsIgnoreCase(ip))
		{
			ip = request.getHeader("X-Real-IP");
		}
		if (null == ip || 0 == ip.length() || "unknown".equalsIgnoreCase(ip))
		{
			ip = request.getRemoteAddr();
		}

		return ip;
	}
}
