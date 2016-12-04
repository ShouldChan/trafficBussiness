package org.cxj.bean;

import java.util.Date;

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
@Table(name="traffic_offense")
public class Trafficoffense implements java.io.Serializable{
	private Integer offenseRecordId;
	private String plateNo;
	private String engineNo;
	private String driverId;
	private String ownerName;
	private String illegalReasons;
	private Date illegalDate;
	private Integer isHandled;
	private String punishType;
	
	@Id
	@GenericGenerator(name = "generator", strategy = "native")   @GeneratedValue(generator = "generator")   // 自增长
	@Column(name="offenseRecordId", unique=true,nullable=false)
	public Integer getOffenseRecordId() {
		return offenseRecordId;
	}
	public void setOffenseRecordId(Integer offenseRecordId) {
		this.offenseRecordId = offenseRecordId;
	}
	@Column(name="plateNo",nullable=false)
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	@Column(name="engineNo",nullable=false)
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	@Column(name="driverId",nullable=false)
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	@Column(name="ownerName",nullable=false)
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	@Column(name="illegalReasons",nullable=false)
	public String getIllegalReasons() {
		return illegalReasons;
	}
	public void setIllegalReasons(String illegalReasons) {
		this.illegalReasons = illegalReasons;
	}
	@Column(name="illegalDate",nullable=false)
	public Date getIllegalDate() {
		return illegalDate;
	}
	public void setIllegalDate(Date illegalDate) {
		this.illegalDate = illegalDate;
	}
	@Column(name="isHandled",nullable=false)
	public Integer getIsHandled() {
		return isHandled;
	}
	public void setIsHandled(Integer isHandled) {
		this.isHandled = isHandled;
	}
	@Column(name="punishType",nullable=true)
	public String getPunishType() {
		return punishType;
	}
	public void setPunishType(String punishType) {
		this.punishType = punishType;
	}

}
