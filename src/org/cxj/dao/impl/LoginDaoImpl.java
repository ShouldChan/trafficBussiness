package org.cxj.dao.impl;
import org.cxj.dao.*;
import org.cxj.bean.Login;
import org.cxj.dao.LoginDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 * 
 * @author cxj
 * @date 2016-04-24
 */
public class LoginDaoImpl extends BaseDao implements LoginDao{
	public Login checkLogin(String name, String password){
		Session session=null;
		Transaction tx=null;
		Login login=null;
		try{
			session=getSession();
			tx=session.beginTransaction();
			Query query=session.createQuery("from Login where managerName=? and managerPassword=?");
			query.setParameter(0, name);
			query.setParameter(1, password);
			query.setMaxResults(1);
			login=(Login)query.uniqueResult();
			tx.commit();
		}catch(Exception e){
			if(tx!=null)
				tx.rollback();
			e.printStackTrace();
		}
		return login;
	}

}
