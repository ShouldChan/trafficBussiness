package org.cxj.service.impl;

import java.util.List;

import org.cxj.bean.Trafficoffense;
import org.cxj.dao.TrafficoffenseDao;
import org.cxj.service.TrafficoffenseService;
/**
 * 
 * @author cxj
 * @date 2016-05-07
 */
public class TrafficeoffenseServiceImpl implements TrafficoffenseService{
	private TrafficoffenseDao trafficoffenseDao;

	public TrafficoffenseDao getTrafficoffenseDao() {
		return trafficoffenseDao;
	}

	public void setTrafficoffenseDao(TrafficoffenseDao trafficoffenseDao) {
		this.trafficoffenseDao = trafficoffenseDao;
	}
	
	public void addTrafficoffense(Trafficoffense tof){
		trafficoffenseDao.addTrafficoffense(tof);
	}

	public void deleteTrafficoffense(String plateNo){
		trafficoffenseDao.deleteTrafficoffense(plateNo);
	}
	public void updateTrafficoffense(Trafficoffense tof){
		trafficoffenseDao.updateTrafficoffense(tof);
	}
	public Trafficoffense selectTrafficoffense(String plateNo){
		return trafficoffenseDao.selectTrafficoffense(plateNo);
	}
	public List<Trafficoffense> list(int start,int offset){
		return trafficoffenseDao.list(start, offset);
	}
}
