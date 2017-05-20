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
import com.naah.PO.Universitytable;
import com.naah.PO.Users;
import com.naah.services.interfaces.Table.UniversitytableInt;

@Service("Universitytable")
@Transactional
public class UniversitytableImp implements UniversitytableInt
{

	private Select Sel;
	private Update Upd;
	private Insert Ins;
	private Delete Del;

	public String createSql(String name,String sex,String nation,String highSchool,String university,String status,String page,HttpSession session)
	{
		String sql = "from Universitytable where 1=1 ";
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
		if (highSchool != null && highSchool.equals("") == false)
		{
			sql = sql + " and highSchool like '%" + highSchool + "%'";
		}
		if (university != null && university.equals("") == false)
		{
			sql = sql + " and university like '%" + university + "%'";
		}
		if (status != null && status.equals("") == false)
		{
			sql = sql + " and flag like '%" + status + "%'";
		}
		return sql;
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Table.UniversitytableInt#Sel(java.lang.String, java.lang.String, java.lang.String, javax.servlet.http.HttpSession)
	 */
	@Override
	public List<Universitytable> Sel(String name,String sex,String nation,String highSchool,String university,String status,String page,HttpSession session)
	{
		String sql = createSql(name, sex, nation, highSchool, university, status, page, session);
		sql = sql + " order by uploadDate desc";
		return (List<Universitytable>) Sel.HSQL(sql, Integer.parseInt(page), 10);
	}

	@Override
	public long count(String name,String sex,String nation,String highSchool,String university,String status,String page,HttpSession session)
	{
		String sql = "select count(id) " + createSql(name, sex, nation, highSchool, university, status, page, session);

		return Sel.getcount(sql);
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Table.UniversitytableInt#GotoUpd(java.lang.String)
	 */
	@Override
	public Universitytable GotoUpd(String id)
	{
		return (Universitytable) Sel.getHQL(Universitytable.class, id);
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Table.UniversitytableInt#Upd(com.naah.PO.Universitytable, javax.servlet.http.HttpSession)
	 */
	@Override
	public void Upd(Universitytable a,HttpSession session)
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

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Table.UniversitytableInt#Ins(com.naah.PO.Universitytable, javax.servlet.http.HttpSession)
	 */
	@Override
	public void Ins(Universitytable a,HttpSession session)
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

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Table.UniversitytableInt#Del(java.lang.String)
	 */
	@Override
	public void Del(String id)
	{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("delname", ((Universitytable) Sel.getHQL(Universitytable.class, id)).getName());
		Del.DEL((Universitytable) Sel.getHQL(Universitytable.class, id));
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Table.UniversitytableInt#PassOrBack(com.naah.PO.Universitytable, java.lang.String, javax.servlet.http.HttpSession)
	 */
	@Override
	public void PassOrBack(Universitytable a,String flag,HttpSession session,String reason)
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

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Table.UniversitytableInt#Get(java.lang.String)
	 */
	@Override
	public Universitytable Get(String id)
	{
		return (Universitytable) Sel.getHQL(Universitytable.class, id);
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
