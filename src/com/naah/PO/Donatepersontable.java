package com.naah.PO;

import java.util.Date;

/**
 * Donatepersontable entity. @author MyEclipse Persistence Tools
 */

public class Donatepersontable implements java.io.Serializable
{

	// Fields    

	private String id;
	private Areas areasByCountyId;
	private Users usersByInputUser;
	private Areas areasByCityId;
	private Users usersByShowUser;
	private Users usersByAuditUser;
	private String name;
	private String sex;
	private String age;
	private String nation;
	private String donateObject;
	private Double donateMoney;
	private String tel;
	private String qq;
	private String claim;
	private String wishes;
	private String flag;
	private String reason;
	private Date uploadDate;

	// Constructors

	/** default constructor */
	public Donatepersontable()
	{}

	/** minimal constructor */
	public Donatepersontable(Users usersByInputUser,String name,String sex,String age,String nation,String donateObject,Double donateMoney,String tel,
			String claim,String wishes,String flag,Date uploadDate)
	{
		this.usersByInputUser = usersByInputUser;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.nation = nation;
		this.donateObject = donateObject;
		this.donateMoney = donateMoney;
		this.tel = tel;
		this.claim = claim;
		this.wishes = wishes;
		this.flag = flag;
		this.uploadDate = uploadDate;
	}

	/** full constructor */
	public Donatepersontable(Areas areasByCountyId,Users usersByInputUser,Areas areasByCityId,Users usersByShowUser,Users usersByAuditUser,String name,
			String sex,String age,String nation,String donateObject,Double donateMoney,String tel,String qq,String claim,String wishes,String flag,
			String reason,Date uploadDate)
	{
		this.areasByCountyId = areasByCountyId;
		this.usersByInputUser = usersByInputUser;
		this.areasByCityId = areasByCityId;
		this.usersByShowUser = usersByShowUser;
		this.usersByAuditUser = usersByAuditUser;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.nation = nation;
		this.donateObject = donateObject;
		this.donateMoney = donateMoney;
		this.tel = tel;
		this.qq = qq;
		this.claim = claim;
		this.wishes = wishes;
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

	public Areas getAreasByCityId()
	{
		return this.areasByCityId;
	}

	public void setAreasByCityId(Areas areasByCityId)
	{
		this.areasByCityId = areasByCityId;
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

	public String getDonateObject()
	{
		return this.donateObject;
	}

	public void setDonateObject(String donateObject)
	{
		this.donateObject = donateObject;
	}

	public Double getDonateMoney()
	{
		return this.donateMoney;
	}

	public void setDonateMoney(Double donateMoney)
	{
		this.donateMoney = donateMoney;
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

	public String getClaim()
	{
		return this.claim;
	}

	public void setClaim(String claim)
	{
		this.claim = claim;
	}

	public String getWishes()
	{
		return this.wishes;
	}

	public void setWishes(String wishes)
	{
		this.wishes = wishes;
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