package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneCollectionsMain {

	public static void main(String[] args) {
        
	    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standaloneCollectionconfig.xml");
        Person person1 = applicationContext.getBean("person1",Person.class);
        System.out.println(person1);
        ((AbstractApplicationContext)applicationContext).close();
	}

}
