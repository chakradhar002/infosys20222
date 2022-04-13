package com.demo.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.address.Address;
import com.demo.student.Student;
import com.demo.util.HibernateUtil;

public class main {

	public static void main(String[] args) {
		//obtained session  here
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
		
			Address address1 = new Address("stree1", "hightechcity", "hyderbad", "500089");
			Address address2 = new Address("stree2", "MG", "hyderbad", "50004");
			Address address3 = new Address("stree3", "ammerpet", "delhi", "7000895");
			// associate name with address
			//injecting the dependency of address here
			Student student1 = new Student("Ram", address1);
			Student student2 = new Student("Tom", address2);
			/// this save is used spring jpa
			session.save(student1);// save or presist here this int db
//insert into student (studentAddress_ADDRESS_Id, STUDENT_NAME) values (?, ?)
			session.save(student2);// save or presist here this int db
			transaction.commit();
		} catch (Exception e) {

			transaction.rollback();
			e.printStackTrace();
			// put ur logger if u need
		}

		finally {

			session.close();
		}

	}

}
