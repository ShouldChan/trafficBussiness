package org.cxj.dao.impl;

import java.util.List;

import org.cxj.bean.Car;
import org.cxj.bean.Trafficoffense;
import org.cxj.dao.BaseDao;
import org.cxj.dao.TrafficoffenseDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 * 
 * @author cxj
 * @date 2016-05-15
 */
public class TrafficoffenseDaoImpl extends BaseDao implements TrafficoffenseDao{
	//新增违章记录
		public void addTrafficoffense(Trafficoffense tof){
			Session session=null;
			Transaction tx=null;
			try{
				session=getSession();
				tx=session.beginTransaction();
				session.save(tof);
				tx.commit();
			}catch(Exception e){
				if(tx!=null)
					tx.rollback();
				e.printStackTrace();
			}finally{
				session.close();
			}
			
		}
		//删除违章记录
		public void deleteTrafficoffense(String plateNo){
			Session session=null;
			Transaction tx=null;
			try{
				Trafficoffense tof=this.selectTrafficoffense(plateNo);
				session=getSession();
				tx=session.beginTransaction();
				session.delete(tof);
				tx.commit();
			}catch(Exception e){
				if(tx!=null)
					tx.rollback();
				e.printStackTrace();
			}finally{
				session.close();
			}
		}
		//查询违章记录
		public Trafficoffense selectTrafficoffense(String plateNo){
			Session session=null;
			Transaction tx=null;
			Trafficoffense tof=null;
			try{
				session=getSession();
				tx=session.beginTransaction();
				String hql="from Trafficoffense where plateNo=?";
				Query query=session.createQuery(hql);
				query.setParameter(0, plateNo);
				query.setMaxResults(1);
				tof=(Trafficoffense)query.uniqueResult();
				tx.commit();
			}catch(Exception e){
				if(tx!=null)
					tx.rollback();
				e.printStackTrace();
			}finally{
				session.close();
			}
			return tof;
		}

		//修改违章记录
		public void updateTrafficoffense(Trafficoffense tof){
			Session session=null;
			Transaction tx=null;
			try{
				session=getSession();
				tx=session.beginTransaction();
				session.update(tof);
				tx.commit();
			}catch(Exception e){
				if(tx!=null)
					tx.rollback();
				e.printStackTrace();
					
			}finally{
				session.close();
			}
		}

		//分页显示违章记录
		public List<Trafficoffense> list(int start,int offset){
			List<Car> list =null;
			Session session=getSession();
			session.beginTransaction();
			String hql="from Trafficoffense order by plateNo asc";
			Query query=session.createQuery(hql);
			query.setFirstResult(start);
			query.setMaxResults(offset);
			return (List<Trafficoffense>)query.list();
		}
}
