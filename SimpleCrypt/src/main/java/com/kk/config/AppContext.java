package com.kk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = { "com.kk.util", "com.kk.controller" })
public class AppContext {

	@Bean
	public InternalResourceViewResolver getInternalVR() {
		InternalResourceViewResolver iRvr = new InternalResourceViewResolver();
		iRvr.setPrefix("/WEB-INF/views/");
		iRvr.setSuffix(".jsp");

		return iRvr;

	}

}
