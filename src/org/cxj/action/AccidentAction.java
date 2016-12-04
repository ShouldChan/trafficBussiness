package org.cxj.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.cxj.bean.Accident;
import org.cxj.bean.Driver;
import org.cxj.service.AccidentService;

import com.opensymphony.xwork2.ActionSupport;

public class AccidentAction extends ActionSupport{
	private Accident accident;
	private AccidentService acccidentService;
	
	public Accident getAccident() {
		return accident;
	}
	public void setAccident(Accident accident) {
		this.accident = accident;
	}
	public AccidentService getAcccidentService() {
		return acccidentService;
	}
	@Resource
	public void setAcccidentService(AccidentService acccidentService) {
		this.acccidentService = acccidentService;
	}
	
	public String accidentList() throws Exception{
		List<Accident> lists=acccidentService.list(0, 8);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("lists", lists);
		return SUCCESS;

	}
	public String addAccident() throws Exception{
		//System.out.println("-----------------------");
		/*Accident a=new Accident();
		a.setDriverName(accident.getDriverName());
		a.setDriverPhone(accident.getDriverPhone());
		a.setDriverId(accident.getDriverId());
		a.setPlateNo(accident.getPlateNo());
		a.setVehicleType(accident.getVehicleType());
		a.setAccidentPlace(accident.getAccidentPlace());
		a.setInsurCom(accident.getInsurCom());
		a.setInsurNo(accident.getInsurNo());
		a.setDrivercardPic(accident.getDrivercardPic());
		a.setCarcardPic(accident.getCarcardPic());
		a.setInsurPic(accident.getInsurPic());
		a.setFrontPic(accident.getFrontPic());
		a.setBackPic(accident.getBackPic());
		a.setKeypositionPic(accident.getKeypositionPic());
		a.setOpplateNo(accident.getOpplateNo());
		a.setStatement(accident.getStatement());*/
		
		acccidentService.addAccident(accident);
		
		return SUCCESS;
	}

}
