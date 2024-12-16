package com.xworkz.courseRegistration.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

 
	 @Configuration
		@ComponentScan("com.xworkz.courseRegistration")
		@EnableWebMvc
		public class CourseConfiguration {

		    CourseConfiguration(){
		    System.out.println("running CourseConfiguration ..");
		    }
		    @Bean
		    public LocalContainerEntityManagerFactoryBean localcontainerEntityManagerBean() {
		    LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		    bean.setPackagesToScan("com.xworkz.courseRegistration.entity");
		    bean.setDataSource(dataSource());
		    bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		    return bean;
		    	
		    }
		    @Bean
		    public DataSource dataSource() {
		    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
		    	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		    	dataSource.setUrl("jdbc:mysql://localhost:3306/coursedata");
		    	dataSource.setUsername("root");
		    	dataSource.setPassword("xworkzodc");
		    	return dataSource;
		    	
		    }
		    
		}



