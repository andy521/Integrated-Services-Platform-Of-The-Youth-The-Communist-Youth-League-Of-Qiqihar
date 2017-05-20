package com.naah.services.interfaces.Table;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.naah.PO.Youthlawhelptable;

public interface YouthlawhelptableInt
{

	public abstract List<Youthlawhelptable> Sel(String name,String age,String sex,String school,String status,String page,HttpSession session);

	public long count(String name,String age,String sex,String school,String status,String page,HttpSession session);

	public abstract Youthlawhelptable GotoUpd(String id);

	public abstract void Upd(Youthlawhelptable a,HttpSession session);

	public abstract void Ins(Youthlawhelptable a,HttpSession session);

	public abstract void Del(String id);

	public abstract void PassOrBack(Youthlawhelptable a,String flag,HttpSession session,String reason);

	public abstract Youthlawhelptable Get(String id);

}