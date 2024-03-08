package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionBean {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/constructorInjection/constructorInjectionConfig.xml");
		Person person1 = (Person)applicationContext.getBean("person1");
		Person person2 = (Person)applicationContext.getBean("person2"); 
		Person person3 = (Person)applicationContext.getBean("person3"); 
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		Addition addition1 = (Addition)applicationContext.getBean("addition1");
		addition1.doSum();
		Addition addition2 = (Addition)applicationContext.getBean("addition2");
		addition2.doSum();
		((AbstractApplicationContext) applicationContext).close();
	}

}
