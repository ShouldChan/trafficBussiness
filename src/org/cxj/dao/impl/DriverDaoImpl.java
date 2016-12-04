package org.cxj.dao.impl;

import java.util.List;

import org.cxj.bean.Driver;
import org.cxj.dao.BaseDao;
import org.cxj.dao.DriverDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * 
 * @author cxj
 * @date 2016-05-14
 * 
 */
public class DriverDaoImpl extends BaseDao implements DriverDao{
	//新增驾驶员信息
	public void addDriver(Driver driver){
		Session session=null;
		Transaction tx=null;
		try{
			session=getSession();
			tx=session.beginTransaction();
			session.save(driver);
			tx.commit();
		}catch(Exception e){
			if(tx!=null)
				tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}
	//删除驾驶员信息
	public void deleteDriver(String driverId){
		Session session=null;
		Transaction tx=null;
		try{
			Driver driver=this.selectDriver(driverId);
			session=getSession();
			tx=session.beginTransaction();
			session.delete(driver);
			tx.commit();
		}catch(Exception e){
			if(tx!=null)
				tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	//查询驾驶员信息
	public Driver selectDriver(String driverId){
		Session session=null;
		Transaction tx=null;
		Driver driver=null;
		try{
			session=getSession();
			tx=session.beginTransaction();
			Query query=session.createQuery("from Driver where driverId=?");
			query.setParameter(0, driverId);
			query.setMaxResults(1);
			driver=(Driver)query.uniqueResult();
			tx.commit();
		}catch(Exception e){
			if(tx!=null)
				tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return driver;
	}

	//分页显示驾驶员信息
	public List<Driver> list(int start,int offset){
		List<Driver> list =null;
		Session session=getSession();
		session.beginTransaction();
		String hql="from Driver order by driverId asc";
		Query query=session.createQuery(hql);
		query.setFirstResult(start);
		query.setMaxResults(offset);
		return (List<Driver>)query.list();
	}
	//修改驾驶员信息
	public void updateDriver(Driver driver){
		Session session=null;
		Transaction tx=null;
		try{
			session=getSession();
			tx=session.beginTransaction();
			session.update(driver);
			tx.commit();
		}catch(Exception e){
			if(tx!=null)
				tx.rollback();
			e.printStackTrace();
				
		}finally{
			session.close();
		}
	}
}
