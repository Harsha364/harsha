package com.controller;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.service.LoginServiceImpl;

@Configuration                   // replace "login-servlet"
@ComponentScan({"com.controller"})     // replace  "component in loginservlet.xml"
public class LoginConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		//vr.setPrefix("/WEB-INF");
		vr.setSuffix(".jsp");		
		return vr;
	}
	
	
	
	@Bean
	public DataSource datasource() {
		DataSource d=new DataSource();
		d.setDriverClassName("org.postgresql.Driver");
		d.setUrl("jdbc:postgresql://localhost:5432/postgres");
		d.setUsername("postgres");
		d.setPassword("12345");
		return d;
		
		
	}
	
}