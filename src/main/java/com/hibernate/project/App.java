package com.hibernate.project;
import org.hibernate.Session;
import com.hibernate.project.entity.EmployeeEntity;
import com.hibernate.project.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		EmployeeEntity e1 = new EmployeeEntity(30, "Mantavya", "Patel");
		EmployeeEntity e2 = new EmployeeEntity(29, "Rakesh", "Patel");
		EmployeeEntity e3 = new EmployeeEntity(24, "Halak", "Vyas");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(e3);
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	
	}

}
