package org.cxj.dao;

import java.util.List;

import org.cxj.bean.Login;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.hibernate.SessionFactory;

/**
 * 
 * @author cxj
 * @date 2016-04-24
 *
 */
public interface LoginDao{
	
	public Login checkLogin(String name, String password);
	/*public boolean loginCheck(String userName,String passWord){
		//Session session=HibernateSessionFactory.getSession();
		//TODO logincheck
		return true;
	}
	public boolean checkLogin(String username, String password) {
		Session session=null;
		Transaction tx=null;
		Login manager=null;
		try{
			//TODO session=getSession();
			tx=session.beginTransaction();
			Query query=session.createQuery("from Manager where managerName=? and managerPassword=?");
			query.setParameter(0, username);
			query.setParameter(1, password);
			query.setMaxResults(1);
			manager=(Login) query.uniqueResult();
			tx.commit();
		}catch(Exception e){
			if(tx!=null)
				tx.rollback();
			e.printStackTrace();
		}
		return true;
	}*/

}
