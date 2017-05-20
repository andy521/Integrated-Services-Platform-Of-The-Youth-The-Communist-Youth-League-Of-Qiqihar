package com.naah.services.interfaces.Table;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.naah.PO.Donatepersontable;

public interface DonatePersonTableInt
{

	public abstract List<Donatepersontable> Sel(String name,String age,String sex,String nation,String status,String page,HttpSession session);

	public abstract long count(String name,String age,String sex,String nation,String status,String page,HttpSession session);

	public abstract Donatepersontable GotoUpd(String id);

	public abstract void Upd(Donatepersontable a,HttpSession session);

	public abstract void Ins(Donatepersontable a,HttpSession session);

	public abstract void Del(String id);

	public abstract void PassOrBack(Donatepersontable a,String flag,HttpSession session,String reason);

	public abstract Donatepersontable Get(String id);

}