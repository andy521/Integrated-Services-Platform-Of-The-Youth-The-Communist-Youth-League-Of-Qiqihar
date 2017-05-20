package com.naah.services.interfaces.Table;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.naah.PO.Singleyouthtable;

public interface SingleYouthTableInt
{

	public abstract List<Singleyouthtable> SelSingleyouthtable(String name,String age,String sex,String nation,String education,String company,
			String chooseSexStandard,String marryStatus,String status,String page,HttpSession session);

	public abstract long count(String name,String age,String sex,String nation,String education,String company,String chooseSexStandard,String marryStatus,
			String status,String page,HttpSession session);

	public abstract void UpdSingleyouthtable(Singleyouthtable s,HttpSession session);

	public abstract void InsSingleyouthtable(Singleyouthtable a,HttpSession session);

	public abstract void DelSingleyouthtable(String id);

	public abstract void PassOrBack(Singleyouthtable a,String flag,HttpSession session,String reason);

	public abstract Singleyouthtable Get(String id);

}