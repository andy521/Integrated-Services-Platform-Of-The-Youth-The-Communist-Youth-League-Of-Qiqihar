package com.naah.PO;

import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Areas entity. @author MyEclipse Persistence Tools
 */
@JsonIgnoreProperties(
		value = { "youthlawhelptablesForAreaId", "usersesForCity", "singleyouthtablesForCountyId", "usersesForCounty", "wishtablesForAreaId",
				"youthworktablesForAreaId", "youthworktablesForCountyId", "youthmentalitytablesForAreaId", "onetoonetablesForCountyId",
				"illnesshelptablesForCountyId", "onetoonetablesForAreaId", "illnesshelptablesForAreaId", "donatepersontablesForCityId",
				"singleyouthtablesForAreaId", "youthlawhelptablesForCountyId", "youthmentalitytablesForCountyId", "donatepersontablesForCountyId",
				"wishtablesForCountyId", "universitytablesForAreaId", "universitytablesForCountyId" })
public class Areas implements java.io.Serializable
{

	// Fields    

	private String areaId;
	private String areaName;
	private String areaParent;
	private String isCity;
	private Set youthlawhelptablesForAreaId = new HashSet(0);
	private Set usersesForCity = new HashSet(0);
	private Set singleyouthtablesForCountyId = new HashSet(0);
	private Set usersesForCounty = new HashSet(0);
	private Set wishtablesForAreaId = new HashSet(0);
	private Set youthworktablesForAreaId = new HashSet(0);
	private Set youthworktablesForCountyId = new HashSet(0);
	private Set youthmentalitytablesForAreaId = new HashSet(0);
	private Set onetoonetablesForCountyId = new HashSet(0);
	private Set illnesshelptablesForCountyId = new HashSet(0);
	private Set onetoonetablesForAreaId = new HashSet(0);
	private Set illnesshelptablesForAreaId = new HashSet(0);
	private Set donatepersontablesForCityId = new HashSet(0);
	private Set singleyouthtablesForAreaId = new HashSet(0);
	private Set youthlawhelptablesForCountyId = new HashSet(0);
	private Set youthmentalitytablesForCountyId = new HashSet(0);
	private Set donatepersontablesForCountyId = new HashSet(0);
	private Set wishtablesForCountyId = new HashSet(0);
	private Set universitytablesForAreaId = new HashSet(0);
	private Set universitytablesForCountyId = new HashSet(0);

	// Constructors

	/** default constructor */
	public Areas()
	{}

	/** minimal constructor */
	public Areas(String areaName,String isCity)
	{
		this.areaName = areaName;
		this.isCity = isCity;
	}

	/** full constructor */
	public Areas(String areaName,String areaParent,String isCity,Set youthlawhelptablesForAreaId,Set usersesForCity,Set singleyouthtablesForCountyId,
			Set usersesForCounty,Set wishtablesForAreaId,Set youthworktablesForAreaId,Set youthworktablesForCountyId,Set youthmentalitytablesForAreaId,
			Set onetoonetablesForCountyId,Set illnesshelptablesForCountyId,Set onetoonetablesForAreaId,Set illnesshelptablesForAreaId,
			Set donatepersontablesForCityId,Set singleyouthtablesForAreaId,Set youthlawhelptablesForCountyId,Set youthmentalitytablesForCountyId,
			Set donatepersontablesForCountyId,Set wishtablesForCountyId,Set universitytablesForAreaId,Set universitytablesForCountyId)
	{
		this.areaName = areaName;
		this.areaParent = areaParent;
		this.isCity = isCity;
		this.youthlawhelptablesForAreaId = youthlawhelptablesForAreaId;
		this.usersesForCity = usersesForCity;
		this.singleyouthtablesForCountyId = singleyouthtablesForCountyId;
		this.usersesForCounty = usersesForCounty;
		this.wishtablesForAreaId = wishtablesForAreaId;
		this.youthworktablesForAreaId = youthworktablesForAreaId;
		this.youthworktablesForCountyId = youthworktablesForCountyId;
		this.youthmentalitytablesForAreaId = youthmentalitytablesForAreaId;
		this.onetoonetablesForCountyId = onetoonetablesForCountyId;
		this.illnesshelptablesForCountyId = illnesshelptablesForCountyId;
		this.onetoonetablesForAreaId = onetoonetablesForAreaId;
		this.illnesshelptablesForAreaId = illnesshelptablesForAreaId;
		this.donatepersontablesForCityId = donatepersontablesForCityId;
		this.singleyouthtablesForAreaId = singleyouthtablesForAreaId;
		this.youthlawhelptablesForCountyId = youthlawhelptablesForCountyId;
		this.youthmentalitytablesForCountyId = youthmentalitytablesForCountyId;
		this.donatepersontablesForCountyId = donatepersontablesForCountyId;
		this.wishtablesForCountyId = wishtablesForCountyId;
		this.universitytablesForAreaId = universitytablesForAreaId;
		this.universitytablesForCountyId = universitytablesForCountyId;
	}

	// Property accessors

	public String getAreaId()
	{
		return this.areaId;
	}

	public void setAreaId(String areaId)
	{
		this.areaId = areaId;
	}

	public String getAreaName()
	{
		return this.areaName;
	}

	public void setAreaName(String areaName)
	{
		this.areaName = areaName;
	}

	public String getAreaParent()
	{
		return this.areaParent;
	}

	public void setAreaParent(String areaParent)
	{
		this.areaParent = areaParent;
	}

	public String getIsCity()
	{
		return this.isCity;
	}

	public void setIsCity(String isCity)
	{
		this.isCity = isCity;
	}

	public Set getYouthlawhelptablesForAreaId()
	{
		return this.youthlawhelptablesForAreaId;
	}

	public void setYouthlawhelptablesForAreaId(Set youthlawhelptablesForAreaId)
	{
		this.youthlawhelptablesForAreaId = youthlawhelptablesForAreaId;
	}

	public Set getUsersesForCity()
	{
		return this.usersesForCity;
	}

	public void setUsersesForCity(Set usersesForCity)
	{
		this.usersesForCity = usersesForCity;
	}

	public Set getSingleyouthtablesForCountyId()
	{
		return this.singleyouthtablesForCountyId;
	}

	public void setSingleyouthtablesForCountyId(Set singleyouthtablesForCountyId)
	{
		this.singleyouthtablesForCountyId = singleyouthtablesForCountyId;
	}

	public Set getUsersesForCounty()
	{
		return this.usersesForCounty;
	}

	public void setUsersesForCounty(Set usersesForCounty)
	{
		this.usersesForCounty = usersesForCounty;
	}

	public Set getWishtablesForAreaId()
	{
		return this.wishtablesForAreaId;
	}

	public void setWishtablesForAreaId(Set wishtablesForAreaId)
	{
		this.wishtablesForAreaId = wishtablesForAreaId;
	}

	public Set getYouthworktablesForAreaId()
	{
		return this.youthworktablesForAreaId;
	}

	public void setYouthworktablesForAreaId(Set youthworktablesForAreaId)
	{
		this.youthworktablesForAreaId = youthworktablesForAreaId;
	}

	public Set getYouthworktablesForCountyId()
	{
		return this.youthworktablesForCountyId;
	}

	public void setYouthworktablesForCountyId(Set youthworktablesForCountyId)
	{
		this.youthworktablesForCountyId = youthworktablesForCountyId;
	}

	public Set getYouthmentalitytablesForAreaId()
	{
		return this.youthmentalitytablesForAreaId;
	}

	public void setYouthmentalitytablesForAreaId(Set youthmentalitytablesForAreaId)
	{
		this.youthmentalitytablesForAreaId = youthmentalitytablesForAreaId;
	}

	public Set getOnetoonetablesForCountyId()
	{
		return this.onetoonetablesForCountyId;
	}

	public void setOnetoonetablesForCountyId(Set onetoonetablesForCountyId)
	{
		this.onetoonetablesForCountyId = onetoonetablesForCountyId;
	}

	public Set getIllnesshelptablesForCountyId()
	{
		return this.illnesshelptablesForCountyId;
	}

	public void setIllnesshelptablesForCountyId(Set illnesshelptablesForCountyId)
	{
		this.illnesshelptablesForCountyId = illnesshelptablesForCountyId;
	}

	public Set getOnetoonetablesForAreaId()
	{
		return this.onetoonetablesForAreaId;
	}

	public void setOnetoonetablesForAreaId(Set onetoonetablesForAreaId)
	{
		this.onetoonetablesForAreaId = onetoonetablesForAreaId;
	}

	public Set getIllnesshelptablesForAreaId()
	{
		return this.illnesshelptablesForAreaId;
	}

	public void setIllnesshelptablesForAreaId(Set illnesshelptablesForAreaId)
	{
		this.illnesshelptablesForAreaId = illnesshelptablesForAreaId;
	}

	public Set getDonatepersontablesForCityId()
	{
		return this.donatepersontablesForCityId;
	}

	public void setDonatepersontablesForCityId(Set donatepersontablesForCityId)
	{
		this.donatepersontablesForCityId = donatepersontablesForCityId;
	}

	public Set getSingleyouthtablesForAreaId()
	{
		return this.singleyouthtablesForAreaId;
	}

	public void setSingleyouthtablesForAreaId(Set singleyouthtablesForAreaId)
	{
		this.singleyouthtablesForAreaId = singleyouthtablesForAreaId;
	}

	public Set getYouthlawhelptablesForCountyId()
	{
		return this.youthlawhelptablesForCountyId;
	}

	public void setYouthlawhelptablesForCountyId(Set youthlawhelptablesForCountyId)
	{
		this.youthlawhelptablesForCountyId = youthlawhelptablesForCountyId;
	}

	public Set getYouthmentalitytablesForCountyId()
	{
		return this.youthmentalitytablesForCountyId;
	}

	public void setYouthmentalitytablesForCountyId(Set youthmentalitytablesForCountyId)
	{
		this.youthmentalitytablesForCountyId = youthmentalitytablesForCountyId;
	}

	public Set getDonatepersontablesForCountyId()
	{
		return this.donatepersontablesForCountyId;
	}

	public void setDonatepersontablesForCountyId(Set donatepersontablesForCountyId)
	{
		this.donatepersontablesForCountyId = donatepersontablesForCountyId;
	}

	public Set getWishtablesForCountyId()
	{
		return this.wishtablesForCountyId;
	}

	public void setWishtablesForCountyId(Set wishtablesForCountyId)
	{
		this.wishtablesForCountyId = wishtablesForCountyId;
	}

	public Set getUniversitytablesForAreaId()
	{
		return this.universitytablesForAreaId;
	}

	public void setUniversitytablesForAreaId(Set universitytablesForAreaId)
	{
		this.universitytablesForAreaId = universitytablesForAreaId;
	}

	public Set getUniversitytablesForCountyId()
	{
		return this.universitytablesForCountyId;
	}

	public void setUniversitytablesForCountyId(Set universitytablesForCountyId)
	{
		this.universitytablesForCountyId = universitytablesForCountyId;
	}

}