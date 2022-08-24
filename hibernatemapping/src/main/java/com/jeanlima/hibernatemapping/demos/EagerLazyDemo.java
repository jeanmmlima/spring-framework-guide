package com.jeanlima.hibernatemapping.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jeanlima.hibernatemapping.model.Course;
import com.jeanlima.hibernatemapping.model.Instructor;
import com.jeanlima.hibernatemapping.model.InstructorDetail;

public class EagerLazyDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			// start a transaction
			session.beginTransaction();
			
			// get the instructor from db
			int theId = 1;
			Instructor tempInstructor = session.get(Instructor.class, theId);		
			
			System.out.println("outs: Instructor: " + tempInstructor);
			
			/*
			 * No Fetch Eager os cursos são carregados quando o instrutor é carregado
			 * No Fetch Lazy, os cursos NÃO são carregados quando o instrutor é carregado
			 * MAS se os cursos forem solicitdos antes da sessão ser fechada, acessárá normalmente
			 * 
			 * Caso você tente chamar os curso com a sessão fechada no modo LAZY, vai falhar :(
			 */
			System.out.println("outs: Courses: " + tempInstructor.getCourses());
			
			// commit transaction
			session.getTransaction().commit();
			
			// close the session
			session.close();

			/*
			 * Exemplo de FALHA com sessão fechada e fetch LAZY
			 */
			//System.out.println("outs: Courses: " + tempInstructor.getCourses());
			
			System.out.println("\nouts: The session is now closed!\n");

			// option 1: call getter method while session is open
			
			// get courses for the instructor
			System.out.println("outs: Courses: " + tempInstructor.getCourses());
			
			System.out.println("outs: Done!");
		}
		finally {
			
			// add clean up code
			session.close();
			
			factory.close();
		}
	}

}





