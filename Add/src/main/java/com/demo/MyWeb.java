package com.demo;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWeb extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] {HarshaConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}

}

// replace web xml

/*

<!DOCTYPE web-app PUBLIC
 "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
 "http://java.sun.com/dtd/web-app_2_3.dtd" >

<web-app>
  <display-name>Archetype Created Web Application</display-name>
  
   <servlet>
         <servlet-name>harsha</servlet-name>
         <servlet-class>
         org.springframework.web.servlet.DispatcherServlet
         </servlet-class>
   </servlet>
         
   <servlet-mapping>
          <servlet-name>harsha</servlet-name>
          <url-pattern>/</url-pattern>
   </servlet-mapping>
  
 
  
</web-app>



*/