package org.cxj.service.impl;

import org.cxj.bean.Login;
import org.cxj.dao.LoginDao;
import org.cxj.service.LoginService;
/**
 * 
 * @author cxj
 * @date 2016-05-07
 */
public class LoginServiceImpl implements LoginService{
	private LoginDao loginDao;

	public Login GetLogin(String username, String password){
		return loginDao.checkLogin(username, password);
	}
	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
	
	@Override
	public boolean CheckLogin(String name, String password) {
		// TODO Auto-generated method stub
		Login login=loginDao.checkLogin(name, password);
		if(login!=null){
			return true;
		}else{
			return false;
		}
	}

	
}
