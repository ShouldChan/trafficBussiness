package org.cxj.dao;

import java.util.List;

import org.cxj.bean.Driver;

/**
 * @author cxj
 * @date 2016-05-06
 * 
 */
public interface DriverDao{
	//新增驾驶员信息
	public void addDriver(Driver driver); 
	
	//删除驾驶员信息
	public void deleteDriver(String driverId);
	
	//修改驾驶员信息
	public void updateDriver(Driver driver);
	
	//查询驾驶员信息
	public Driver selectDriver(String driverId);
	//分页显示所有驾驶员信息
	public List<Driver> list(int start,int offset);
	
}
