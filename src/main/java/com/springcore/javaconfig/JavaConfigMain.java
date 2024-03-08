package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class JavaConfigMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		//incase component annotation is used camelcase class name is id
		//Student student = applicationContext.getBean("student",Student.class); 
		
		//when Bean annotation is used method name is id
		Student student = applicationContext.getBean("getStudent",Student.class); 
		System.out.println(student);
		student.Study();
		((AbstractApplicationContext)applicationContext).close();
	}

}
