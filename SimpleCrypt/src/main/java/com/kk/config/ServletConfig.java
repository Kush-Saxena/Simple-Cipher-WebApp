package com.kk.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ServletConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		WebApplicationContext webAppContext = new AnnotationConfigWebApplicationContext();
		((AnnotationConfigWebApplicationContext) webAppContext).register(AppContext.class);

		DispatcherServlet ds = new DispatcherServlet(webAppContext);

		ServletRegistration.Dynamic myServlet = servletContext.addServlet("newDispatcherServlet", ds);
		myServlet.addMapping("/home.com/*");
		myServlet.setLoadOnStartup(1);

	}

}
