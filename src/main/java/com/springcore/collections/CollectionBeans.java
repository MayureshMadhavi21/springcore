package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CollectionBeans {

	public static void main(String[] args) {
	
		 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		 Employee employee = (Employee)applicationContext.getBean("employee1");
		 System.out.println(employee.getEmployeeName());
		 System.out.println(employee.getPhones());
		 System.out.println(employee.getAddress());
		 System.out.println(employee.getCourses());
		 ((AbstractApplicationContext) applicationContext).close();
	}

}
