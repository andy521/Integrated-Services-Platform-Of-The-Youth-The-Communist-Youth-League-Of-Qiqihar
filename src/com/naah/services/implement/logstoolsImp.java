package com.naah.services.implement;

import java.sql.Timestamp;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.naah.DAO.implement.Select;
import com.naah.PO.Donatepersontable;
import com.naah.PO.Illnesshelptable;
import com.naah.PO.Onetoonetable;
import com.naah.PO.Operationlogs;
import com.naah.PO.Singleyouthtable;
import com.naah.PO.Universitytable;
import com.naah.PO.Users;
import com.naah.PO.Wishtable;
import com.naah.PO.Youthlawhelptable;
import com.naah.PO.Youthmentalitytable;
import com.naah.PO.Youthworktable;
import com.naah.services.interfaces.logstoolInt;
import com.naah.tools.RealIp;

@Service("logstools")
@Transactional
public class logstoolsImp implements logstoolInt
{
	private Select Sel;

	private String showName(String classname)
	{

		switch (classname)
		{
			case "DonatePersonTables":
				return "捐赠人员信息登记表";
			case "Illnesshelptables":
				return "医疗救助登记表";
			case "Onetoonetables":
				return "手拉手结对信息登记表";
			case "Singleyouthtables":
				return "单身青年信息登记表";
			case "Universitytables":
				return "圆梦行动学生信息登记表";
			case "Wishtables":
				return "微心愿录入登记表";
			case "Youthlawhelptables":
				return "青少年法律援助申请登记表";
			case "Youthmentalitytables":
				return "青少年心理咨询登记表";
			case "Youthworktables":
				return "青年就业创业信息登记表";
			default:
				return "";
		}
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.logstoolInt#sel(org.aspectj.lang.JoinPoint)
	 */
	@Override
	public Operationlogs sel(JoinPoint pjp)
	{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		String targetClassName = pjp.getTarget().getClass().getName();
		Operationlogs a = new Operationlogs();

		a.setUsers((Users) session.getAttribute("user"));
		a.setOperationKind("查询");
		a.setOperationIp(RealIp.Ip());
		a.setOperationTime(new Timestamp(System.currentTimeMillis()));
		a.setOperationObject(showName(targetClassName.substring(targetClassName.lastIndexOf('.') + 1)));
		a.setOpeartionValue(null);

		return a;
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.logstoolInt#del(org.aspectj.lang.JoinPoint)
	 */
	@Override
	public Operationlogs del(JoinPoint pjp)
	{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		String targetClassName = pjp.getTarget().getClass().getName();
		Operationlogs a = new Operationlogs();

		a.setUsers((Users) session.getAttribute("user"));
		a.setOperationKind("删除");
		a.setOperationIp(RealIp.Ip());
		a.setOperationTime(new Timestamp(System.currentTimeMillis()));
		a.setOperationObject(showName(targetClassName.substring(targetClassName.lastIndexOf('.') + 1)));
		a.setOpeartionValue((String) session.getAttribute("delname"));

		return a;
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.logstoolInt#ins(org.aspectj.lang.JoinPoint)
	 */
	@Override
	public Operationlogs ins(JoinPoint pjp)
	{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		String targetClassName = pjp.getTarget().getClass().getName();
		Operationlogs a = new Operationlogs();

		Users user =
				session.getAttribute("user") == null ? (Users) Sel.getHQL(Users.class, "f1867b825ac27448015ac6ee2cd00004")
						: (Users) session.getAttribute("user");
		//(Users) Sel.getHQL(Users.class, ().getUserId())
		a.setUsers(user);
		a.setOperationKind("录入");
		a.setOperationIp(RealIp.Ip());
		a.setOperationTime(new Timestamp(System.currentTimeMillis()));
		a.setOperationObject(showName(targetClassName.substring(targetClassName.lastIndexOf('.') + 1)));

		switch (targetClassName.substring(targetClassName.lastIndexOf('.') + 1))
		{
			case "DonatePersonTables":
				a.setOpeartionValue(((Donatepersontable) (pjp.getArgs()[0])).getName());
				return a;
			case "Illnesshelptables":
				a.setOpeartionValue(((Illnesshelptable) (pjp.getArgs()[0])).getName());
				return a;
			case "Onetoonetables":
				a.setOpeartionValue(((Onetoonetable) (pjp.getArgs()[0])).getName());
				return a;
			case "Singleyouthtables":
				a.setOpeartionValue(((Singleyouthtable) (pjp.getArgs()[0])).getName());
				return a;
			case "Universitytables":
				a.setOpeartionValue(((Universitytable) (pjp.getArgs()[0])).getName());
				return a;
			case "Wishtables":
				a.setOpeartionValue(((Wishtable) (pjp.getArgs()[0])).getName());
				return a;
			case "Youthlawhelptables":
				a.setOpeartionValue(((Youthlawhelptable) (pjp.getArgs()[0])).getName());
				return a;
			case "Youthmentalitytables":
				a.setOpeartionValue(((Youthmentalitytable) (pjp.getArgs()[0])).getName());
				return a;
			case "Youthworktables":
				a.setOpeartionValue(((Youthworktable) (pjp.getArgs()[0])).getName());
				return a;
			default:
				a.setOpeartionValue(null);
				return a;
		}
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.logstoolInt#upd(org.aspectj.lang.JoinPoint)
	 */
	@Override
	public Operationlogs upd(JoinPoint pjp)
	{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		String targetClassName = pjp.getTarget().getClass().getName();
		Operationlogs a = new Operationlogs();

		a.setUsers((Users) session.getAttribute("user"));
		a.setOperationKind("修改");
		a.setOperationIp(RealIp.Ip());
		a.setOperationTime(new Timestamp(System.currentTimeMillis()));
		a.setOperationObject(showName(targetClassName.substring(targetClassName.lastIndexOf('.') + 1)));

		switch (targetClassName.substring(targetClassName.lastIndexOf('.') + 1))
		{
			case "DonatePersonTables":
				a.setOpeartionValue(((Donatepersontable) (pjp.getArgs()[0])).getName());
				return a;
			case "Illnesshelptables":
				a.setOpeartionValue(((Illnesshelptable) (pjp.getArgs()[0])).getName());
				return a;
			case "Onetoonetables":
				a.setOpeartionValue(((Onetoonetable) (pjp.getArgs()[0])).getName());
				return a;
			case "Singleyouthtables":
				a.setOpeartionValue(((Singleyouthtable) (pjp.getArgs()[0])).getName());
				return a;
			case "Universitytables":
				a.setOpeartionValue(((Universitytable) (pjp.getArgs()[0])).getName());
				return a;
			case "Wishtables":
				a.setOpeartionValue(((Wishtable) (pjp.getArgs()[0])).getName());
				return a;
			case "Youthlawhelptables":
				a.setOpeartionValue(((Youthlawhelptable) (pjp.getArgs()[0])).getName());
				return a;
			case "Youthmentalitytables":
				a.setOpeartionValue(((Youthmentalitytable) (pjp.getArgs()[0])).getName());
				return a;
			case "Youthworktables":
				a.setOpeartionValue(((Youthworktable) (pjp.getArgs()[0])).getName());
				return a;
			default:
				a.setOpeartionValue(null);
				return a;
		}
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.logstoolInt#upload(org.aspectj.lang.JoinPoint)
	 */
	@Override
	public Operationlogs upload(JoinPoint pjp)
	{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		String targetClassName = pjp.getTarget().getClass().getName();
		Operationlogs a = new Operationlogs();

		a.setUsers((Users) session.getAttribute("user"));
		switch ((String) pjp.getArgs()[1])
		{
			case "0":
				a.setOperationKind("录入");
				break;
			case "1":
				a.setOperationKind("上报");
				break;
			case "2":
				a.setOperationKind("审核");
				break;
			case "3":
				a.setOperationKind("驳回");
				break;
			case "4":
				a.setOperationKind("显示");
				break;
		}
		a.setOperationIp(RealIp.Ip());
		a.setOperationTime(new Timestamp(System.currentTimeMillis()));
		a.setOperationObject(showName(targetClassName.substring(targetClassName.lastIndexOf('.') + 1)));

		switch (targetClassName.substring(targetClassName.lastIndexOf('.') + 1))
		{
			case "DonatePersonTables":
				a.setOpeartionValue(((Donatepersontable) Sel.getHQL(Donatepersontable.class, (String) pjp.getArgs()[0])).getName());
				return a;
			case "Illnesshelptables":
				a.setOpeartionValue(((Illnesshelptable) Sel.getHQL(Illnesshelptable.class, (String) pjp.getArgs()[0])).getName());
				return a;
			case "Onetoonetables":
				a.setOpeartionValue(((Onetoonetable) Sel.getHQL(Onetoonetable.class, (String) pjp.getArgs()[0])).getName());
				return a;
			case "Singleyouthtables":
				a.setOpeartionValue(((Singleyouthtable) Sel.getHQL(Singleyouthtable.class, (String) pjp.getArgs()[0])).getName());
				return a;
			case "Universitytables":
				a.setOpeartionValue(((Universitytable) Sel.getHQL(Universitytable.class, (String) pjp.getArgs()[0])).getName());
				return a;
			case "Wishtables":
				a.setOpeartionValue(((Wishtable) Sel.getHQL(Wishtable.class, (String) pjp.getArgs()[0])).getName());
				return a;
			case "Youthlawhelptables":
				a.setOpeartionValue(((Youthlawhelptable) Sel.getHQL(Youthlawhelptable.class, (String) pjp.getArgs()[0])).getName());
				return a;
			case "Youthmentalitytables":
				a.setOpeartionValue(((Youthmentalitytable) Sel.getHQL(Youthmentalitytable.class, (String) pjp.getArgs()[0])).getName());
				return a;
			case "Youthworktables":
				a.setOpeartionValue(((Youthworktable) Sel.getHQL(Youthworktable.class, (String) pjp.getArgs()[0])).getName());
				return a;
			default:
				a.setOpeartionValue(null);
				return a;
		}
	}

	@Override
	public Operationlogs deluser(JoinPoint pjp)
	{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		String targetClassName = pjp.getTarget().getClass().getName();
		Operationlogs a = new Operationlogs();

		a.setUsers((Users) session.getAttribute("user"));
		a.setOperationKind("删除");
		a.setOperationIp(RealIp.Ip());
		a.setOperationTime(new Timestamp(System.currentTimeMillis()));
		a.setOperationObject("用户");
		a.setOpeartionValue((String) session.getAttribute("delname"));

		return a;

	}

	@Override
	public Operationlogs SavePrivilege(JoinPoint pjp)
	{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		String targetClassName = pjp.getTarget().getClass().getName();
		Operationlogs a = new Operationlogs();

		a.setUsers((Users) session.getAttribute("user"));
		a.setOperationKind("删除");
		a.setOperationIp(RealIp.Ip());
		a.setOperationTime(new Timestamp(System.currentTimeMillis()));
		a.setOperationObject("用户");
		a.setOpeartionValue(((Users) Sel.getHQL(Users.class, (String) pjp.getArgs()[1])).getUsername());

		return a;
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.logstoolInt#GoTo(org.aspectj.lang.JoinPoint)
	 */
	@Override
	public Operationlogs GoTo(JoinPoint pjp)
	{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		String targetClassName = pjp.getTarget().getClass().getName();
		Operationlogs a = new Operationlogs();

		a.setUsers((Users) session.getAttribute("user"));
		a.setOperationKind("跳转");

		a.setOperationIp(RealIp.Ip());
		a.setOperationTime(new Timestamp(System.currentTimeMillis()));
		a.setOperationObject(showName(targetClassName.substring(targetClassName.lastIndexOf('.') + 1)));

		return a;

	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.logstoolInt#login(org.aspectj.lang.JoinPoint)
	 */
	@Override
	public Operationlogs login(JoinPoint pjp)
	{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		String targetClassName = pjp.getTarget().getClass().getName();
		Operationlogs a = new Operationlogs();

		a.setUsers((Users) session.getAttribute("user"));
		a.setOperationKind("登陆");

		a.setOperationIp(RealIp.Ip());
		a.setOperationTime(new Timestamp(System.currentTimeMillis()));
		a.setOperationObject(showName(targetClassName.substring(targetClassName.lastIndexOf('.') + 1)));
		a.setOpeartionValue(((Users) session.getAttribute("user")).getUsername());
		return a;

	}

	@Resource(name = "sel")
	public void setSel(Select Sel)
	{
		this.Sel = Sel;
	}

}
