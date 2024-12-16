package com.xworkz.xworkz_admin_details.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



	public class XworkzWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	    @Override
	    protected Class<?>[] getRootConfigClasses() {
	        return new Class[0];
	    }

	    @Override
	    protected Class<?>[] getServletConfigClasses() {
	        return new Class[] { XworkzConfiguration.class };
	    }

	    @Override
	    protected String[] getServletMappings() {
	        return new String[] {"/"};
	    }

	    @Override
	    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	        //WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
	        configurer.enable();
	    }
	}





