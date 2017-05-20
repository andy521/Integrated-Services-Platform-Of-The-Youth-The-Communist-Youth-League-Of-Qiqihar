package com.naah.services.implement;

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
import com.naah.PO.Privileges;
import com.naah.PO.Userprivileges;
import com.naah.PO.Users;
import com.naah.services.interfaces.User;
import com.naah.tools.MD5;

@Service("User")
@Transactional
public class UserImp implements User
{
	private Select Sel;
	private Update Upd;
	private Insert Ins;
	private Delete Del;

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Info#SelUser(javax.servlet.http.HttpSession)
	 */
	@Override
	public Users SelInfo(HttpSession session)
	{
		return (Users) Sel.getHQL(Users.class, ((Users) session.getAttribute("user")).getUserId());
	}

	public String createSql(HttpSession session,String name,String unit)
	{
		String sql = null;
		if ((name == null || name.equals("")) && (unit == null || unit.equals("")))
		{
			if (((Users) session.getAttribute("user")).getRoleId().equals("01"))
			{
				sql = "from Users where areasByCity.areaId='" + ((Users) session.getAttribute("user")).getAreasByCity().getAreaId() + "'";
			}
			else if (((Users) session.getAttribute("user")).getRoleId().equals("02"))
			{
				sql =
						"from Users where areasByCity.areaId='" + ((Users) session.getAttribute("user")).getAreasByCity().getAreaId()
								+ "' and areasByCounty.areaId='" + ((Users) session.getAttribute("user")).getAreasByCounty().getAreaId() + "'";
			}
			else
			{
				sql = "from Users";
			}
		}
		else
		{
			if (name == null || name.equals(""))
			{
				if (((Users) session.getAttribute("user")).getRoleId().equals("01"))
				{
					sql =
							"from Users where unit like'%" + unit + "%' and areasByCity.areaId='"
									+ ((Users) session.getAttribute("user")).getAreasByCity().getAreaId() + "'";
				}
				else if (((Users) session.getAttribute("user")).getRoleId().equals("02"))
				{
					sql =
							"from Users where areasByCounty.areaId='" + ((Users) session.getAttribute("user")).getAreasByCounty().getAreaId()
									+ "' and unit like '%" + unit + "%' and areasByCity.areaId='"
									+ ((Users) session.getAttribute("user")).getAreasByCity().getAreaId() + "'";
				}
				else
				{
					sql = "from Users where unit like'%" + unit + "%'";
				}
			}
			else if (unit == null || unit.equals(""))
			{
				if (((Users) session.getAttribute("user")).getRoleId().equals("01"))
				{
					sql =
							"from Users where username like '%" + name + "%' or realname like '%" + name + "%' and areasByCity.areaId='"
									+ ((Users) session.getAttribute("user")).getAreasByCity().getAreaId() + "'";
				}
				else if (((Users) session.getAttribute("user")).getRoleId().equals("02"))
				{
					sql =
							"from Users where areasByCounty.areaId='" + ((Users) session.getAttribute("user")).getAreasByCounty().getAreaId()
									+ "' and ( username like '%" + name + "%' or realname like '%" + name + "%') and areasByCity.areaId='"
									+ ((Users) session.getAttribute("user")).getAreasByCity().getAreaId() + "'";
				}
				else
				{
					sql = "from Users where username like '%" + name + "%' or realname like '%" + name + "%'";
				}
			}
			else
			{
				if (((Users) session.getAttribute("user")).getRoleId().equals("01"))
				{
					sql =
							"from Users where (username like '%" + name + "%' or realname like '%" + name + "%') and unit like '%" + unit
									+ "%' and areasByCity.areaId='" + ((Users) session.getAttribute("user")).getAreasByCity().getAreaId() + "'";
				}
				else if (((Users) session.getAttribute("user")).getRoleId().equals("02"))
				{
					sql =
							"from Users where areasByCounty.areaId='" + ((Users) session.getAttribute("user")).getAreasByCounty().getAreaId()
									+ "' and ( username like '%" + name + "%' or realname like '%" + name + "%') and unit like '%" + unit + "%'";
				}
				else
				{
					sql = "from Users where (username like '%" + name + "%' or realname like '%" + name + "%') and unit like '%" + unit + "%'";
				}
			}

		}

		return sql;
	}

	@Override
	public long count(HttpSession session,String name,String unit)
	{
		// TODO Auto-generated method stub
		String sql = "select count(id) " + createSql(session, name, unit);
		return Sel.getcount(sql);
	}

	@Override
	public List<Users> SelUser(HttpSession session,String page,String name,String unit)
	{
		String sql = createSql(session, name, unit);
		return (List<Users>) Sel.HSQL(sql, Integer.parseInt(page), 10);

	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Info#UpdUser(com.naah.PO.Users)
	 */
	@Override
	public void UpdUser(Users user)
	{
		if (user.getPassword() == null || user.getPassword().equals(""))
		{
			user.setPassword(((Users) Sel.getHQL(Users.class, user.getUserId())).getPassword());
		}
		else
		{
			user.setPassword(MD5.MD5_32(user.getPassword()));
		}

		if (user.getRoleId() != null && user.getRoleId().equals("01"))
		{
			user.setRoleId("01");
			user.setAreasByCity((Areas) Sel.getHQL(Areas.class, user.getAreasByCity().getAreaId()));
		}
		else if (user.getRoleId() != null && user.getRoleId().equals("02"))
		{
			user.setRoleId("02");
			user.setAreasByCity((Areas) Sel.getHQL(Areas.class, user.getAreasByCity().getAreaId()));
			user.setAreasByCounty((Areas) Sel.getHQL(Areas.class, user.getAreasByCounty().getAreaId()));
		}
		else
		{
			user.setRoleId("09");
			user.setAreasByCity(null);
			user.setAreasByCounty(null);
		}

		Upd.UPD(user);
	}

	public Users GoToUpdUser(String id)
	{
		return (Users) Sel.getHQL(Users.class, id);
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Info#DelUser(com.naah.PO.Users)
	 */
	@Override
	public void DelUser(String id)
	{
		Users user = (Users) Sel.getHQL(Users.class, id);
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("delname", user.getUsername());
		Del.DEL(user);
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Info#InsUser(com.naah.PO.Users)
	 */
	@Override
	public void InsUser(Users user)
	{
		user.setPassword(MD5.MD5_32(user.getPassword()));

		if (user.getRoleId() != null && user.getRoleId().equals("01"))
		{
			user.setRoleId("01");
			user.setAreasByCity((Areas) Sel.getHQL(Areas.class, user.getAreasByCity().getAreaId()));
		}
		else if (user.getRoleId() != null && user.getRoleId().equals("02"))
		{
			user.setRoleId("02");
			user.setAreasByCity((Areas) Sel.getHQL(Areas.class, user.getAreasByCity().getAreaId()));
			user.setAreasByCounty((Areas) Sel.getHQL(Areas.class, user.getAreasByCounty().getAreaId()));
		}
		else
		{
			user.setRoleId("09");
			user.setAreasByCity(null);
			user.setAreasByCounty(null);
		}
		Ins.INS(user);
	}

	@Override
	public Users SelUserHql(String hql)
	{
		List l = Sel.HSQL(hql);
		if (l.size() > 0)
		{
			return (Users) l.get(0);
		}
		else
		{
			return null;
		}

	}

	@Override
	public List<Userprivileges> SelUserprivileges(String id)
	{
		// TODO Auto-generated method stub

		return Sel.HSQL("from Userprivileges where users.userId='" + id + "'");
	}

	@Override
	public void SavePrivilege(String[] check,String id)
	{
		// TODO Auto-generated method stub
		List a = Sel.HSQL("from Userprivileges where users.userId='" + id + "'");

		if (a != null && a.size() > 0)
		{
			Del.Delhql("delete from Userprivileges where users.userId='" + id + "'");
		}

		if (check.length != 0)
		{
			for (int i = 0; i < check.length; i++)
			{
				Userprivileges u = new Userprivileges();
				u.setUsers((Users) Sel.getHQL(Users.class, id));
				u.setPrivileges((Privileges) Sel.getHQL(Privileges.class, check[i]));
				Ins.INS(u);

			}
		}

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
