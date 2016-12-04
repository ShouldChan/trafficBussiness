package org.cxj.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.cxj.bean.Driver;
import org.cxj.bean.Trafficoffense;
import org.cxj.service.TrafficoffenseService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TrafficoffenseAction extends ActionSupport{
	private Trafficoffense trafficoffense;
	private TrafficoffenseService trafficoffenseService;
	private String message;
	public TrafficoffenseService getTrafficoffenseService() {
		return trafficoffenseService;
	}
	@Resource
	public void setTrafficoffenseService(TrafficoffenseService trafficoffenseService) {
		this.trafficoffenseService = trafficoffenseService;
	}
	public Trafficoffense getTrafficoffense() {
		return trafficoffense;
	}
	public void setTrafficoffense(Trafficoffense trafficoffense) {
		this.trafficoffense = trafficoffense;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String offenseList() throws Exception{
		List<Trafficoffense> lists=trafficoffenseService.list(0, 8);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("lists", lists);
		return SUCCESS;
	}
	
	public String selectTrafficoffense() throws Exception{
		Trafficoffense onetrafficoffense=trafficoffenseService.selectTrafficoffense(trafficoffense.getPlateNo());
		if(onetrafficoffense==null){
			this.setMessage("该机动车无违章记录！");
			return SUCCESS;
		}
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("onetrafficoffense", onetrafficoffense);
		return SUCCESS;
	}
}
