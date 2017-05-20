package com.naah.services.interfaces.Table;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.naah.PO.Universitytable;

public interface UniversitytableInt
{

	public abstract List<Universitytable> Sel(String name,String sex,String nation,String highSchool,String university,String status,String page,
			HttpSession session);

	public abstract long count(String name,String sex,String nation,String highSchool,String university,String status,String page,HttpSession session);

	public abstract Universitytable GotoUpd(String id);

	public abstract void Upd(Universitytable a,HttpSession session);

	public abstract void Ins(Universitytable a,HttpSession session);

	public abstract void Del(String id);

	public abstract void PassOrBack(Universitytable a,String flag,HttpSession session,String reason);

	public abstract Universitytable Get(String id);

}