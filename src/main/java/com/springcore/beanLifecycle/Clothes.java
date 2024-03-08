package com.springcore.beanLifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Clothes implements InitializingBean,DisposableBean{
 
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Clothes() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Clothes [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		//InitializingBean init
       System.out.println("Inside InitializingBean afterPropertiesSet Init");		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//DisposableBean destroy
		System.out.println("Inside DisposableBean destroy");
	}
	
}
