package org.cxj.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.cxj.bean.Car;
import org.cxj.service.CarService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @author cxj
 * @date 2016-05-18
 */
public class CarAction extends ActionSupport{
	private Car car;
	private CarService carservice;
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public CarService getCarservice() {
		return carservice;
	}
	@Resource
	public void setCarservice(CarService carservice) {
		this.carservice = carservice;
	}
	
	public String carList() throws Exception{
		List<Car> lists=carservice.list(0, 8);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("lists", lists);
		return SUCCESS;

	}
	public String selectCar() throws Exception{
		//System.out.println("plate:"+car.getPlateNo());
		Car onecar=carservice.selectCar(car.getPlateNo());
		if(onecar==null){
			//this.setMessage(onecar.getPlateNo());
              this.setMessage("您要查找的机动车信息不存在！");
			return SUCCESS;
		}
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("onecar", onecar);
		return SUCCESS;
	}

}
