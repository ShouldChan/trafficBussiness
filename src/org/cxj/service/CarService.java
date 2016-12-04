package org.cxj.service;

import java.util.List;

import org.cxj.bean.Car;

/**
 * 
 * @author cxj
 * @date 2016-05-07
 * @date 2016-05-14
 */
public interface CarService {
	//新增机动车信息
	public void addCar(Car car);
	
	//删除机动车信息
	public void deleteCar(String plateNo);
			
	//修改机动车信息
	public void updateCar(Car car);
		
	//查询机动车信息
	public Car selectCar(String plateNo);

	//分页显示机动车信息
	public List<Car> list(int start,int offset);
}
