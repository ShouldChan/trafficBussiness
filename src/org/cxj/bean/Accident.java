package org.cxj.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * @author cxj
 * @date 2016-04-26
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="accident")
public class Accident implements java.io.Serializable{
	private Integer accidentId;
	private String driverName;
	private String driverPhone;
	private String driverId;
	private String plateNo;
	private String vehicleType;
	private String accidentPlace;
	private String insurCom;
	private String insurNo;
	private byte[] drivercardPic=new byte[1024];
	private byte[] carcardPic=new byte[1024];
	private byte[] insurPic=new byte[1024];
	private byte[] frontPic=new byte[1024];
	private byte[] backPic=new byte[1024];
	private byte[] keypositionPic=new byte[1024];
	private String opplateNo;
	private String statement;
	
	@Id
	@GenericGenerator(name = "generator", strategy = "native")   
	@GeneratedValue(generator = "generator")   // 设置自增
	@Column(name="accidentId",nullable=false)
	public Integer getAccidentId() {
		return accidentId;
	}
	public void setAccidentId(Integer accidentId) {
		this.accidentId = accidentId;
	}
	@Column(name="driverName",nullable=false)
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	@Column(name="driverPhone",nullable=false)
	public String getDriverPhone() {
		return driverPhone;
	}
	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}
	@Column(name="driverId",nullable=false)
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	@Column(name="plateNo",nullable=false)
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	@Column(name="vehicleType",nullable=false)
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	@Column(name="accidentPlace",nullable=false)
	public String getAccidentPlace() {
		return accidentPlace;
	}
	public void setAccidentPlace(String accidentPlace) {
		this.accidentPlace = accidentPlace;
	}
	@Column(name="insurCom",nullable=true)
	public String getInsurCom() {
		return insurCom;
	}
	public void setInsurCom(String insurCom) {
		this.insurCom = insurCom;
	}
	@Column(name="insurNo",nullable=true)
	public String getInsurNo() {
		return insurNo;
	}
	public void setInsurNo(String insurNo) {
		this.insurNo = insurNo;
	}
	@Column(name="drivercardPic",nullable=true)
	public byte[] getDrivercardPic() {
		return drivercardPic;
	}
	public void setDrivercardPic(byte[] drivercardPic) {
		this.drivercardPic = drivercardPic;
	}
	@Column(name="carcardPic",nullable=true)
	public byte[] getCarcardPic() {
		return carcardPic;
	}
	public void setCarcardPic(byte[] carcardPic) {
		this.carcardPic = carcardPic;
	}
	@Column(name="insurPic",nullable=true)
	public byte[] getInsurPic() {
		return insurPic;
	}
	public void setInsurPic(byte[] insurPic) {
		this.insurPic = insurPic;
	}
	@Column(name="frontPic",nullable=true)
	public byte[] getFrontPic() {
		return frontPic;
	}
	public void setFrontPic(byte[] frontPic) {
		this.frontPic = frontPic;
	}
	@Column(name="backPic",nullable=true)
	public byte[] getBackPic() {
		return backPic;
	}
	public void setBackPic(byte[] backPic) {
		this.backPic = backPic;
	}
	@Column(name="keypositionPic",nullable=true)
	public byte[] getKeypositionPic() {
		return keypositionPic;
	}
	public void setKeypositionPic(byte[] keypositionPic) {
		this.keypositionPic = keypositionPic;
	}
	@Column(name="opplateNo",nullable=false)
	public String getOpplateNo() {
		return opplateNo;
	}
	public void setOpplateNo(String opplateNo) {
		this.opplateNo = opplateNo;
	}
	@Column(name="statement",nullable=true)
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	

}
