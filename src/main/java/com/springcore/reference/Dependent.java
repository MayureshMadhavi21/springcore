package com.springcore.reference;

public class Dependent {
	private int x;
	private Dependency dependency;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Dependency getDependency() {
		return dependency;
	}

	public void setDependency(Dependency dependency) {
		this.dependency = dependency;
	}

	public Dependent(int x, Dependency dependency) {
		super();
		this.x = x;
		this.dependency = dependency;
	}

	public Dependent() {
		super();
	}

	@Override
	public String toString() {
		return "Dependent [x=" + x + ", dependency=" + dependency + "]";
	}

}
