package com.springcore.beanLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleMain {

	public static void main(String[] args) {
	
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/beanLifecycle/beanLifecycleConfig.xml");
		Food food1 = (Food)applicationContext.getBean("food1");
		System.out.println(food1);
		Clothes clothes = (Clothes)applicationContext.getBean("cloth");
		System.out.println(clothes);
		House house = (House)applicationContext.getBean("house");
		System.out.println(house);
		 ((AbstractApplicationContext) applicationContext).close();
	}

}
