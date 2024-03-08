package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StereotypeMain {

	public static void main(String[] args) {
	
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereotypeConfig.xml");
		Student student = applicationContext.getBean("student",Student.class);
		System.out.println(student);
		System.out.println(student.hashCode());
		Student student1 = applicationContext.getBean("student",Student.class);
		System.out.println(student1);
		System.out.println(student1.hashCode());
		Teacher teacher = applicationContext.getBean("teacher",Teacher.class);
		System.out.println(teacher);
		System.out.println(teacher.hashCode());
		Teacher teacher1 = applicationContext.getBean("teacher",Teacher.class);
		System.out.println(teacher1);
		System.out.println(teacher1.hashCode());
		((AbstractApplicationContext)applicationContext).close();
	}

}
/*
  Bean Scope > singleton(bydefault) , prototype , request , session , globalsession
  Singletone - single object is creted and that same object is given everytime it is fetch using context
  prototype - new object is created everytime
  
  configure bean scope
  
  <bean class="" name="" scope=""/>  --> using xml
  
  @Component
  @Scope(" ")   ----> using annotation
  Class Student { }
  
  
 */
