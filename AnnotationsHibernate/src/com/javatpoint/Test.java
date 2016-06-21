/**
 * 
 */
package com.javatpoint;

import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 * @author sagar.cheke
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//we are simply storing the employee object to the database. 
		//Here, we are using the AnnotationConfiguration class to get the information of mapping from the persistent class
		Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setFirstName("John");
		e1.setId(57);
		e1.setLastName("Scomp");
		
	/*	Employee e2 = new Employee();
		e2.setFirstName("Chris");
		e2.setId(311);
		e2.setLastName("Martyn");*/
		
		session.persist(e1);
		//session.persist(e2);
		
		tx.commit();
		session.close();
		System.out.println("Successfully saved.");
	}

}
