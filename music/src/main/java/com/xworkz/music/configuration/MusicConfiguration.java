package com.xworkz.music.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


	@Configuration
	@ComponentScan("com.xworkz.music")
	@EnableWebMvc
	public class MusicConfiguration {

	    MusicConfiguration(){
	        System.out.println("running MusicConfiguration ..");
	    }
	}

