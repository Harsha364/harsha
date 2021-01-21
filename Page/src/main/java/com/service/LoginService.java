package com.service;

import org.apache.tomcat.jni.User;

import com.model.Login;

public interface LoginService {
	

	Login validateUser(Login login);

	

	

}
