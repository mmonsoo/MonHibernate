package com.mmonsoor;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mmonsoor.entity.Employee;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exempleTest();
	}
	
	public static void exempleTest() {
		
		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure().buildSessionFactory();
		//Ouverture session
		Session session = sessionFactory.openSession() ;
		
	/*	
		Employee employe1=new Employee("Misharl","Monsoor",10000);
		Employee employe2=new Employee("Camille","Pochard",50000);
		//Preparation de la construction de sessions
		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure().buildSessionFactory();
		//Ouverture session
		Session session = sessionFactory.openSession() ;
		//Fermeture session
		session.beginTransaction();
		session.save(employe1);
		session.save(employe2);
		session.getTransaction().commit();
		
		// Mis à jour d'un employé
		employe1.setSalary(20000);
		session.beginTransaction();
		session.update(employe1);
		session.getTransaction().commit();
		session.close();
		
	
		
		Employee employe3=new Employee("Jim","Carrey",4000);
		session.beginTransaction();
		int IDem=(int)session.save(employe3);
		session.getTransaction().commit();
		
		
		session.beginTransaction();
		Employee em=session.get(Employee.class, IDem);
		System.out.println(em);
		session.getTransaction().commit();
		  
		
		
		session.beginTransaction();
		List <Employee> result=session.createQuery("from Employee").list();
		
		for(Employee e:result) {
			System.out.println(e);
		}
		
		session.getTransaction().commit();
		
			
		
		//####### SUppression grace à l'ID dans la base de données
		session.beginTransaction();
		Employee em=session.get(Employee.class, 7);
		System.out.println(em);
		session.delete(em);
		session.getTransaction().commit();
		
	
		
		//####### Trouver par mot clé
		String mc="ish";
		session.beginTransaction();
		Query query=session.createQuery("select e from Employee e where e.firstName like :nom");
		query.setParameter("nom","%" + mc + "%" );
		List <Employee> listeResultats=query.getResultList();
		for(Employee e:listeResultats) {
			System.out.println(e);
		}
		
	
		Employee employe4=new Employee("John","Doe",1000);
		session.beginTransaction();
		session.save(employe4);
		session.getTransaction().commit();
		session.close();
		
		*/
		
		Employee employe5=new Employee("Riri","Fifi",20);
		session.beginTransaction();
		session.save(employe5);
		session.getTransaction().commit();
		session.close();
		
	}
}
