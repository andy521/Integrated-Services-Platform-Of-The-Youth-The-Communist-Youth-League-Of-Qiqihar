package com.naah.PO;

import java.sql.Timestamp;

/**
 * Operationlogs entity. @author MyEclipse Persistence Tools
 */

public class Operationlogs implements java.io.Serializable
{

	// Fields    

	private String logId;
	private Users users;
	private String operationKind;
	private String operationIp;
	private Timestamp operationTime;
	private String operationObject;
	private String opeartionValue;

	// Constructors

	/** default constructor */
	public Operationlogs()
	{}

	/** minimal constructor */
	public Operationlogs(Users users,String operationKind,String operationIp,Timestamp operationTime)
	{
		this.users = users;
		this.operationKind = operationKind;
		this.operationIp = operationIp;
		this.operationTime = operationTime;
	}

	/** full constructor */
	public Operationlogs(Users users,String operationKind,String operationIp,Timestamp operationTime,String operationObject,String opeartionValue)
	{
		this.users = users;
		this.operationKind = operationKind;
		this.operationIp = operationIp;
		this.operationTime = operationTime;
		this.operationObject = operationObject;
		this.opeartionValue = opeartionValue;
	}

	// Property accessors

	public String getLogId()
	{
		return this.logId;
	}

	public void setLogId(String logId)
	{
		this.logId = logId;
	}

	public Users getUsers()
	{
		return this.users;
	}

	public void setUsers(Users users)
	{
		this.users = users;
	}

	public String getOperationKind()
	{
		return this.operationKind;
	}

	public void setOperationKind(String operationKind)
	{
		this.operationKind = operationKind;
	}

	public String getOperationIp()
	{
		return this.operationIp;
	}

	public void setOperationIp(String operationIp)
	{
		this.operationIp = operationIp;
	}

	public Timestamp getOperationTime()
	{
		return this.operationTime;
	}

	public void setOperationTime(Timestamp operationTime)
	{
		this.operationTime = operationTime;
	}

	public String getOperationObject()
	{
		return this.operationObject;
	}

	public void setOperationObject(String operationObject)
	{
		this.operationObject = operationObject;
	}

	public String getOpeartionValue()
	{
		return this.opeartionValue;
	}

	public void setOpeartionValue(String opeartionValue)
	{
		this.opeartionValue = opeartionValue;
	}

}