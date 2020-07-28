package com.dhuvarag.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext contex =new ClassPathXmlApplicationContext("spring-web.xml"); 
		System.out.println("Config loaded");
		//ApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");
		Airtel air =(Airtel)contex.getBean("airtel"); //give the id
		air.caller();
		air.data();
		Jio jio=contex.getBean("jio" , Jio.class); //without typecast we can give the class name
		jio.caller();
		jio.data();
		
		sim sim1=contex.getBean("sim1" ,sim.class);//call using interface and FQclass name in xml
		sim sim2=contex.getBean("sim2" ,sim.class);
		System.out.println("Sim1");
		sim1.caller();
		sim1.data();
		System.out.println("Sim2");
		sim2.caller();
		sim2.data();
		
		
	}

}
