package org.cxj.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.cxj.dao.LoginDao;
import org.cxj.service.LoginService;
import org.springframework.web.HttpSessionRequiredException;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @author cxj
 * @date 2016/04/24
 * 
 */
public class LoginAction extends ActionSupport{
	private LoginService loginService;
	@Resource
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	private boolean bool;
	private String username;
	private String password;
	
	public boolean isBool() {
		return bool;
	}
	public void setBool(boolean bool) {
		this.bool = bool;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute(){
		
		bool=loginService.CheckLogin(username, password);
		if(bool==true){
			HttpServletRequest request = ServletActionContext.getRequest();  
			HttpSession session= request.getSession();  //获取session值
			session.setAttribute("username", username);
			return SUCCESS;
		}else{
			addFieldError("username", "用户名或密码错误！");
			return INPUT;
		}
	}
	
	@Override
	public void validate() {   //判断用户名和密码是否合法 
		if(username.length()<3||username.length()>18){
			addFieldError("username", "用户名长度在3-18");
		}
		if(password.length()<3||password.length()>18){
			addFieldError("username", "密码长度在3-18");
		}
	}
	
	

}
