package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.javaconfig") > required when @Component is used on class
public class JavaConfiguration {
    
	@Bean
	public Student getStudent() {
		return new Student(getSubject());
	}
	
	@Bean
	public Subject getSubject() {
		return new Subject();
	}
}
