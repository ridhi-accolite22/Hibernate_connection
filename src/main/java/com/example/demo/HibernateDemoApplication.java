package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;


public class HibernateDemoApplication {
	private static SessionFactory sessionFactory;



	public static void main(String[] args) {
		//File f = new File("C:\\Users\\manish.k\\Downloads\\hibernateDemo\\hibernateDemo\\src\\main\\resources\\hibernate1.cfg.xml");
		Configuration config = new Configuration();
		config.addAnnotatedClass(Employee.class);
		config.configure("hibernate.cfg.xml");
		//ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		//SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session s = sessionFactory.openSession();
		Employee e = new Employee();
		e.setId(4);
		e.setName("Ridhi Kar");
		e.setRole("SDE");
		e.setSalary(65000);
		s.beginTransaction();
		s.save(e);
		s.getTransaction().commit();
		SpringApplication.run(HibernateDemoApplication.class, args);
	}

}