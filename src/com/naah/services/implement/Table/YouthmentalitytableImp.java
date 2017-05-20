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
import com.naah.PO.Youthmentalitytable;
import com.naah.services.interfaces.Table.YouthmentalitytableInt;

@Service("Youthmentalitytable")
@Transactional
public class YouthmentalitytableImp implements YouthmentalitytableInt
{
	private Select Sel;
	private Update Upd;
	private Insert Ins;
	private Delete Del;

	public String createSql(String name,String age,String sex,String nation,String school,String education,String status,String page,HttpSession session)
	{
		String sql = "from Youthmentalitytable where 1=1 ";
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
		if (age != null && age.equals("") == false)
		{
			sql = sql + " and age like '%" + age + "%'";
		}
		if (sex != null && sex.equals("") == false)
		{
			sql = sql + " and sex like '%" + sex + "%'";
		}
		if (nation != null && nation.equals("") == false)
		{
			sql = sql + " and nation like '%" + nation + "%'";
		}
		if (school != null && school.equals("") == false)
		{
			sql = sql + " and school like '%" + school + "%'";
		}
		if (education != null && education.equals("") == false)
		{
			sql = sql + " and nation like '%" + education + "%'";
		}
		if (status != null && status.equals("") == false)
		{
			sql = sql + " and flag like '%" + status + "%'";
		}
		return sql;
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Table.YouthmentalitytableInt#Sel(java.lang.String, java.lang.String, java.lang.String, javax.servlet.http.HttpSession)
	 */
	@Override
	public List<Youthmentalitytable> Sel(String name,String age,String sex,String nation,String school,String education,String status,String page,
			HttpSession session)
	{
		String sql = createSql(name, age, sex, nation, school, education, status, page, session);
		sql = sql + " order by uploadDate desc";
		return (List<Youthmentalitytable>) Sel.HSQL(sql, Integer.parseInt(page), 10);
	}

	@Override
	public long count(String name,String age,String sex,String nation,String school,String education,String status,String page,HttpSession session)
	{
		String sql = "select count(id) " + createSql(name, age, sex, nation, school, education, status, page, session);

		return Sel.getcount(sql);
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Table.YouthmentalitytableInt#GotoUpd(java.lang.String)
	 */
	@Override
	public Youthmentalitytable GotoUpd(String id)
	{
		return (Youthmentalitytable) Sel.getHQL(Youthmentalitytable.class, id);
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Table.YouthmentalitytableInt#Upd(com.naah.PO.Youthmentalitytable, javax.servlet.http.HttpSession)
	 */
	@Override
	public void Upd(Youthmentalitytable a,HttpSession session)
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
	 * @see com.naah.services.implement.Table.YouthmentalitytableInt#Ins(com.naah.PO.Youthmentalitytable, javax.servlet.http.HttpSession)
	 */
	@Override
	public void Ins(Youthmentalitytable a,HttpSession session)
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
	 * @see com.naah.services.implement.Table.YouthmentalitytableInt#Del(java.lang.String)
	 */
	@Override
	public void Del(String id)
	{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("delname", ((Youthmentalitytable) Sel.getHQL(Youthmentalitytable.class, id)).getName());
		Del.DEL((Youthmentalitytable) Sel.getHQL(Youthmentalitytable.class, id));
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Table.YouthmentalitytableInt#PassOrBack(com.naah.PO.Youthmentalitytable, java.lang.String, javax.servlet.http.HttpSession)
	 */
	@Override
	public void PassOrBack(Youthmentalitytable a,String flag,HttpSession session,String reason)
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
	 * @see com.naah.services.implement.Table.YouthmentalitytableInt#Get(java.lang.String)
	 */
	@Override
	public Youthmentalitytable Get(String id)
	{
		return (Youthmentalitytable) Sel.getHQL(Youthmentalitytable.class, id);
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
