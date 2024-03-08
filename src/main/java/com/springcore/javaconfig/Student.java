package com.springcore.javaconfig;

public class Student {
    
	private Subject subject;
	
	@Override
	public String toString() {
		return "Student [subject=" + subject + "]";
	}

	public Student(Subject subject) {
		super();
		this.subject = subject;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public void Study() {
		this.subject.display();
		System.out.println("Studying");
	}
}
