package org.cxj.service.impl;

import java.util.List;

import org.cxj.bean.Car;
import org.cxj.dao.CarDao;
import org.cxj.service.CarService;
/**
 * 
 * @author cxj
 * @date 2016-05-07
 * @date 2016-05-14
 */
public class CarServiceImpl implements CarService{
	private CarDao carDao;

	public CarDao getCarDao() {
		return carDao;
	}

	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}

	public Car selectCar(String plateNo){
		return carDao.selectCar(plateNo);
	}
	public void addCar(Car car){
		carDao.addCar(car);
	}
	public void deleteCar(String plateNo){
		carDao.deleteCar(plateNo);
	}
	public void updateCar(Car car){
		carDao.updateCar(car);
	}
	public List<Car> list(int start,int offset){
		return carDao.list(start, offset);
	}
}
