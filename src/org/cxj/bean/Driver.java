package org.cxj.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author cxj
 * @date 2016-04-26
 */
@SuppressWarnings("serial")
@Entity
@Table(name="driver_card")
public class Driver implements java.io.Serializable {
	private String driverId;
	private String driverRecordId;
	private String driverName;
	private Integer driverSex;
	private String driverNationality;
	private String driverAddress;
	private Date dateOfBirth;
	private Date dateOfFirstIssue;
	private String carClass;
	
	private Set<Car> car=new HashSet<Car>();
	//private Set<Accident> accident=new HashSet<Accident>();
	private Set<Trafficoffense> trafficoffense=new HashSet<Trafficoffense>();

	@Id
	@GeneratedValue
	@Column(name="driverId", unique=true, nullable=false)
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	
	
	/**
	 * 实现和car表单向一对一的外键关联映射
	 * @return
	 */
	@OneToMany
	@JoinColumn(name="driverId")
	public Set<Car> getCar() {
		return car;
	}
	public void setCar(Set<Car> car) {
		this.car = car;
	}
	/**
	 * 实现和accident表单向一对多的主键关联映射
	 * @return
	 */
	/*@OneToMany
	@JoinColumn(name="driverId")
	public Set<Accident> getAccident() {
		return accident;
	}
	public void setAccident(Set<Accident> accident) {
		this.accident = accident;
	}*/
	/**
	 * 实现和Traffic_offense表的一对多主键关联映射
	 * @return
	 */
	@OneToMany
	@JoinColumn(name="driverId")
	public Set<Trafficoffense> getTrafficoffense() {
		return trafficoffense;
	}
	public void setTrafficoffense(Set<Trafficoffense> trafficoffense) {
		this.trafficoffense = trafficoffense;
	}
	
	@Column(name="driverRecordId",nullable=false)
	public String getDriverRecordId() {
		return driverRecordId;
	}
	public void setDriverRecordId(String driverRecordId) {
		this.driverRecordId = driverRecordId;
	}
	@Column(name="driverName",nullable=false)
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	@Column(name="driverSex",nullable=false)
	public Integer getDriverSex() {
		return driverSex;
	}
	public void setDriverSex(Integer driverSex) {
		this.driverSex = driverSex;
	}
	@Column(name="driverNationality",nullable=false)
	public String getDriverNationality() {
		return driverNationality;
	}
	public void setDriverNationality(String driverNationality) {
		this.driverNationality = driverNationality;
	}
	@Column(name="driverAddress",nullable=false)
	public String getDriverAddress() {
		return driverAddress;
	}
	public void setDriverAddress(String driverAddress) {
		this.driverAddress = driverAddress;
	}
	@Column(name="dateOfBirth",nullable=false)
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Column(name="dateOfFirstIssue",nullable=false)
	public Date getDateOfFirstIssue() {
		return dateOfFirstIssue;
	}
	public void setDateOfFirstIssue(Date dateOfFirstIssue) {
		this.dateOfFirstIssue = dateOfFirstIssue;
	}
	@Column(name="carClass",nullable=false)
	public String getCarClass() {
		return carClass;
	}
	public void setCarClass(String carClass) {
		this.carClass = carClass;
	}


}
