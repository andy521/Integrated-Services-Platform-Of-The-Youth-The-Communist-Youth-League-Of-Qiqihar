package com.naah.DAO.interfaces;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface Sel
{

	public abstract List HSQL(String hql);

	/**
	 * 
	 * @param hql
	 *            hql语句
	 * @param page
	 *            页数
	 * @return 查询结果list
	 */
	public abstract List HSQL(String hql,int page,int num);

	/**
	 * 
	 * @param hql
	 *            hql语句
	 * @param page
	 *            页数
	 * @param values
	 *            预编译字段的字段与值
	 * @return 查询结果list
	 */
	public abstract List HSQL(String hql,int page,String[][] values,int num);

	/**
	 * 
	 * @param sql
	 *            sql语句
	 * @param page
	 *            页数
	 * @return 查询结果list
	 */
	public abstract List SSQL(String sql,int page);

	public abstract List SSQL(String sql);

	public abstract Object getHQL(Class a,String id);

	public abstract Object getObj(String hql);

	public abstract long getcount(String hql);

}