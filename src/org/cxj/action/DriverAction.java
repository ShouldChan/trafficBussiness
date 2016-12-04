package org.cxj.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.cxj.bean.Driver;
import org.cxj.service.DriverService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DriverAction extends ActionSupport{
	private Driver driver;
	private DriverService driverservice;
	private String message;
	
	public String driverList() throws Exception{
		List<Driver> lists=driverservice.list(0, 8);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("lists", lists);
		return SUCCESS;
	}
	public Driver getDriver() {
		return driver;
	}
	
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public DriverService getDriverservice() {
		return driverservice;
	}
	@Resource
	public void setDriverservice(DriverService driverservice) {
		this.driverservice = driverservice;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String addDriver() throws Exception{
		Driver dr=driverservice.selectDriver(driver.getDriverId());
		if(dr!=null){
			this.setMessage("您要添加的驾驶员信息已存在！");
			return SUCCESS;
		}
		Driver d=new Driver();
		d.setDriverId(driver.getDriverId());
		d.setDriverRecordId(driver.getDriverRecordId());
		d.setDriverName(driver.getDriverName());
		d.setDriverSex(driver.getDriverSex());
		d.setDriverNationality(driver.getDriverNationality());
		d.setDriverAddress(driver.getDriverAddress());
		d.setDateOfBirth(driver.getDateOfBirth());
		d.setDateOfFirstIssue(driver.getDateOfFirstIssue());
		d.setCarClass(driver.getCarClass());
		
		driverservice.addDriver(d);
		this.setMessage("添加成功！");
		return SUCCESS;
	}
	public String deleteDriver() throws Exception{
		if(driver.getDriverId()==null||driver.getDriverId().equals("")){
			this.setMessage("您输入的身份证号为空！");
			return SUCCESS;
		}
		Driver dr=driverservice.selectDriver(driver.getDriverId());
		if(dr==null){
			this.setMessage("您要删除的驾驶员信息不存在！");
			return SUCCESS;
		}
		driverservice.deleteDriver(driver.getDriverId());
		this.setMessage("删除成功！");
		return SUCCESS;
	}
	public String selectDriver() throws Exception{
		Driver onedriver=driverservice.selectDriver(driver.getDriverId());
		if(onedriver==null){
			this.setMessage("您要查找的驾驶员信息不存在！");
			return SUCCESS;
		}
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("onedriver", onedriver);
		return SUCCESS;
		
	}
	public String updateDriver() throws Exception{
		Driver dr=driverservice.selectDriver(driver.getDriverId());
		if(dr==null){
			this.setMessage("您要修改的驾驶员信息不存在！");
			return SUCCESS;
		}
		Driver d=new Driver();
		d.setDriverId(driver.getDriverId());
		d.setDriverRecordId(driver.getDriverRecordId());
		d.setDriverName(driver.getDriverName());
		d.setDriverSex(driver.getDriverSex());
		d.setDriverNationality(driver.getDriverNationality());
		d.setDriverAddress(driver.getDriverAddress());
		d.setDateOfBirth(driver.getDateOfBirth());
		d.setDateOfFirstIssue(driver.getDateOfFirstIssue());
		d.setCarClass(driver.getCarClass());
		
		driverservice.updateDriver(d);
		this.setMessage("修改成功！");
		return SUCCESS;
	}
}
