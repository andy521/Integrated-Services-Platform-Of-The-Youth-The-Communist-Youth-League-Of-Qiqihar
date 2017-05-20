package com.naah.services.interfaces.Table;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.naah.PO.Wishtable;

public interface WishtableInt
{

	public abstract List<Wishtable> Sel(String name,String age,String sex,String nation,String school,String community,String status,String page,
			HttpSession session);

	public abstract long count(String name,String age,String sex,String nation,String school,String community,String status,String page,HttpSession session);

	public abstract Wishtable GotoUpd(String id);

	public abstract void Upd(Wishtable a,HttpSession session);

	public abstract void Ins(Wishtable a,HttpSession session);

	public abstract void Del(String id);

	public abstract void PassOrBack(Wishtable a,String flag,HttpSession session,String reason);

	public abstract Wishtable Get(String id);

}