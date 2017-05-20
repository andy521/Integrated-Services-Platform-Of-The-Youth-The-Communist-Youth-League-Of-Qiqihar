package com.naah.PO;

import java.util.Date;

/**
 * Youthmentalitytable entity. @author MyEclipse Persistence Tools
 */

public class Youthmentalitytable implements java.io.Serializable
{

	// Fields    

	private String id;
	private Areas areasByCountyId;
	private Users usersByInputUser;
	private Areas areasByAreaId;
	private Users usersByShowUser;
	private Users usersByAuditUser;
	private String name;
	private String nation;
	private String sex;
	private String age;
	private String school;
	private String education;
	private String mandator;
	private String tel;
	private String askDirection;
	private String note;
	private String flag;
	private String reason;
	private Date uploadDate;

	// Constructors

	/** default constructor */
	public Youthmentalitytable()
	{}

	/** minimal constructor */
	public Youthmentalitytable(Users usersByInputUser,String name,String nation,String sex,String age,String school,String education,String mandator,
			String tel,String askDirection,String note,String flag,Date uploadDate)
	{
		this.usersByInputUser = usersByInputUser;
		this.name = name;
		this.nation = nation;
		this.sex = sex;
		this.age = age;
		this.school = school;
		this.education = education;
		this.mandator = mandator;
		this.tel = tel;
		this.askDirection = askDirection;
		this.note = note;
		this.flag = flag;
		this.uploadDate = uploadDate;
	}

	/** full constructor */
	public Youthmentalitytable(Areas areasByCountyId,Users usersByInputUser,Areas areasByAreaId,Users usersByShowUser,Users usersByAuditUser,String name,
			String nation,String sex,String age,String school,String education,String mandator,String tel,String askDirection,String note,String flag,
			String reason,Date uploadDate)
	{
		this.areasByCountyId = areasByCountyId;
		this.usersByInputUser = usersByInputUser;
		this.areasByAreaId = areasByAreaId;
		this.usersByShowUser = usersByShowUser;
		this.usersByAuditUser = usersByAuditUser;
		this.name = name;
		this.nation = nation;
		this.sex = sex;
		this.age = age;
		this.school = school;
		this.education = education;
		this.mandator = mandator;
		this.tel = tel;
		this.askDirection = askDirection;
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

	public String getNation()
	{
		return this.nation;
	}

	public void setNation(String nation)
	{
		this.nation = nation;
	}

	public String getSex()
	{
		return this.sex;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}

	public String getAge()
	{
		return this.age;
	}

	public void setAge(String age)
	{
		this.age = age;
	}

	public String getSchool()
	{
		return this.school;
	}

	public void setSchool(String school)
	{
		this.school = school;
	}

	public String getEducation()
	{
		return this.education;
	}

	public void setEducation(String education)
	{
		this.education = education;
	}

	public String getMandator()
	{
		return this.mandator;
	}

	public void setMandator(String mandator)
	{
		this.mandator = mandator;
	}

	public String getTel()
	{
		return this.tel;
	}

	public void setTel(String tel)
	{
		this.tel = tel;
	}

	public String getAskDirection()
	{
		return this.askDirection;
	}

	public void setAskDirection(String askDirection)
	{
		this.askDirection = askDirection;
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