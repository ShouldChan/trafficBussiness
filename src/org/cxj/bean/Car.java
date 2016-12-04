package org.cxj.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author cxj
 * @date 2016-04-26
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name="car_card")
public class Car implements java.io.Serializable{
	private String plateNo;
	private String driverId;
	private String vehicleType;
	private String ownerName;
	private String ownerAddress;
	private String useCharacter;
	private String carModel;
	private String carVIN;
	private String engineNo;
	private Date registerDate;
	private Date issueDate;
	private String carRecordId;
	private Integer permittedNo;
	private Integer totalWeight;
	private Integer curbWeight;
	private Integer permittedWeight;
	private String outsideDimensions;
	private Integer totalWeightofQtraction;
	private String carRemarks;
	private String testRecord;
	
	private Driver driver;
	//private Set<Accident> accident;
	private Set<Trafficoffense> trafficoffense;

	@Id
	@GeneratedValue
	@Column(name="plateNo", nullable=false)
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	
	/**
	 * 实现和driver表的单向一对一主键关联映射
	 * @return
	 */
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="driverId", unique=true) 
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	/**
	 * 实现和Accident表的单向一对多关联主键映射
	 * @return
	 */
	/*@OneToMany
	@JoinColumn(name="plateNo")
	public Set<Accident> getAccident() {
		return accident;
	}
	public void setAccident(Set<Accident> accident) {
		this.accident = accident;
	}*/
	
	/**
	 * 实现和traffic_offense表的单向一对多主键关联映射
	 * @return
	 */
	@OneToMany
	@JoinColumn(name="plateNo")
	public Set<Trafficoffense> getTrafficoffense() {
		return trafficoffense;
	}
	public void setTrafficoffense(Set<Trafficoffense> trafficoffense) {
		this.trafficoffense = trafficoffense;
	}
	@Column(name="driverId", nullable=false,insertable=false,updatable=false)//
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	@Column(name="vehicleType",nullable=false)
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	@Column(name="ownerName",nullable=false)
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	@Column(name="ownerAddress",nullable=false)
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	@Column(name="useCharacter",nullable=false)
	public String getUseCharacter() {
		return useCharacter;
	}
	public void setUseCharacter(String useCharacter) {
		this.useCharacter = useCharacter;
	}
	@Column(name="carModel",nullable=false)
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	@Column(name="carVIN",nullable=false)
	public String getCarVIN() {
		return carVIN;
	}
	public void setCarVIN(String carVIN) {
		this.carVIN = carVIN;
	}
	@Column(name="engineNo",nullable=false)
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	@Column(name="registerDate",nullable=false)
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	@Column(name="issueDate",nullable=false)
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	@Column(name="carRecordId",nullable=false)
	public String getCarRecordId() {
		return carRecordId;
	}
	public void setCarRecordId(String carRecordId) {
		this.carRecordId = carRecordId;
	}
	@Column(name="permittedNo",nullable=false)
	public Integer getPermittedNo() {
		return permittedNo;
	}
	public void setPermittedNo(Integer permittedNo) {
		this.permittedNo = permittedNo;
	}
	@Column(name="totalWeight",nullable=false)
	public Integer getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(Integer totalWeight) {
		this.totalWeight = totalWeight;
	}
	@Column(name="curbWeight",nullable=false)
	public Integer getCurbWeight() {
		return curbWeight;
	}
	public void setCurbWeight(Integer curbWeight) {
		this.curbWeight = curbWeight;
	}
	@Column(name="permittedWeight",nullable=true)
	public Integer getPermittedWeight() {
		return permittedWeight;
	}
	public void setPermittedWeight(Integer permittedWeight) {
		this.permittedWeight = permittedWeight;
	}
	@Column(name="outsideDimensions",nullable=true)
	public String getOutsideDimensions() {
		return outsideDimensions;
	}
	public void setOutsideDimensions(String outsideDimensions) {
		this.outsideDimensions = outsideDimensions;
	}
	@Column(name="totalWeightofQtraction",nullable=true)
	public Integer getTotalWeightofQtraction() {
		return totalWeightofQtraction;
	}
	public void setTotalWeightofQtraction(Integer totalWeightofQtraction) {
		this.totalWeightofQtraction = totalWeightofQtraction;
	}
	@Column(name="carRemarks",nullable=true)
	public String getCarRemarks() {
		return carRemarks;
	}
	public void setCarRemarks(String carRemarks) {
		this.carRemarks = carRemarks;
	}
	@Column(name="testRecord",nullable=false)
	public String getTestRecord() {
		return testRecord;
	}
	public void setTestRecord(String testRecord) {
		this.testRecord = testRecord;
	}
	
}
