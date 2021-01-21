package com.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Login;

public  class LoginDaoImpl implements LoginDao{
@Autowired
	DataSource datasource;
@Autowired
JdbcTemplate jdbcTemplate;
	
	
	public Login validateUser(Login login) {
		
		String sql="select * from user_table where username='"+login.getUname()+"' and password='"+login.getPass()+ "'";
		
		List<Login> logins=jdbcTemplate.query(sql,new LoginMapper());
		return logins.size() > 0? logins.get(0) : null;
		
	}
	
}

 class LoginMapper implements RowMapper<Login>{

	public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Login login=new Login();
		
		login.getUname();
		login.getPass();
		
		return login;
		
	}
	
	
}
