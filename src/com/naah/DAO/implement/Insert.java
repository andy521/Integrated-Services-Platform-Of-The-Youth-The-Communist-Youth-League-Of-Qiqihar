package com.naah.DAO.implement;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.naah.DAO.interfaces.Ins;

@Repository("ins")
public class Insert implements Ins
{

	@Resource
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	/* (non-Javadoc)
	 * @see com.naah.DAO.inteface.Ins#INS(java.lang.Object)
	 */
	@Override
	public void INS(Object obj)
	{
		Session session = getCurrentSession();
		try
		{
			session.save(obj);

		}
		catch (HibernateException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}

	}

	/* (non-Javadoc)
	 * @see com.naah.DAO.inteface.Ins#Inssql(java.lang.String)
	 */
	@Override
	public void Inssql(String sql)
	{
		Session session = getCurrentSession();
		try
		{
			SQLQuery sqlQuery = session.createSQLQuery(sql);
			sqlQuery.executeUpdate();
		}
		catch (HibernateException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/* (non-Javadoc)
	 * @see com.naah.DAO.inteface.Ins#Inshql(java.lang.String)
	 */
	@Override
	public void Inshql(String hql)
	{
		Session session = getCurrentSession();
		try
		{
			Query query = session.createQuery(hql);
			query.executeUpdate();
		}
		catch (HibernateException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
