package com.naah.PO;

import java.util.Date;

/**
 * Youthlawhelptable entity. @author MyEclipse Persistence Tools
 */

public class Youthlawhelptable implements java.io.Serializable
{

	// Fields    

	private String id;
	private Areas areasByCountyId;
	private Users usersByInputUser;
	private Areas areasByAreaId;
	private Users usersByShowUser;
	private Users usersByAuditUser;
	private String name;
	private String age;
	private String sex;
	private String school;
	private String lawReason;
	private String tel;
	private String note;
	private String flag;
	private String reason;
	private Date uploadDate;

	// Constructors

	/** default constructor */
	public Youthlawhelptable()
	{}

	/** minimal constructor */
	public Youthlawhelptable(Users usersByInputUser,String name,String age,String sex,String school,String lawReason,String tel,String flag,Date uploadDate)
	{
		this.usersByInputUser = usersByInputUser;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.school = school;
		this.lawReason = lawReason;
		this.tel = tel;
		this.flag = flag;
		this.uploadDate = uploadDate;
	}

	/** full constructor */
	public Youthlawhelptable(Areas areasByCountyId,Users usersByInputUser,Areas areasByAreaId,Users usersByShowUser,Users usersByAuditUser,String name,
			String age,String sex,String school,String lawReason,String tel,String note,String flag,String reason,Date uploadDate)
	{
		this.areasByCountyId = areasByCountyId;
		this.usersByInputUser = usersByInputUser;
		this.areasByAreaId = areasByAreaId;
		this.usersByShowUser = usersByShowUser;
		this.usersByAuditUser = usersByAuditUser;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.school = school;
		this.lawReason = lawReason;
		this.tel = tel;
		this.note = note;
		this.flag = flag;
		this.reason = reason;
		this.uploadDate = uploadDate;
	}

	// Property accessors

	public String getId()
	{
		return this.id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public Areas getAreasByCountyId()
	{
		return this.areasByCountyId;
	}

	public void setAreasByCountyId(Areas areasByCountyId)
	{
		this.areasByCountyId = areasByCountyId;
	}

	public Users getUsersByInputUser()
	{
		return this.usersByInputUser;
	}

	public void setUsersByInputUser(Users usersByInputUser)
	{
		this.usersByInputUser = usersByInputUser;
	}

	public Areas getAreasByAreaId()
	{
		return this.areasByAreaId;
	}

	public void setAreasByAreaId(Areas areasByAreaId)
	{
		this.areasByAreaId = areasByAreaId;
	}

	public Users getUsersByShowUser()
	{
		return this.usersByShowUser;
	}

	public void setUsersByShowUser(Users usersByShowUser)
	{
		this.usersByShowUser = usersByShowUser;
	}

	public Users getUsersByAuditUser()
	{
		return this.usersByAuditUser;
	}

	public void setUsersByAuditUser(Users usersByAuditUser)
	{
		this.usersByAuditUser = usersByAuditUser;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAge()
	{
		return this.age;
	}

	public void setAge(String age)
	{
		this.age = age;
	}

	public String getSex()
	{
		return this.sex;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}

	public String getSchool()
	{
		return this.school;
	}

	public void setSchool(String school)
	{
		this.school = school;
	}

	public String getLawReason()
	{
		return this.lawReason;
	}

	public void setLawReason(String lawReason)
	{
		this.lawReason = lawReason;
	}

	public String getTel()
	{
		return this.tel;
	}

	public void setTel(String tel)
	{
		this.tel = tel;
	}

	public String getNote()
	{
		return this.note;
	}

	public void setNote(String note)
	{
		this.note = note;
	}

	public String getFlag()
	{
		return this.flag;
	}

	public void setFlag(String flag)
	{
		this.flag = flag;
	}

	public String getReason()
	{
		return this.reason;
	}

	public void setReason(String reason)
	{
		this.reason = reason;
	}

	public Date getUploadDate()
	{
		return this.uploadDate;
	}

	public void setUploadDate(Date uploadDate)
	{
		this.uploadDate = uploadDate;
	}

}