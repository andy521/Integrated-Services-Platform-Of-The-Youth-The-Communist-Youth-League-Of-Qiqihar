package com.naah.services.implement.Table;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.naah.DAO.implement.Delete;
import com.naah.DAO.implement.Insert;
import com.naah.DAO.implement.Select;
import com.naah.DAO.implement.Update;
import com.naah.PO.Areas;
import com.naah.PO.Users;
import com.naah.PO.Youthworktable;
import com.naah.services.interfaces.Table.YouthworktableInt;

@Service("Youthworktable")
@Transactional
public class YouthworktableImp implements YouthworktableInt
{
	private Select Sel;
	private Update Upd;
	private Insert Ins;
	private Delete Del;

	public String createSql(String name,String sex,String nation,String education,String graduateSchool,String community,String wordDirection,String status,
			String page,HttpSession session)
	{
		String sql = "from Youthworktable where 1=1 ";
		if (session != null)
		{
			Users user = (Users) session.getAttribute("user");

			if (user.getRoleId().equals("01"))
			{
				sql = sql + "and areasByAreaId.areaId='" + user.getAreasByCity().getAreaId() + "' ";
			}
			else if (user.getRoleId().equals("02"))
			{
				sql =
						sql + "and areasByAreaId.areaId='" + user.getAreasByCity().getAreaId() + "' and areasByCountyId.areaId='"
								+ user.getAreasByCounty().getAreaId() + "' ";
			}
		}

		if (name != null && name.equals("") == false)
		{
			sql = sql + " and name like '%" + name + "%'";
		}
		if (sex != null && sex.equals("") == false)
		{
			sql = sql + " and sex like '%" + sex + "%'";
		}
		if (nation != null && nation.equals("") == false)
		{
			sql = sql + " and nation like '%" + nation + "%'";
		}
		if (education != null && education.equals("") == false)
		{
			sql = sql + " and education like '%" + education + "%'";
		}
		if (graduateSchool != null && graduateSchool.equals("") == false)
		{
			sql = sql + " and graduateSchool like '%" + graduateSchool + "%'";
		}
		if (community != null && community.equals("") == false)
		{
			sql = sql + " and community like '%" + community + "%'";
		}
		if (wordDirection != null && wordDirection.equals("") == false)
		{
			sql = sql + " and wordDirection like '%" + wordDirection + "%'";
		}
		if (status != null && status.equals("") == false)
		{
			sql = sql + " and flag like '%" + status + "%'";
		}
		return sql;
	}

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
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.naah.services.implement.Table.YouthworktableInt#Sel(java.lang.String,
	 * java.lang.String, java.lang.String, javax.servlet.http.HttpSession)
	 */
	@Override
	public List<Youthworktable> Sel(String name,String sex,String nation,String education,String graduateSchool,String community,String wordDirection,
			String status,String page,HttpSession session)
	{
		String sql = createSql(name, sex, nation, education, graduateSchool, community, wordDirection, status, page, session);
		sql = sql + " order by uploadDate desc";
		return (List<Youthworktable>) Sel.HSQL(sql, Integer.parseInt(page), 10);
	}

	@Override
	public long count(String name,String sex,String nation,String education,String graduateSchool,String community,String wordDirection,String status,
			String page,HttpSession session)
	{
		String sql = "select count(id) " + createSql(name, sex, nation, education, graduateSchool, community, wordDirection, status, page, session);
		return Sel.getcount(sql);
	}

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
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.naah.services.implement.Table.YouthworktableInt#GotoUpd(java.lang
	 * .String)
	 */
	@Override
	public Youthworktable GotoUpd(String id)
	{
		return (Youthworktable) Sel.getHQL(Youthworktable.class, id);
	}

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
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.naah.services.implement.Table.YouthworktableInt#Upd(com.naah.PO.
	 * Youthworktable, javax.servlet.http.HttpSession)
	 */
	@Override
	public void Upd(Youthworktable a,HttpSession session)
	{
		if (a.getAreasByAreaId() != null && a.getAreasByAreaId().getAreaId() != null)
		{
			a.setAreasByAreaId((Areas) Sel.getHQL(Areas.class, a.getAreasByAreaId().getAreaId()));
		}
		if (a.getAreasByCountyId() != null && a.getAreasByCountyId().getAreaId() != null)
		{
			a.setAreasByCountyId((Areas) Sel.getHQL(Areas.class, a.getAreasByCountyId().getAreaId()));
		}
		a.setUsersByInputUser((Users) Sel.getHQL(Users.class, a.getUsersByInputUser().getUserId()));
		Upd.UPD(a);
	}

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
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.naah.services.implement.Table.YouthworktableInt#Ins(com.naah.PO.
	 * Onetoonetable, javax.servlet.http.HttpSession)
	 */
	@Override
	public void Ins(Youthworktable a,HttpSession session)
	{
		if (a.getAreasByAreaId() != null && a.getAreasByAreaId().getAreaId() != null)
		{
			a.setAreasByAreaId((Areas) Sel.getHQL(Areas.class, a.getAreasByAreaId().getAreaId()));
		}
		if (a.getAreasByCountyId() != null && a.getAreasByCountyId().getAreaId() != null)
		{
			a.setAreasByCountyId((Areas) Sel.getHQL(Areas.class, a.getAreasByCountyId().getAreaId()));
		}
		a.setUploadDate(new Date());
		a.setUsersByInputUser((Users) session.getAttribute("user"));

		a.setFlag("0");
		Ins.INS(a);
	}

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
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.naah.services.implement.Table.YouthworktableInt#Del(java.lang.String)
	 */
	@Override
	public void Del(String id)
	{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("delname", ((Youthworktable) Sel.getHQL(Youthworktable.class, id)).getName());
		Del.DEL((Youthworktable) Sel.getHQL(Youthworktable.class, id));
	}

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
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.naah.services.implement.Table.YouthworktableInt#PassOrBack(com.naah
	 * .PO.Youthworktable, java.lang.String, javax.servlet.http.HttpSession)
	 */
	@Override
	public void PassOrBack(Youthworktable a,String flag,HttpSession session,String reason)
	{
		if (flag.equals("1"))
		{
			a.setFlag("1");
			a.setUsersByAuditUser(null);
			a.setUsersByShowUser(null);
		}
		else if (flag.equals("2"))
		{
			a.setFlag("2");
			a.setUsersByAuditUser((Users) session.getAttribute("user"));
		}
		else if (flag.equals("4"))
		{
			a.setFlag("4");
			a.setUsersByShowUser((Users) session.getAttribute("user"));
		}
		else
		{
			a.setFlag("3");
			a.setReason(reason);
		}
		Upd(a, session);
	}

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
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.naah.services.implement.Table.YouthworktableInt#Get(java.lang.String)
	 */
	@Override
	public Youthworktable Get(String id)
	{
		return (Youthworktable) Sel.getHQL(Youthworktable.class, id);
	}

	@Resource(name = "upd")
	public void setUpd(Update upd)
	{
		Upd = upd;
	}

	@Resource(name = "sel")
	public void setSel(Select sel)
	{
		Sel = sel;
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
