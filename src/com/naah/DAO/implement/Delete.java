package com.naah.DAO.implement;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.naah.DAO.interfaces.Del;

@Repository("del")
public class Delete implements Del {
	
	@Resource
	private SessionFactory sessionFactory;

	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
/* (non-Javadoc)
 * @see com.naah.DAO.inteface.Del#DEL(java.lang.Object)
 */
@Override
public  void DEL(Object obj) {
	Session session=getCurrentSession();
	try {
		session.delete(obj);
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

/* (non-Javadoc)
 * @see com.naah.DAO.inteface.Del#Delsql(java.lang.String)
 */
@Override
public  void Delsql(String sql) {
	Session session=getCurrentSession();
	try {
		SQLQuery sqlQuery=session.createSQLQuery(sql);
		sqlQuery.executeUpdate();
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}

/* (non-Javadoc)
 * @see com.naah.DAO.inteface.Del#Delhql(java.lang.String)
 */
@Override
public  void Delhql(String hql)
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
