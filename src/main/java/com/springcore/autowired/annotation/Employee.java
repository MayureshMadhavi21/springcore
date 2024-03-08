package com.springcore.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("tempAddress") // for avoiding error >No qualifying bean of type
	private Address address; // 'com.springcore.autowired.annotation.Address' available: expected single
								// matching bean but found 2: tempAddress,temp2

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
//Autowired annotation can be used on property name(recommended) , setter method , constructor.
}
