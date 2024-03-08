package com.springcore.reference;

public class Dependency {
	private int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Dependency(int y) {
		super();
		this.y = y;
	}

	public Dependency() {
		super();
	}

	@Override
	public String toString() {
		return "Depedency [y=" + y + "]";
	}

}
