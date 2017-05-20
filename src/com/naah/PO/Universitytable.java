package com.naah.PO;

import java.util.Date;

/**
 * Universitytable entity. @author MyEclipse Persistence Tools
 */

public class Universitytable implements java.io.Serializable
{

	// Fields    

	private String id;
	private Areas areasByCountyId;
	private Users usersByInputUser;
	private Areas areasByAreaId;
	private Users usersByShowUser;
	private Users usersByAuditUser;
	private String name;
	private String nameSpell;
	private String sex;
	private String nation;
	private String hometown;
	private Date birthday;
	private String idCard;
	private String highSchool;
	private String subject;
	private String awardInHighSchool;
	private String ranking;
	private String examNumber;
	private Double examScore;
	private String university;
	private String college;
	private String major;
	private String tel;
	private String email;
	private String qq;
	private String fatherName;
	private String fatherTel;
	private String motherName;
	private String motherTel;
	private String address;
	private String zipCode;
	private String bankName;
	private String bankCustomer;
	private String bankNumber;
	private String note;
	private String flag;
	private String reason;
	private Date uploadDate;

	// Constructors

	/** default constructor */
	public Universitytable()
	{}

	/** minimal constructor */
	public Universitytable(Users usersByInputUser,String name,String nameSpell,String sex,String nation,String hometown,Date birthday,String idCard,
			String highSchool,String subject,String tel,String fatherName,String fatherTel,String motherName,String motherTel,String address,String zipCode,
			String note,String flag,Date uploadDate)
	{
		this.usersByInputUser = usersByInputUser;
		this.name = name;
		this.nameSpell = nameSpell;
		this.sex = sex;
		this.nation = nation;
		this.hometown = hometown;
		this.birthday = birthday;
		this.idCard = idCard;
		this.highSchool = highSchool;
		this.subject = subject;
		this.tel = tel;
		this.fatherName = fatherName;
		this.fatherTel = fatherTel;
		this.motherName = motherName;
		this.motherTel = motherTel;
		this.address = address;
		this.zipCode = zipCode;
		this.note = note;
		this.flag = flag;
		this.uploadDate = uploadDate;
	}

	/** full constructor */
	public Universitytable(Areas areasByCountyId,Users usersByInputUser,Areas areasByAreaId,Users usersByShowUser,Users usersByAuditUser,String name,
			String nameSpell,String sex,String nation,String hometown,Date birthday,String idCard,String highSchool,String subject,String awardInHighSchool,
			String ranking,String examNumber,Double examScore,String university,String college,String major,String tel,String email,String qq,
			String fatherName,String fatherTel,String motherName,String motherTel,String address,String zipCode,String bankName,String bankCustomer,
			String bankNumber,String note,String flag,String reason,Date uploadDate)
	{
		this.areasByCountyId = areasByCountyId;
		this.usersByInputUser = usersByInputUser;
		this.areasByAreaId = areasByAreaId;
		this.usersByShowUser = usersByShowUser;
		this.usersByAuditUser = usersByAuditUser;
		this.name = name;
		this.nameSpell = nameSpell;
		this.sex = sex;
		this.nation = nation;
		this.hometown = hometown;
		this.birthday = birthday;
		this.idCard = idCard;
		this.highSchool = highSchool;
		this.subject = subject;
		this.awardInHighSchool = awardInHighSchool;
		this.ranking = ranking;
		this.examNumber = examNumber;
		this.examScore = examScore;
		this.university = university;
		this.college = college;
		this.major = major;
		this.tel = tel;
		this.email = email;
		this.qq = qq;
		this.fatherName = fatherName;
		this.fatherTel = fatherTel;
		this.motherName = motherName;
		this.motherTel = motherTel;
		this.address = address;
		this.zipCode = zipCode;
		this.bankName = bankName;
		this.bankCustomer = bankCustomer;
		this.bankNumber = bankNumber;
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

	public String getNameSpell()
	{
		return this.nameSpell;
	}

	public void setNameSpell(String nameSpell)
	{
		this.nameSpell = nameSpell;
	}

	public String getSex()
	{
		return this.sex;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}

	public String getNation()
	{
		return this.nation;
	}

	public void setNation(String nation)
	{
		this.nation = nation;
	}

	public String getHometown()
	{
		return this.hometown;
	}

	public void setHometown(String hometown)
	{
		this.hometown = hometown;
	}

	public Date getBirthday()
	{
		return this.birthday;
	}

	public void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	}

	public String getIdCard()
	{
		return this.idCard;
	}

	public void setIdCard(String idCard)
	{
		this.idCard = idCard;
	}

	public String getHighSchool()
	{
		return this.highSchool;
	}

	public void setHighSchool(String highSchool)
	{
		this.highSchool = highSchool;
	}

	public String getSubject()
	{
		return this.subject;
	}

	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	public String getAwardInHighSchool()
	{
		return this.awardInHighSchool;
	}

	public void setAwardInHighSchool(String awardInHighSchool)
	{
		this.awardInHighSchool = awardInHighSchool;
	}

	public String getRanking()
	{
		return this.ranking;
	}

	public void setRanking(String ranking)
	{
		this.ranking = ranking;
	}

	public String getExamNumber()
	{
		return this.examNumber;
	}

	public void setExamNumber(String examNumber)
	{
		this.examNumber = examNumber;
	}

	public Double getExamScore()
	{
		return this.examScore;
	}

	public void setExamScore(Double examScore)
	{
		this.examScore = examScore;
	}

	public String getUniversity()
	{
		return this.university;
	}

	public void setUniversity(String university)
	{
		this.university = university;
	}

	public String getCollege()
	{
		return this.college;
	}

	public void setCollege(String college)
	{
		this.college = college;
	}

	public String getMajor()
	{
		return this.major;
	}

	public void setMajor(String major)
	{
		this.major = major;
	}

	public String getTel()
	{
		return this.tel;
	}

	public void setTel(String tel)
	{
		this.tel = tel;
	}

	public String getEmail()
	{
		return this.email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getQq()
	{
		return this.qq;
	}

	public void setQq(String qq)
	{
		this.qq = qq;
	}

	public String getFatherName()
	{
		return this.fatherName;
	}

	public void setFatherName(String fatherName)
	{
		this.fatherName = fatherName;
	}

	public String getFatherTel()
	{
		return this.fatherTel;
	}

	public void setFatherTel(String fatherTel)
	{
		this.fatherTel = fatherTel;
	}

	public String getMotherName()
	{
		return this.motherName;
	}

	public void setMotherName(String motherName)
	{
		this.motherName = motherName;
	}

	public String getMotherTel()
	{
		return this.motherTel;
	}

	public void setMotherTel(String motherTel)
	{
		this.motherTel = motherTel;
	}

	public String getAddress()
	{
		return this.address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getZipCode()
	{
		return this.zipCode;
	}

	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
	}

	public String getBankName()
	{
		return this.bankName;
	}

	public void setBankName(String bankName)
	{
		this.bankName = bankName;
	}

	public String getBankCustomer()
	{
		return this.bankCustomer;
	}

	public void setBankCustomer(String bankCustomer)
	{
		this.bankCustomer = bankCustomer;
	}

	public String getBankNumber()
	{
		return this.bankNumber;
	}

	public void setBankNumber(String bankNumber)
	{
		this.bankNumber = bankNumber;
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