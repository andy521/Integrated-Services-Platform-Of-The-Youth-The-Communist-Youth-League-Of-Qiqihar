package com.naah.services.interfaces.Table;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.naah.PO.Illnesshelptable;

public interface IllnesshelptableInt
{

	public abstract Illnesshelptable GotoUpd(String id);

	public abstract void Upd(Illnesshelptable a,HttpSession session);

	public abstract void Ins(Illnesshelptable a,HttpSession session);

	public abstract void Del(String id);

	public abstract void PassOrBack(Illnesshelptable a,String flag,HttpSession session,String reason);

	public abstract Illnesshelptable Get(String id);

	public abstract List<Illnesshelptable> Sel(String name,String age,String sex,String nation,String company,String illness,String status,String page,
			HttpSession session);

	public abstract long count(String name,String age,String sex,String nation,String company,String illness,String status,String page,HttpSession session);

}