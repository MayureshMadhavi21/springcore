package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
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

invoke static method and variable
T(class).method(param)
T(class).variable

create object
new Objectclassname(param)
* */
@Component
public class Demo {
	@Value("#{ 22+ 11}")
	private int x;
	@Value("#{ 1+ 11}")
	private int y;
    
	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private double z;
	
	@Value("#{ T(java.lang.Math).E }")
	private double e;
	
	@Value("#{ T(java.lang.Math).PI }")
	private double pi;
	
	@Value("#{ new java.lang.String('Mayuresh Madhavi') }")
	private String name;
	
	@Value("#{ 8>3 }")  // { expression } > expression which resolves to true/false
	private boolean isActive;

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", pi=" + pi + ", name=" + name + ", isActive="
				+ isActive + "]";
	}
}
