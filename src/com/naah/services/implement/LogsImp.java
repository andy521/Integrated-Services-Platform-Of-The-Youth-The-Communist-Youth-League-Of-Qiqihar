package com.naah.services.implement;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.naah.DAO.implement.Delete;
import com.naah.DAO.implement.Insert;
import com.naah.DAO.implement.Select;
import com.naah.DAO.implement.Update;
import com.naah.PO.Operationlogs;
import com.naah.PO.Users;
import com.naah.services.interfaces.OperaLogs;

@Service("Logstable")
@Transactional
public class LogsImp implements OperaLogs
{

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Login#Login(com.naah.PO.Users)
	 */
	private Select Sel;
	private Update Upd;
	private Insert Ins;
	private Delete Del;

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Logs#Sel(java.lang.String, java.lang.String, java.lang.String, javax.servlet.http.HttpSession)
	 */
	@Override
	public List<Operationlogs> Sel(String username,String kind,String table,String value,String page,HttpSession session)
	{
		String sql = "from Operationlogs where 1=1 ";
		Users user = (Users) session.getAttribute("user");

		if (username != null && username.equals("") == false)
		{
			sql = sql + " and (users.username like '%" + username + "%' or users.realname like '%" + username + "%')";
		}
		if (kind != null && kind.equals("") == false)
		{
			sql = sql + " and operationKind like '%" + kind + "%'";
		}
		if (table != null && table.equals("") == false)
		{
			sql = sql + " and operationObject like '%" + table + "%'";
		}
		if (value != null && value.equals("") == false)
		{
			sql = sql + " and opeartionValue like '%" + value + "%'";
		}
		sql = sql + " order by operationTime desc";

		return (List<Operationlogs>) Sel.HSQL(sql, Integer.parseInt(page), 10);
	}

	public long count(String username,String kind,String table,String value,String page,HttpSession session)
	{
		String sql = "select count(id) from Operationlogs where 1=1 ";
		Users user = (Users) session.getAttribute("user");

		if (username != null && username.equals("") == false)
		{
			sql = sql + " and (users.username like '%" + username + "%' or users.realname like '%" + username + "%')";
		}
		if (kind != null && kind.equals("") == false)
		{
			sql = sql + " and operationKind like '%" + kind + "%'";
		}
		if (table != null && table.equals("") == false)
		{
			sql = sql + " and operationObject like '%" + table + "%'";
		}
		if (value != null && value.equals("") == false)
		{
			sql = sql + " and opeartionValue like '%" + value + "%'";
		}

		return Sel.getcount(sql);
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Logs#Ins(com.naah.PO.Operationlogs)
	 */
	@Override
	public void Ins(Operationlogs a)
	{

		Ins.INS(a);
	}

	@Resource(name = "sel")
	public void setSel(Select Sel)
	{
		this.Sel = Sel;
	}

	@Resource(name = "upd")
	public void setUpd(Update upd)
	{
		Upd = upd;
	}

	@Resource(name = "ins")
	public void setIns(Insert ins)
	{
		Ins = ins;
	}

	@Resource(name = "del")
	public void setDel(Delete del)
	{
		Del = del;
	}

}
