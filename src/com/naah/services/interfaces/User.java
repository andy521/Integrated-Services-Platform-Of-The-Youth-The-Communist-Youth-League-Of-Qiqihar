package com.naah.services.interfaces;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.naah.PO.Userprivileges;
import com.naah.PO.Users;

public interface User
{
	public abstract long count(HttpSession session,String name,String unit);

	public abstract Users SelInfo(HttpSession session);

	public abstract void UpdUser(Users user);

	public abstract void DelUser(String id);

	public abstract void InsUser(Users user);

	public abstract List<Users> SelUser(HttpSession session,String page,String name,String unit);

	public abstract Users GoToUpdUser(String id);

	public abstract Users SelUserHql(String hql);

	public abstract List<Userprivileges> SelUserprivileges(String id);

	public abstract void SavePrivilege(String check[],String id);

}