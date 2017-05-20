package com.naah.services.interfaces.Table;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.naah.PO.Youthworktable;

public interface YouthworktableInt
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.naah.services.implement.Table.OnetoonetableInt#Sel(java.lang.String,
	 * java.lang.String, java.lang.String, javax.servlet.http.HttpSession)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.naah.services.implement.Table.YouthworktableInt#Sel(java.lang.String,
	 * java.lang.String, java.lang.String, javax.servlet.http.HttpSession)
	 */
	public abstract List<Youthworktable> Sel(String name,String sex,String nation,String education,String graduateSchool,String community,String wordDirection,
			String status,String page,HttpSession session);

	public abstract long count(String name,String sex,String nation,String education,String graduateSchool,String community,String wordDirection,String status,
			String page,HttpSession session);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.naah.services.implement.Table.OnetoonetableInt#GotoUpd(java.lang.
	 * String)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.naah.services.implement.Table.YouthworktableInt#GotoUpd(java.lang
	 * .String)
	 */
	public abstract Youthworktable GotoUpd(String id);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.naah.services.implement.Table.OnetoonetableInt#Upd(com.naah.PO.
	 * Onetoonetable, javax.servlet.http.HttpSession)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.naah.services.implement.Table.YouthworktableInt#Upd(com.naah.PO.
	 * Onetoonetable, javax.servlet.http.HttpSession)
	 */
	public abstract void Upd(Youthworktable a,HttpSession session);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.naah.services.implement.Table.OnetoonetableInt#Ins(com.naah.PO.
	 * Onetoonetable, javax.servlet.http.HttpSession)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.naah.services.implement.Table.YouthworktableInt#Ins(com.naah.PO.
	 * Onetoonetable, javax.servlet.http.HttpSession)
	 */
	public abstract void Ins(Youthworktable a,HttpSession session);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.naah.services.implement.Table.OnetoonetableInt#Del(java.lang.String)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.naah.services.implement.Table.YouthworktableInt#Del(java.lang.String)
	 */
	public abstract void Del(String id);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.naah.services.implement.Table.OnetoonetableInt#PassOrBack(com.naah
	 * .PO.Onetoonetable, java.lang.String, javax.servlet.http.HttpSession)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.naah.services.implement.Table.YouthworktableInt#PassOrBack(com.naah
	 * .PO.Onetoonetable, java.lang.String, javax.servlet.http.HttpSession)
	 */
	public abstract void PassOrBack(Youthworktable a,String flag,HttpSession session,String reason);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.naah.services.implement.Table.OnetoonetableInt#Get(java.lang.String)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.naah.services.implement.Table.YouthworktableInt#Get(java.lang.String)
	 */
	public abstract Youthworktable Get(String id);

}