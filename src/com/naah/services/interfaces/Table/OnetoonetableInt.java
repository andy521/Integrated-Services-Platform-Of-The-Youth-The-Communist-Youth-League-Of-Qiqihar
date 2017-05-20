package com.naah.services.interfaces.Table;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.naah.PO.Onetoonetable;

public interface OnetoonetableInt
{

	public abstract List<Onetoonetable> Sel(String name,String age,String sex,String nation,String school,String community,String status,String page,
			HttpSession session);

	public abstract long count(String name,String age,String sex,String nation,String school,String community,String status,String page,HttpSession session);

	public abstract Onetoonetable GotoUpd(String id);

	public abstract void Upd(Onetoonetable a,HttpSession session);

	public abstract void Ins(Onetoonetable a,HttpSession session);

	public abstract void Del(String id);

	public abstract void PassOrBack(Onetoonetable a,String flag,HttpSession session,String reason);

	public abstract Onetoonetable Get(String id);

}