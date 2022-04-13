package com.demo.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
// this class i used for create intilizing session
public class HibernateUtil {
	
	private static SessionFactory sessionfactory=null ;
	static {
		try {
			sessionfactory = new AnnotationConfiguration().configure().buildSessionFactory();
		}catch(Exception e){
			
			throw new ExceptionInInitializerError(e);
		}
	}
		 public static SessionFactory getSessionFactory() {
			 return sessionfactory;
		 }
		
}
