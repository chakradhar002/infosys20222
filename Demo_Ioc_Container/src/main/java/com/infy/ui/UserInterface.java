package com.infy.ui;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.bean.Student;
import com.infy.bean.WelcomeBean;
import com.infy.configuration.SpringConfig;

public class UserInterface {
	public static final Log LOGGER = LogFactory.getLog(UserInterface.class);

	public static void main(String[] args) {
         //we are using  ApplicationContext as a Ioc container
		
		
	//	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
	//	WelcomeBean welcomeBean = applicationContext.getBean(WelcomeBean.class);
	//	LOGGER.info(welcomeBean.printWelcome());
		
		ApplicationContext c=  new AnnotationConfigApplicationContext(SpringConfig.class);
		
		
		
		WelcomeBean wb =c.getBean(WelcomeBean.class);
		System.out.println(wb.printWelcome());
		
		LOGGER.info("from logger"+wb.printWelcome());
		
           // Studen s= new Student();
		Student s = c.getBean(Student.class);
		
		s.setName("ram kumar");
		s.showDetails();
		
		//
		System.out.println(s);
		
	}
}
