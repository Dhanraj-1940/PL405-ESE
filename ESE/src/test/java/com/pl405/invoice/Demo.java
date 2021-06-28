package com.pl405.invoice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Demo {

	public static void main(String[] args) {
		
		Customer cust = new Customer();
		
		cust.setId(1);
		cust.setName("Dhanraj");
		cust.setAddress("Goa");
		System.out.println(cust.getName());
		Invoice inv = new Invoice();
		
		inv.setCust(cust);
		//inv.setId(cust.getId());
		inv.setCustomer_name(cust.getName());
		inv.setInvoiceId(101);
		inv.setTotalAmt(10000);
		
		SessionFactory sessionfactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		session.save(inv);
		
		session.getTransaction().commit();
		session.close();
		sessionfactory.close();
	}

}
