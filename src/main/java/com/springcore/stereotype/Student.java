package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/* 
 SpEL - Spring Expression Language
 supports parsing and executing expression with the help of @Value annotation
 @Value("#{expression}")
 
 expression can be classes,variable,methods,constructors and objects
 and symbols
 char,numerics,operators,keywords and special symbols which return a value
 @Value("#{11+22}") > 33 injected to obj
 @Value("#{8 > 6 ? 88 : 55}") > 88 injected to obj
 
 * */
@Component
@Scope("prototype")
public class Student {
	@Value("Mayuresh")
	private String studentName;
	@Value("Mumbai")
	private String city;

	@Value("#{mySubjects}")
	private List<String> subjects;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", subjects=" + subjects + "]";
	}

}
