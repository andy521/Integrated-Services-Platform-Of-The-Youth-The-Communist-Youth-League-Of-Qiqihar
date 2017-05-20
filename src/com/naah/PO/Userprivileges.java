package com.naah.PO;

/**
 * Userprivileges entity. @author MyEclipse Persistence Tools
 */

public class Userprivileges implements java.io.Serializable
{

	// Fields    

	private String userPrivilegeId;
	private Privileges privileges;
	private Users users;

	// Constructors

	/** default constructor */
	public Userprivileges()
	{}

	/** full constructor */
	public Userprivileges(Privileges privileges,Users users)
	{
		this.privileges = privileges;
		this.users = users;
	}

	// Property accessors

	public String getUserPrivilegeId()
	{
		return this.userPrivilegeId;
	}

	public void setUserPrivilegeId(String userPrivilegeId)
	{
		this.userPrivilegeId = userPrivilegeId;
	}

	public Privileges getPrivileges()
	{
		return this.privileges;
	}

	public void setPrivileges(Privileges privileges)
	{
		this.privileges = privileges;
	}

	public Users getUsers()
	{
		return this.users;
	}

	public void setUsers(Users users)
	{
		this.users = users;
	}

}