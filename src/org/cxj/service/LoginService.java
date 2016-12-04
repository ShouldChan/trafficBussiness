package org.cxj.service;

import org.cxj.bean.Login;

/**
 * 
 * @author cxj
 * @date 2016-05-07
 */
public interface LoginService {
	//登录
	public Login GetLogin(String name, String password);
	//checkLogin
	public boolean CheckLogin(String name, String password);
	
}
