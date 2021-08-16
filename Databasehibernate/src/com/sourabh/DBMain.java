package com.sourabh;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBMain {

	public static void main(String[] args) {
		
		//Product prod1 = new Product(123, "Saving", new Date());
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Product.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		try {
			
			//Inserting data in DB using Hibernate
			/*session.beginTransaction();
			
			System.out.println("\nSaving Prod.....");
			session.save(prod1);
			session.getTransaction().commit();*/
			
			//Retriving data from DB using Hibernate
			session.beginTransaction();
			Product prodData = session.get(Product.class, 123);
			System.out.println("\n\nRetrived Student :  " + prodData.getName()+ prodData.getNum());
			session.getTransaction().commit();
			System.out.println("Done..");
			
		} finally {
			session.close();
			factory.close();
		}
	}

}
