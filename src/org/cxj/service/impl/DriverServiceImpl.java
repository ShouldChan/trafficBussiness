package org.cxj.service.impl;

import java.util.List;

import org.cxj.bean.Driver;
import org.cxj.dao.DriverDao;
import org.cxj.service.DriverService;
/**
 * 
 * @author cxj
 * @date 2016-05-07
 * @date 2016-05-14
 */
public class DriverServiceImpl implements DriverService{
	private DriverDao driverDao;

	public DriverDao getDriverDao() {
		return driverDao;
	}

	public void setDriverDao(DriverDao driverDao) {
		this.driverDao = driverDao;
	}

	public Driver selectDriver(String driverId){
		return driverDao.selectDriver(driverId);
	}
	
	public void addDriver(Driver driver){
		driverDao.addDriver(driver);
	}
	public void deleteDriver(String driverId){
		driverDao.deleteDriver(driverId);
	}
	public void updateDriver(Driver driver){
		driverDao.updateDriver(driver);
	}
	
	public List<Driver> list(int start,int offset){
		return driverDao.list(start, offset);
	}
}