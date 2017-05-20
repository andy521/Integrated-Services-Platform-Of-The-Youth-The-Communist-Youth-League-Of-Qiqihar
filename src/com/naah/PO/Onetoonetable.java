package com.naah.PO;

import java.util.Date;

/**
 * Onetoonetable entity. @author MyEclipse Persistence Tools
 */

public class Onetoonetable implements java.io.Serializable
{

	// Fields    

	private String id;
	private Areas areasByCountyId;
	private Users usersByInputUser;
	private Areas areasByAreaId;
	private Users usersByShowUser;
	private Users usersByAuditUser;
	private String name;
	private String sex;
	private String age;
	private String nation;
	private String school;
	private String class_;
	private String community;
	private String address;
	private String tel;
	private String qq;
	private String familyStatus;
	private String schoolStatus;
	private String flag;
	private String reason;
	private Date uploadDate;

	// Constructors

	/** default constructor */
	public Onetoonetable()
	{}

	/** minimal constructor */
	public Onetoonetable(Users usersByInputUser,String name,String sex,String age,String nation,String school,String class_,String community,String address,
			String tel,String familyStatus,String schoolStatus,String flag,Date uploadDate)
	{
		this.usersByInputUser = usersByInputUser;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.nation = nation;
		this.school = school;
		this.class_ = class_;
		this.community = community;
		this.address = address;
		this.tel = tel;
		this.familyStatus = familyStatus;
		this.schoolStatus = schoolStatus;
		this.flag = flag;
		this.uploadDate = uploadDate;
	}

	/** full constructor */
	public Onetoonetable(Areas areasByCountyId,Users usersByInputUser,Areas areasByAreaId,Users usersByShowUser,Users usersByAuditUser,String name,String sex,
			String age,String nation,String school,String class_,String community,String address,String tel,String qq,String familyStatus,String schoolStatus,
			String flag,String reason,Date uploadDate)
	{
		this.areasByCountyId = areasByCountyId;
		this.usersByInputUser = usersByInputUser;
		this.areasByAreaId = areasByAreaId;
		this.usersByShowUser = usersByShowUser;
		this.usersByAuditUser = usersByAuditUser;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.nation = nation;
		this.school = school;
		this.class_ = class_;
		this.community = community;
		this.address = address;
		this.tel = tel;
		this.qq = qq;
		this.familyStatus = familyStatus;
		this.schoolStatus = schoolStatus;
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

	public String getNation()
	{
		return this.nation;
	}

	public void setNation(String nation)
	{
		this.nation = nation;
	}

	public String getSchool()
	{
		return this.school;
	}

	public void setSchool(String school)
	{
		this.school = school;
	}

	public String getClass_()
	{
		return this.class_;
	}

	public void setClass_(String class_)
	{
		this.class_ = class_;
	}

	public String getCommunity()
	{
		return this.community;
	}

	public void setCommunity(String community)
	{
		this.community = community;
	}

	public String getAddress()
	{
		return this.address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getTel()
	{
		return this.tel;
	}

	public void setTel(String tel)
	{
		this.tel = tel;
	}

	public String getQq()
	{
		return this.qq;
	}

	public void setQq(String qq)
	{
		this.qq = qq;
	}

	public String getFamilyStatus()
	{
		return this.familyStatus;
	}

	public void setFamilyStatus(String familyStatus)
	{
		this.familyStatus = familyStatus;
	}

	public String getSchoolStatus()
	{
		return this.schoolStatus;
	}

	public void setSchoolStatus(String schoolStatus)
	{
		this.schoolStatus = schoolStatus;
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