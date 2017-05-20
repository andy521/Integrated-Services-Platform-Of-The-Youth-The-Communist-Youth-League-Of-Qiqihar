package com.naah.DAO.implement;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.naah.DAO.interfaces.Upd;
@Repository("upd")
public class Update implements Upd {
	@Resource
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
 /* (non-Javadoc)
 * @see com.naah.DAO.inteface.Upd#UPD(java.lang.Object)
 */
@Override
public  void UPD(Object obj) {
	 
	 	Session session=getCurrentSession();
		
		try {
			session.clear();
			session.saveOrUpdate(obj);
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			
		}
}
 
 /* (non-Javadoc)
 * @see com.naah.DAO.inteface.Upd#Updsql(java.lang.String)
 */
@Override
public  void Updsql(String sql)
 {
	 Session session=getCurrentSession();
	 
		try {
			
			SQLQuery sQLQuery=session.createSQLQuery(sql);
			sQLQuery.executeUpdate();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		
			
		}
		
 }
 
 /* (non-Javadoc)
 * @see com.naah.DAO.inteface.Upd#Updhql(java.lang.String)
 */
@Override
public   void Updhql(String hql)
 {
	 Session session=getCurrentSession();
	 
		try {
			Query query=session.createQuery(hql);
			query.executeUpdate();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
 }
}
