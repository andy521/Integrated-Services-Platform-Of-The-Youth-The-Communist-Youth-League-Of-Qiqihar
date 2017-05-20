package com.naah.services.interfaces;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.naah.PO.Operationlogs;

public interface OperaLogs
{

	public abstract List<Operationlogs> Sel(String username,String kind,String table,String value,String page,HttpSession session);

	public abstract long count(String username,String kind,String table,String value,String page,HttpSession session);

	public abstract void Ins(Operationlogs a);

}