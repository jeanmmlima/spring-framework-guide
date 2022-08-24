package com.jeanlima.hibernatemapping.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jeanlima.hibernatemapping.model.Course;
import com.jeanlima.hibernatemapping.model.Instructor;
import com.jeanlima.hibernatemapping.model.InstructorDetail;

public class DeleteCourseDemo {

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
			
			// get a course
			int theId = 10;
			Course tempCourse = session.get(Course.class, theId);
			
			// delete course
			System.out.println("Deleting course: " + tempCourse);
			
			session.delete(tempCourse);

			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			
			// add clean up code
			session.close();
			
			factory.close();
		}
	}

}





