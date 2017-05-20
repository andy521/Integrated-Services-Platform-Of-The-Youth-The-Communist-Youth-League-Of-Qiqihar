package com.naah.PO;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable
{

	// Fields    

	private String userId;
	private Areas areasByCounty;
	private Areas areasByCity;
	private String username;
	private String realname;
	private String password;
	private String tel;
	private String sex;
	private String unit;
	private String position;
	private Date birthday;
	private String email;
	private String roleId;
	private String note;
	private Set wishtablesForAuditUser = new HashSet(0);
	private Set onetoonetablesForAuditUser = new HashSet(0);
	private Set onetoonetablesForShowUser = new HashSet(0);
	private Set singleyouthtablesForAuditUser = new HashSet(0);
	private Set operationlogses = new HashSet(0);
	private Set illnesshelptablesForShowUser = new HashSet(0);
	private Set youthworktablesForAuditUser = new HashSet(0);
	private Set universitytablesForInputUser = new HashSet(0);
	private Set youthmentalitytablesForAuditUser = new HashSet(0);
	private Set donatepersontablesForAuditUser = new HashSet(0);
	private Set universitytablesForShowUser = new HashSet(0);
	private Set youthlawhelptablesForShowUser = new HashSet(0);
	private Set userprivilegeses = new HashSet(0);
	private Set youthmentalitytablesForShowUser = new HashSet(0);
	private Set youthmentalitytablesForInputUser = new HashSet(0);
	private Set wishtablesForShowUser = new HashSet(0);
	private Set youthlawhelptablesForAuditUser = new HashSet(0);
	private Set onetoonetablesForInputUser = new HashSet(0);
	private Set youthlawhelptablesForInputUser = new HashSet(0);
	private Set illnesshelptablesForInputUser = new HashSet(0);
	private Set youthworktablesForInputUser = new HashSet(0);
	private Set singleyouthtablesForShowUser = new HashSet(0);
	private Set singleyouthtablesForInputUser = new HashSet(0);
	private Set wishtablesForInputUser = new HashSet(0);
	private Set youthworktablesForShowUser = new HashSet(0);
	private Set illnesshelptablesForAuditUser = new HashSet(0);
	private Set universitytablesForAuditUser = new HashSet(0);
	private Set donatepersontablesForShowUser = new HashSet(0);
	private Set donatepersontablesForInputUser = new HashSet(0);

	// Constructors

	/** default constructor */
	public Users()
	{}

	/** minimal constructor */
	public Users(String username,String realname,String password,String tel,String sex,String unit,String position,Date birthday,String email,String roleId)
	{
		this.username = username;
		this.realname = realname;
		this.password = password;
		this.tel = tel;
		this.sex = sex;
		this.unit = unit;
		this.position = position;
		this.birthday = birthday;
		this.email = email;
		this.roleId = roleId;
	}

	/** full constructor */
	public Users(Areas areasByCounty,Areas areasByCity,String username,String realname,String password,String tel,String sex,String unit,String position,
			Date birthday,String email,String roleId,String note,Set wishtablesForAuditUser,Set onetoonetablesForAuditUser,Set onetoonetablesForShowUser,
			Set singleyouthtablesForAuditUser,Set operationlogses,Set illnesshelptablesForShowUser,Set youthworktablesForAuditUser,
			Set universitytablesForInputUser,Set youthmentalitytablesForAuditUser,Set donatepersontablesForAuditUser,Set universitytablesForShowUser,
			Set youthlawhelptablesForShowUser,Set userprivilegeses,Set youthmentalitytablesForShowUser,Set youthmentalitytablesForInputUser,
			Set wishtablesForShowUser,Set youthlawhelptablesForAuditUser,Set onetoonetablesForInputUser,Set youthlawhelptablesForInputUser,
			Set illnesshelptablesForInputUser,Set youthworktablesForInputUser,Set singleyouthtablesForShowUser,Set singleyouthtablesForInputUser,
			Set wishtablesForInputUser,Set youthworktablesForShowUser,Set illnesshelptablesForAuditUser,Set universitytablesForAuditUser,
			Set donatepersontablesForShowUser,Set donatepersontablesForInputUser)
	{
		this.areasByCounty = areasByCounty;
		this.areasByCity = areasByCity;
		this.username = username;
		this.realname = realname;
		this.password = password;
		this.tel = tel;
		this.sex = sex;
		this.unit = unit;
		this.position = position;
		this.birthday = birthday;
		this.email = email;
		this.roleId = roleId;
		this.note = note;
		this.wishtablesForAuditUser = wishtablesForAuditUser;
		this.onetoonetablesForAuditUser = onetoonetablesForAuditUser;
		this.onetoonetablesForShowUser = onetoonetablesForShowUser;
		this.singleyouthtablesForAuditUser = singleyouthtablesForAuditUser;
		this.operationlogses = operationlogses;
		this.illnesshelptablesForShowUser = illnesshelptablesForShowUser;
		this.youthworktablesForAuditUser = youthworktablesForAuditUser;
		this.universitytablesForInputUser = universitytablesForInputUser;
		this.youthmentalitytablesForAuditUser = youthmentalitytablesForAuditUser;
		this.donatepersontablesForAuditUser = donatepersontablesForAuditUser;
		this.universitytablesForShowUser = universitytablesForShowUser;
		this.youthlawhelptablesForShowUser = youthlawhelptablesForShowUser;
		this.userprivilegeses = userprivilegeses;
		this.youthmentalitytablesForShowUser = youthmentalitytablesForShowUser;
		this.youthmentalitytablesForInputUser = youthmentalitytablesForInputUser;
		this.wishtablesForShowUser = wishtablesForShowUser;
		this.youthlawhelptablesForAuditUser = youthlawhelptablesForAuditUser;
		this.onetoonetablesForInputUser = onetoonetablesForInputUser;
		this.youthlawhelptablesForInputUser = youthlawhelptablesForInputUser;
		this.illnesshelptablesForInputUser = illnesshelptablesForInputUser;
		this.youthworktablesForInputUser = youthworktablesForInputUser;
		this.singleyouthtablesForShowUser = singleyouthtablesForShowUser;
		this.singleyouthtablesForInputUser = singleyouthtablesForInputUser;
		this.wishtablesForInputUser = wishtablesForInputUser;
		this.youthworktablesForShowUser = youthworktablesForShowUser;
		this.illnesshelptablesForAuditUser = illnesshelptablesForAuditUser;
		this.universitytablesForAuditUser = universitytablesForAuditUser;
		this.donatepersontablesForShowUser = donatepersontablesForShowUser;
		this.donatepersontablesForInputUser = donatepersontablesForInputUser;
	}

	// Property accessors

	public String getUserId()
	{
		return this.userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	public Areas getAreasByCounty()
	{
		return this.areasByCounty;
	}

	public void setAreasByCounty(Areas areasByCounty)
	{
		this.areasByCounty = areasByCounty;
	}

	public Areas getAreasByCity()
	{
		return this.areasByCity;
	}

	public void setAreasByCity(Areas areasByCity)
	{
		this.areasByCity = areasByCity;
	}

	public String getUsername()
	{
		return this.username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getRealname()
	{
		return this.realname;
	}

	public void setRealname(String realname)
	{
		this.realname = realname;
	}

	public String getPassword()
	{
		return this.password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getTel()
	{
		return this.tel;
	}

	public void setTel(String tel)
	{
		this.tel = tel;
	}

	public String getSex()
	{
		return this.sex;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}

	public String getUnit()
	{
		return this.unit;
	}

	public void setUnit(String unit)
	{
		this.unit = unit;
	}

	public String getPosition()
	{
		return this.position;
	}

	public void setPosition(String position)
	{
		this.position = position;
	}

	public Date getBirthday()
	{
		return this.birthday;
	}

	public void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	}

	public String getEmail()
	{
		return this.email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getRoleId()
	{
		return this.roleId;
	}

	public void setRoleId(String roleId)
	{
		this.roleId = roleId;
	}

	public String getNote()
	{
		return this.note;
	}

	public void setNote(String note)
	{
		this.note = note;
	}

	public Set getWishtablesForAuditUser()
	{
		return this.wishtablesForAuditUser;
	}

	public void setWishtablesForAuditUser(Set wishtablesForAuditUser)
	{
		this.wishtablesForAuditUser = wishtablesForAuditUser;
	}

	public Set getOnetoonetablesForAuditUser()
	{
		return this.onetoonetablesForAuditUser;
	}

	public void setOnetoonetablesForAuditUser(Set onetoonetablesForAuditUser)
	{
		this.onetoonetablesForAuditUser = onetoonetablesForAuditUser;
	}

	public Set getOnetoonetablesForShowUser()
	{
		return this.onetoonetablesForShowUser;
	}

	public void setOnetoonetablesForShowUser(Set onetoonetablesForShowUser)
	{
		this.onetoonetablesForShowUser = onetoonetablesForShowUser;
	}

	public Set getSingleyouthtablesForAuditUser()
	{
		return this.singleyouthtablesForAuditUser;
	}

	public void setSingleyouthtablesForAuditUser(Set singleyouthtablesForAuditUser)
	{
		this.singleyouthtablesForAuditUser = singleyouthtablesForAuditUser;
	}

	public Set getOperationlogses()
	{
		return this.operationlogses;
	}

	public void setOperationlogses(Set operationlogses)
	{
		this.operationlogses = operationlogses;
	}

	public Set getIllnesshelptablesForShowUser()
	{
		return this.illnesshelptablesForShowUser;
	}

	public void setIllnesshelptablesForShowUser(Set illnesshelptablesForShowUser)
	{
		this.illnesshelptablesForShowUser = illnesshelptablesForShowUser;
	}

	public Set getYouthworktablesForAuditUser()
	{
		return this.youthworktablesForAuditUser;
	}

	public void setYouthworktablesForAuditUser(Set youthworktablesForAuditUser)
	{
		this.youthworktablesForAuditUser = youthworktablesForAuditUser;
	}

	public Set getUniversitytablesForInputUser()
	{
		return this.universitytablesForInputUser;
	}

	public void setUniversitytablesForInputUser(Set universitytablesForInputUser)
	{
		this.universitytablesForInputUser = universitytablesForInputUser;
	}

	public Set getYouthmentalitytablesForAuditUser()
	{
		return this.youthmentalitytablesForAuditUser;
	}

	public void setYouthmentalitytablesForAuditUser(Set youthmentalitytablesForAuditUser)
	{
		this.youthmentalitytablesForAuditUser = youthmentalitytablesForAuditUser;
	}

	public Set getDonatepersontablesForAuditUser()
	{
		return this.donatepersontablesForAuditUser;
	}

	public void setDonatepersontablesForAuditUser(Set donatepersontablesForAuditUser)
	{
		this.donatepersontablesForAuditUser = donatepersontablesForAuditUser;
	}

	public Set getUniversitytablesForShowUser()
	{
		return this.universitytablesForShowUser;
	}

	public void setUniversitytablesForShowUser(Set universitytablesForShowUser)
	{
		this.universitytablesForShowUser = universitytablesForShowUser;
	}

	public Set getYouthlawhelptablesForShowUser()
	{
		return this.youthlawhelptablesForShowUser;
	}

	public void setYouthlawhelptablesForShowUser(Set youthlawhelptablesForShowUser)
	{
		this.youthlawhelptablesForShowUser = youthlawhelptablesForShowUser;
	}

	public Set getUserprivilegeses()
	{
		return this.userprivilegeses;
	}

	public void setUserprivilegeses(Set userprivilegeses)
	{
		this.userprivilegeses = userprivilegeses;
	}

	public Set getYouthmentalitytablesForShowUser()
	{
		return this.youthmentalitytablesForShowUser;
	}

	public void setYouthmentalitytablesForShowUser(Set youthmentalitytablesForShowUser)
	{
		this.youthmentalitytablesForShowUser = youthmentalitytablesForShowUser;
	}

	public Set getYouthmentalitytablesForInputUser()
	{
		return this.youthmentalitytablesForInputUser;
	}

	public void setYouthmentalitytablesForInputUser(Set youthmentalitytablesForInputUser)
	{
		this.youthmentalitytablesForInputUser = youthmentalitytablesForInputUser;
	}

	public Set getWishtablesForShowUser()
	{
		return this.wishtablesForShowUser;
	}

	public void setWishtablesForShowUser(Set wishtablesForShowUser)
	{
		this.wishtablesForShowUser = wishtablesForShowUser;
	}

	public Set getYouthlawhelptablesForAuditUser()
	{
		return this.youthlawhelptablesForAuditUser;
	}

	public void setYouthlawhelptablesForAuditUser(Set youthlawhelptablesForAuditUser)
	{
		this.youthlawhelptablesForAuditUser = youthlawhelptablesForAuditUser;
	}

	public Set getOnetoonetablesForInputUser()
	{
		return this.onetoonetablesForInputUser;
	}

	public void setOnetoonetablesForInputUser(Set onetoonetablesForInputUser)
	{
		this.onetoonetablesForInputUser = onetoonetablesForInputUser;
	}

	public Set getYouthlawhelptablesForInputUser()
	{
		return this.youthlawhelptablesForInputUser;
	}

	public void setYouthlawhelptablesForInputUser(Set youthlawhelptablesForInputUser)
	{
		this.youthlawhelptablesForInputUser = youthlawhelptablesForInputUser;
	}

	public Set getIllnesshelptablesForInputUser()
	{
		return this.illnesshelptablesForInputUser;
	}

	public void setIllnesshelptablesForInputUser(Set illnesshelptablesForInputUser)
	{
		this.illnesshelptablesForInputUser = illnesshelptablesForInputUser;
	}

	public Set getYouthworktablesForInputUser()
	{
		return this.youthworktablesForInputUser;
	}

	public void setYouthworktablesForInputUser(Set youthworktablesForInputUser)
	{
		this.youthworktablesForInputUser = youthworktablesForInputUser;
	}

	public Set getSingleyouthtablesForShowUser()
	{
		return this.singleyouthtablesForShowUser;
	}

	public void setSingleyouthtablesForShowUser(Set singleyouthtablesForShowUser)
	{
		this.singleyouthtablesForShowUser = singleyouthtablesForShowUser;
	}

	public Set getSingleyouthtablesForInputUser()
	{
		return this.singleyouthtablesForInputUser;
	}

	public void setSingleyouthtablesForInputUser(Set singleyouthtablesForInputUser)
	{
		this.singleyouthtablesForInputUser = singleyouthtablesForInputUser;
	}

	public Set getWishtablesForInputUser()
	{
		return this.wishtablesForInputUser;
	}

	public void setWishtablesForInputUser(Set wishtablesForInputUser)
	{
		this.wishtablesForInputUser = wishtablesForInputUser;
	}

	public Set getYouthworktablesForShowUser()
	{
		return this.youthworktablesForShowUser;
	}

	public void setYouthworktablesForShowUser(Set youthworktablesForShowUser)
	{
		this.youthworktablesForShowUser = youthworktablesForShowUser;
	}

	public Set getIllnesshelptablesForAuditUser()
	{
		return this.illnesshelptablesForAuditUser;
	}

	public void setIllnesshelptablesForAuditUser(Set illnesshelptablesForAuditUser)
	{
		this.illnesshelptablesForAuditUser = illnesshelptablesForAuditUser;
	}

	public Set getUniversitytablesForAuditUser()
	{
		return this.universitytablesForAuditUser;
	}

	public void setUniversitytablesForAuditUser(Set universitytablesForAuditUser)
	{
		this.universitytablesForAuditUser = universitytablesForAuditUser;
	}

	public Set getDonatepersontablesForShowUser()
	{
		return this.donatepersontablesForShowUser;
	}

	public void setDonatepersontablesForShowUser(Set donatepersontablesForShowUser)
	{
		this.donatepersontablesForShowUser = donatepersontablesForShowUser;
	}

	public Set getDonatepersontablesForInputUser()
	{
		return this.donatepersontablesForInputUser;
	}

	public void setDonatepersontablesForInputUser(Set donatepersontablesForInputUser)
	{
		this.donatepersontablesForInputUser = donatepersontablesForInputUser;
	}

}