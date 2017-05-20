package com.naah.services.interfaces.Table;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.naah.PO.Youthmentalitytable;

public interface YouthmentalitytableInt
{

	public abstract List<Youthmentalitytable> Sel(String name,String age,String sex,String nation,String school,String education,String status,String page,
			HttpSession session);

	public abstract long count(String name,String age,String sex,String nation,String school,String education,String status,String page,HttpSession session);

	public abstract Youthmentalitytable GotoUpd(String id);

	public abstract void Upd(Youthmentalitytable a,HttpSession session);

	public abstract void Ins(Youthmentalitytable a,HttpSession session);

	public abstract void Del(String id);

	public abstract void PassOrBack(Youthmentalitytable a,String flag,HttpSession session,String reason);

	public abstract Youthmentalitytable Get(String id);

}