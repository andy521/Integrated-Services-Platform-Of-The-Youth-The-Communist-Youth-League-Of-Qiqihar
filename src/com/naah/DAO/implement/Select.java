package com.naah.DAO.implement;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.naah.DAO.interfaces.Sel;

@Repository("sel")
public class Select implements Sel
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
	 * @see com.naah.DAO.inteface.Sel#HSQL(java.lang.String)
	 */
	@Override
	public List HSQL(String hql)
	{
		Session session = getCurrentSession();;

		List list = null;
		try
		{
			Query query = session.createQuery(hql);
			list = query.list();

		}
		catch (HibernateException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{

		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.naah.DAO.inteface.Sel#HSQL(java.lang.String, int, int)
	 */
	@Override
	public List HSQL(String hql,int page,int num)
	{
		Session session = getCurrentSession();;

		List list = null;
		try
		{
			Query query = session.createQuery(hql).setMaxResults(num).setFirstResult((page - 1) * 10);
			list = query.list();

		}
		catch (HibernateException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{

		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.naah.DAO.inteface.Sel#HSQL(java.lang.String, int, java.lang.String[][], int)
	 */
	@Override
	public List HSQL(String hql,int page,String[][] values,int num)
	{
		Session session = getCurrentSession();;

		List list = null;
		try
		{
			Query query = session.createQuery(hql).setMaxResults(num).setFirstResult((page - 1) * 10);
			for (int i = 0; i < values.length; i++)
			{
				query.setString(values[i][0], values[i][1]);
			}
			list = query.list();

		}
		catch (HibernateException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{

		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.naah.DAO.inteface.Sel#SSQL(java.lang.String, int)
	 */
	@Override
	public List SSQL(String sql,int page)
	{
		Session session = getCurrentSession();;

		List list = null;
		try
		{
			Query query = session.createSQLQuery(sql).setMaxResults(10).setFirstResult((page - 1) * 10);
			list = query.list();

		}
		catch (HibernateException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{

		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.naah.DAO.inteface.Sel#SSQL(java.lang.String)
	 */
	@Override
	public List SSQL(String sql)
	{
		Session session = getCurrentSession();;

		List list = null;
		try
		{
			Query query = session.createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);;
			list = query.list();

		}
		catch (HibernateException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{

		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.naah.DAO.inteface.Sel#getHQL(java.lang.Class, java.lang.String)
	 */
	@Override
	public Object getHQL(Class a,String id)
	{
		Session session = getCurrentSession();;
		Object aObject = null;
		try
		{
			aObject = session.get(a, id);
		}
		catch (HibernateException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{

		}
		return aObject;
	}

	/* (non-Javadoc)
	 * @see com.naah.DAO.inteface.Sel#getObj(java.lang.String)
	 */
	@Override
	public Object getObj(String hql)
	{
		Session session = getCurrentSession();;

		Object aObject = null;
		List list = null;
		try
		{
			Query query = session.createQuery(hql);
			list = query.list();

			if (list != null && list.size() > 0)
			{
				aObject = list.get(0);
			}
			else
			{
				aObject = null;
			}
		}
		catch (HibernateException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{

		}
		return aObject;

	}

	/* (non-Javadoc)
	 * @see com.naah.DAO.inteface.Sel#getcount(java.lang.String)
	 */
	@Override
	public long getcount(String hql)
	{
		Session session = getCurrentSession();
		long i = 0;
		try
		{
			Query query = session.createQuery(hql);
			i = (long) query.list().get(0);

		}
		catch (HibernateException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;

	}
}
