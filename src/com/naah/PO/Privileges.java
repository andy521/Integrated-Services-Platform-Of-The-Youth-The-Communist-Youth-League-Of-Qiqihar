package com.naah.PO;

import java.util.HashSet;
import java.util.Set;

/**
 * Privileges entity. @author MyEclipse Persistence Tools
 */

public class Privileges implements java.io.Serializable
{

	// Fields    

	private String privilegeId;
	private String privilegeName;
	private String url;
	private String parentId;
	private String isLink;
	private Set userprivilegeses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Privileges()
	{}

	/** minimal constructor */
	public Privileges(String privilegeName,String url,String isLink)
	{
		this.privilegeName = privilegeName;
		this.url = url;
		this.isLink = isLink;
	}

	/** full constructor */
	public Privileges(String privilegeName,String url,String parentId,String isLink,Set userprivilegeses)
	{
		this.privilegeName = privilegeName;
		this.url = url;
		this.parentId = parentId;
		this.isLink = isLink;
		this.userprivilegeses = userprivilegeses;
	}

	// Property accessors

	public String getPrivilegeId()
	{
		return this.privilegeId;
	}

	public void setPrivilegeId(String privilegeId)
	{
		this.privilegeId = privilegeId;
	}

	public String getPrivilegeName()
	{
		return this.privilegeName;
	}

	public void setPrivilegeName(String privilegeName)
	{
		this.privilegeName = privilegeName;
	}

	public String getUrl()
	{
		return this.url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getParentId()
	{
		return this.parentId;
	}

	public void setParentId(String parentId)
	{
		this.parentId = parentId;
	}

	public String getIsLink()
	{
		return this.isLink;
	}

	public void setIsLink(String isLink)
	{
		this.isLink = isLink;
	}

	public Set getUserprivilegeses()
	{
		return this.userprivilegeses;
	}

	public void setUserprivilegeses(Set userprivilegeses)
	{
		this.userprivilegeses = userprivilegeses;
	}

}