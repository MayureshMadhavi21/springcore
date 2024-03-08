package com.springcore.constructorInjection;

public class Person {
  
	private String personName;
	private int personId;
	private Certificate certificate;
	public Person(String personName, int personId,Certificate certificate) {
		super();
		this.personName = personName;
		this.personId = personId;
		this.certificate = certificate;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return this.personName + " : " + this.personId + " : " +this.certificate.certiName;
	}
}
