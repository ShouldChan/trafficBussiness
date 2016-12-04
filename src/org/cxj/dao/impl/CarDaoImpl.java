package org.cxj.dao.impl;

import java.util.List;

import org.cxj.bean.Car;
import org.cxj.dao.BaseDao;
import org.cxj.dao.CarDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 * 
 * @author cxj
 * @date 2016-05-14
 */
public class CarDaoImpl extends BaseDao implements CarDao{
	    //新增机动车信息
		public void addCar(Car car){
			Session session=null;
			Transaction tx=null;
			try{
				session=getSession();
				tx=session.beginTransaction();
				session.save(car);
				tx.commit();
			}catch(Exception e){
				if(tx!=null)
					tx.rollback();
				e.printStackTrace();
			}finally{
				session.close();
			}
			
		}
		//删除机动车记录
		public void deleteCar(String plateNo){
			Session session=null;
			Transaction tx=null;
			try{
				Car car=this.selectCar(plateNo);
				session=getSession();
				tx=session.beginTransaction();
				session.delete(car);
				tx.commit();
			}catch(Exception e){
				if(tx!=null)
					tx.rollback();
				e.printStackTrace();
			}finally{
				session.close();
			}
		}
		//查询机动车记录
		public Car selectCar(String plateNo){
			Session session=null;
			Transaction tx=null;
			Car car=null;
			try{
				session=getSession();
				tx=session.beginTransaction();
				String hql="from Car where plateNo=?";
				Query query=session.createQuery(hql);
				query.setParameter(0, plateNo);
				query.setMaxResults(1);
				car=(Car)query.uniqueResult();
				tx.commit();
			}catch(Exception e){
				if(tx!=null)
					tx.rollback();
				e.printStackTrace();
			}finally{
				session.close();
			}
			return car;
		}

		//修改机动车记录
		public void updateCar(Car car){
			Session session=null;
			Transaction tx=null;
			try{
				session=getSession();
				tx=session.beginTransaction();
				session.update(car);
				tx.commit();
			}catch(Exception e){
				if(tx!=null)
					tx.rollback();
				e.printStackTrace();
					
			}finally{
				session.close();
			}
		}
		//分页显示机动车记录
		public List<Car> list(int start,int offset){
			List<Car> list =null;
			Session session=getSession();
			session.beginTransaction();
			String hql="from Car order by plateNo asc";
			Query query=session.createQuery(hql);
			query.setFirstResult(start);
			query.setMaxResults(offset);
			return (List<Car>)query.list();
		}
}
