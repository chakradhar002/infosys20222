package com.infy.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import com.infy.bean.Student;
import com.infy.bean.WelcomeBean;
//this is the replacement of XML  based 
// to configure the dependecy class we used @configuration annotation
@Configuration
public class SpringConfig {
	//this annotation  @Bean will use to inject the class of WelcomeBean
	@Bean
	public WelcomeBean welcomeBean() {// create new object for you
		return new WelcomeBean();
	}
	// i need a new object for my student class
	@Bean
	public Student myStudent() {// create new object for you
		return new Student();
	}
	
     
}