package com.naah.PO;

import java.util.Date;

/**
 * Singleyouthtable entity. @author MyEclipse Persistence Tools
 */

public class Singleyouthtable implements java.io.Serializable
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
	private Date birthday;
	private String education;
	private String company;
	private String address;
	private String tel;
	private String qq;
	private String wechat;
	private String chooseSexStandard;
	private String marryStatus;
	private String personIntroduce;
	private String flag;
	private String reason;
	private Date uploadDate;

	// Constructors

	/** default constructor */
	public Singleyouthtable()
	{}

	/** minimal constructor */
	public Singleyouthtable(Users usersByInputUser,String name,String sex,String age,String nation,Date birthday,String education,String company,
			String address,String tel,String chooseSexStandard,String marryStatus,String flag,Date uploadDate)
	{
		this.usersByInputUser = usersByInputUser;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.nation = nation;
		this.birthday = birthday;
		this.education = education;
		this.company = company;
		this.address = address;
		this.tel = tel;
		this.chooseSexStandard = chooseSexStandard;
		this.marryStatus = marryStatus;
		this.flag = flag;
		this.uploadDate = uploadDate;
	}

	/** full constructor */
	public Singleyouthtable(Areas areasByCountyId,Users usersByInputUser,Areas areasByAreaId,Users usersByShowUser,Users usersByAuditUser,String name,
			String sex,String age,String nation,Date birthday,String education,String company,String address,String tel,String qq,String wechat,
			String chooseSexStandard,String marryStatus,String personIntroduce,String flag,String reason,Date uploadDate)
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
		this.birthday = birthday;
		this.education = education;
		this.company = company;
		this.address = address;
		this.tel = tel;
		this.qq = qq;
		this.wechat = wechat;
		this.chooseSexStandard = chooseSexStandard;
		this.marryStatus = marryStatus;
		this.personIntroduce = personIntroduce;
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

	public Date getBirthday()
	{
		return this.birthday;
	}

	public void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	}

	public String getEducation()
	{
		return this.education;
	}

	public void setEducation(String education)
	{
		this.education = education;
	}

	public String getCompany()
	{
		return this.company;
	}

	public void setCompany(String company)
	{
		this.company = company;
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

	public String getWechat()
	{
		return this.wechat;
	}

	public void setWechat(String wechat)
	{
		this.wechat = wechat;
	}

	public String getChooseSexStandard()
	{
		return this.chooseSexStandard;
	}

	public void setChooseSexStandard(String chooseSexStandard)
	{
		this.chooseSexStandard = chooseSexStandard;
	}

	public String getMarryStatus()
	{
		return this.marryStatus;
	}

	public void setMarryStatus(String marryStatus)
	{
		this.marryStatus = marryStatus;
	}

	public String getPersonIntroduce()
	{
		return this.personIntroduce;
	}

	public void setPersonIntroduce(String personIntroduce)
	{
		this.personIntroduce = personIntroduce;
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