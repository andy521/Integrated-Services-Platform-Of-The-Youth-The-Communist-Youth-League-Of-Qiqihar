package com.naah.services.interfaces;

import org.aspectj.lang.JoinPoint;

import com.naah.PO.Operationlogs;

public interface logstoolInt
{

	public abstract Operationlogs sel(JoinPoint pjp);

	public abstract Operationlogs del(JoinPoint pjp);

	public abstract Operationlogs ins(JoinPoint pjp);

	public abstract Operationlogs upd(JoinPoint pjp);

	public abstract Operationlogs upload(JoinPoint pjp);

	public abstract Operationlogs GoTo(JoinPoint pjp);

	public abstract Operationlogs login(JoinPoint pjp);

	public abstract Operationlogs deluser(JoinPoint pjp);

	public abstract Operationlogs SavePrivilege(JoinPoint pjp);

}