package org.cxj.dao.impl;

import java.util.List;

import org.cxj.bean.Accident;
import org.cxj.dao.AccidentDao;
import org.cxj.dao.BaseDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * 
 * @author cxj
 * @date 2016-05-15
 * @date 2016-05-17
 */
public class AccidentDaoImpl extends BaseDao implements AccidentDao{
	//新增事故记录
		public void addAccident(Accident accident){
			Session session=null;
			Transaction tx=null;
			try{
				session=getSession();
				tx=session.beginTransaction();
				session.save(accident);
				tx.commit();
			}catch(Exception e){
				if(tx!=null)
					tx.rollback();
				e.printStackTrace();
			}finally{
				session.close();
			}
			
		}
		//删除事故记录
		public void deleteAccident(String accidentId){
			Session session=null;
			Transaction tx=null;
			try{
				Accident accident=this.selectAccident(accidentId);
				session=getSession();
				tx=session.beginTransaction();
				session.delete(accident);
				tx.commit();
			}catch(Exception e){
				if(tx!=null)
					tx.rollback();
				e.printStackTrace();
			}finally{
				session.close();
			}
		}
		//查询事故记录
		public Accident selectAccident(String accidentId){
			Session session=null;
			Transaction tx=null;
			Accident accident=null;
			try{
				session=getSession();
				tx=session.beginTransaction();
				Query query=session.createQuery("from Accident where accidentId=?");
				query.setParameter(0, accidentId);
				query.setMaxResults(1);
				accident=(Accident)query.uniqueResult();
				tx.commit();
			}catch(Exception e){
				if(tx!=null)
					tx.rollback();
				e.printStackTrace();
			}finally{
				session.close();
			}
			return accident;
		}

		//修改事故记录
		public void updateAccident(Accident accident){
			Session session=null;
			Transaction tx=null;
			try{
				session=getSession();
				tx=session.beginTransaction();
				session.update(accident);
				tx.commit();
			}catch(Exception e){
				if(tx!=null)
					tx.rollback();
				e.printStackTrace();
					
			}finally{
				session.close();
			}
		}

		//分页显示事故记录
		public List<Accident> list(int start,int offset){
			List<Accident> list =null;
			Session session=getSession();
			session.beginTransaction();
			String hql="from Accident order by plateNo asc";
			Query query=session.createQuery(hql);
			query.setFirstResult(start);
			query.setMaxResults(offset);
			return (List<Accident>)query.list();
		}
}
