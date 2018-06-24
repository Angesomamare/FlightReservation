package com.example.demo.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

//import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class App implements WebApplicationInitializer {
	
	@Override
	public void onStartup(ServletContext servletContext) throws SecurityException{
		AnnotationConfigWebApplicationContext cnt = new AnnotationConfigWebApplicationContext();
		cnt.register(Conf.class);
		ServletRegistration.Dynamic dis = servletContext.addServlet("SpringDispacher", new DispatcherServlet(cnt));
		dis.setLoadOnStartup(1);
		dis.addMapping("/");
	}

/*	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext cnt = new AnnotationConfigWebApplicationContext();
		cnt.register(Conf.class);
		ServletRegistration.Dynamic dis = servletContext.addServlet("SpringDispacher", new DispatcherServlet(cnt));
		dis.setLoadOnStartup(1);
		dis.addMapping("/");
		
	}*/

	
}
