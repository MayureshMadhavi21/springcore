package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceBean {

	public static void main(String[] args) {
		 
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/reference/referenceconfig.xml");
		Dependent dependent = (Dependent)applicationContext.getBean("dependent");
		Dependent dependent1 = (Dependent)applicationContext.getBean("dependent1");
		Dependent dependent2 = (Dependent)applicationContext.getBean("dependent2");
		System.out.println(dependent);
		System.out.println(dependent.getX());
		System.out.println(dependent.getDependency().getY());
		System.out.println(dependent1);
		System.out.println(dependent2);
		 ((AbstractApplicationContext) applicationContext).close();
	}

}
