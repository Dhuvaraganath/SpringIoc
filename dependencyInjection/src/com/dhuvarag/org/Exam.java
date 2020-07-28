package com.dhuvarag.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		/*
		 * Student s = new Student(); s.setStudentName("dhuv");
		 * System.out.println(s.getStudentName());
		 */
		/*
		 * Student student = new Student(1, "Dhuva"); student.displayStudentName();
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-web.xml");
		Student st= context.getBean("student" , Student.class);
		//st.setStudentName("Dhuvarag");
		//System.out.println(st.getStudentName());
		
		st.displayStudentName();
		Student st2 = context.getBean("student2" ,Student.class);
		st2.displayStudentName();

	}

}
