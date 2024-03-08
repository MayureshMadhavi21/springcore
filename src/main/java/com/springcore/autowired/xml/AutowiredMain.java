package com.springcore.autowired.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredMain {

	public static void main(String[] args) {
	    
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/autowired/xml/autowiredConfig.xml");
		Employee employee = applicationContext.getBean("employee",Employee.class);
		System.out.println(employee);
		((AbstractApplicationContext)applicationContext).close();

	}

}
