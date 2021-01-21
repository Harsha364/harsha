package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.LoginDao;
import com.model.Login;

public abstract class LoginServiceImpl implements LoginService{
	@Autowired
	LoginDao loginDao; 
	
	public Login validateUser(Login login) {
		
		return loginDao.validateUser(login);
		
	}

}
