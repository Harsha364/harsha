package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration                   // replace "harshsa-servlet"
@ComponentScan({"com.demo"})     // replace  "component in harshaservlet.xml"
public class HarshaConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		//vr.setPrefix("/WEB-INF");
		vr.setSuffix(".jsp");		
		return vr;
	}
	
}

/*

<?xml version="1.0" encoding="UTF-8"?>  
<beans  
 xmlns="http://www.springframework.org/schema/beans"  
  xmlns:context="http://www.springframework.org/schema/context"
 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  
 xmlns:mvc="http://www.springframework.org/schema/mvc"
 xsi:schemaLocation="http://www.springframework.org/schema/beans
  http://www.springframework.org/schema/beans/spring-beans-4.0.xsd 
  http://www.springframework.org/schema/mvc
  http://www.springframework.org/schema/mvc/spring-mvc-3.0.xsd
  http://www.springframework.org/schema/context
  http://www.springframework.org/schema/context/spring-context-4.0.xsd">
  
  <context:annotation-config></context:annotation-config>
<context:component-scan base-package="com.demo"></context:component-scan>
</beans>

*/