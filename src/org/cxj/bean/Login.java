package org.cxj.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Administrator
 *
 */

@Entity                        // 表示为实体类
@Table(name="manager")       // 表名注解
public class Login implements java.io.Serializable{
	
	private Integer managerId;
	private String managerName;
	private String managerPassword;

	@Id 
	@GenericGenerator(name = "generator", strategy = "native")   @GeneratedValue(generator = "generator")   // 表示自增长
	@Column(name="managerId", unique=true,nullable=false)      // 类属性一一对应表字段managerId
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	@Column(name="managerName",nullable=false)            //managerName
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	@Column(name="managerPassword",nullable=false)         //managerPassword
	public String getManagerPassword() {
		return managerPassword;
	}
	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}
	
	//无参构造函数
	public Login(){}
	//含参构造函数
	public Login(String managerName, String managerPassword){
		this.managerName=managerName;
		this.managerPassword=managerPassword;
	}
	
}
