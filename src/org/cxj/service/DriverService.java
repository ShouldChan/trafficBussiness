package org.cxj.service;

import java.util.List;

import org.cxj.bean.Driver;

/**
 * 
 * @author cxj
 * @date 2016-05-07
 * @date 2016-05-14
 * 
 */
public interface DriverService {
	//查询驾驶员信息
	public Driver selectDriver(String driverId);
	
	//新增驾驶员信息
	public void addDriver(Driver driver);
	
	//删除驾驶员信息
	public void deleteDriver(String dirverId);
	
	//修改驾驶员信息
	public void updateDriver(Driver driver);
	
	//分页显示驾驶员信息
	public List<Driver> list(int start,int offset);
}
