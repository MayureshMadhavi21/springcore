package com.springcore.beanLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class House {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public House() {
		super();
	}

	@Override
	public String toString() {
		return "House [price=" + price + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("Init postcontruct method");
	}

	@PreDestroy
	public void end() {
		System.out.println("destroy predestroy method");
	}
}
