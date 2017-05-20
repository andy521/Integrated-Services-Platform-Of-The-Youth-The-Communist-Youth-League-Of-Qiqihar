package com.naah.services.implement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.naah.DAO.implement.Select;
import com.naah.PO.Users;
import com.naah.services.interfaces.Login;
import com.naah.tools.MD5;

@Service
@Transactional
public class LoginImp implements Login
{

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Login#Login(com.naah.PO.Users)
	 */
	private Select Sel;

	@Override
	public Map Login(HttpSession session,Users user,String pic)
	{
		Map re = new HashMap();
		//获取application
		WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();

		ServletContext application = webApplicationContext.getServletContext();
		//Set userlist;
		//boolean userflag = false;
		//判断是否已经有userlist，没有建立
		/*if (application.getAttribute("userlist") != null)
		{
			userlist = (Set) application.getAttribute("userlist");
		}
		else
		{
			userlist = new HashSet();
		}*/
		//检查验证码

		String checkCode = (String) session.getAttribute("imageCode");
		if (checkCode != null)
		{

			if (pic.equals(checkCode))
			{

				String sql = "from Users a where a.username=:username and a.password=:password";
				user.setPassword(MD5.MD5_32(user.getPassword()));
				String[][] values = { { "username", user.getUsername() }, { "password", user.getPassword() } };

				List ifnull = Sel.HSQL(sql, 1, values, 10);
				//用户名和密码是否正确
				if (ifnull != null && ifnull.size() > 0)
				{
					Users s = (Users) ifnull.get(0);

					//admin重复验证start
					if (s.getUsername().equals("admin"))
					{
						/*if (userlist.size() > 0)
						{
							for (Object object : userlist)
							{
								userflag = true;
								if (object.equals(s.getUserId()))
								{
									userflag = false;

									break;
								}

							}
						}
						else
						{
						userflag = true;
						}*/

						session.setAttribute("user", s);
						//userlist.add(s.getUserId());
						//application.setAttribute("userlist", userlist);
						//查询用户权限
						String leftsql = "from Userprivileges where users.userId='" + s.getUserId() + "' order by privileges.privilegeId asc";

						List privilege = Sel.HSQL(leftsql, 1, 50);
						session.setAttribute("privilege", privilege);
						re.put("return", "messSystem");

						return re;
						/*if (userflag)
						{


							//admin重复验证end
						}
						else
						{
							re.put("message", "用户已登陆!请勿重复登陆！");
							return re;
						}*/
					}
					Date date = new java.util.Date();//创建时间对象
					SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置格式
					String str = sdf.format(date);//转换为格式
					//验证时间
					int hours = date.getHours();
					int minutes = date.getMinutes();
					if ((hours >= 8 && minutes >= 0) && hours <= 17)
					{
						if (hours == 17 && minutes >= 30)
						{
							re.put("message", "请在8:00-17:30之间登录!");
							return re;
						}
						else
						{
							session.setAttribute("user", s);
							//userlist.add(s.getUserId());
							//application.setAttribute("userlist", userlist);
							//查询用户权限
							String leftsql = "from Userprivileges where users.userId='" + s.getUserId() + "'";
							List privilege = Sel.HSQL(leftsql, 1, 50);
							session.setAttribute("privilege", privilege);
							re.put("return", "messSystem");
							return re;
							/*//用户重复验证start
							if (userlist.size() > 0)
							{
								for (Object object : userlist)
								{
									userflag = true;
									if (object.equals(s.getUserId()))
									{
										userflag = false;

										break;
									}

								}
							}
							else
							{
								userflag = true;
							}

							if (userflag)
							{

								
							}
							else
							{
								re.put("message", "用户已登陆!请勿重复登陆！");
								return re;
							}
							//admin重复验证end
							*/
						}
					}
					else
					{

						re.put("message", "请在8:00-17:30之间登录!");
						return re;
					}
				}
				else
				{
					re.put("message", "用户名或密码错误！请重新输入!");
					return re;
				}
			}
			else
			{

				re.put("message", "验证码错误！请重新输入!");
				return re;
			}

		}
		else
		{
			re.put("message", "登录时间过长！验证码失效！请重新输入！");
			return re;
		}

	}

	@Resource(name = "sel")
	public void setSel(Select Sel)
	{
		this.Sel = Sel;
	}

}
