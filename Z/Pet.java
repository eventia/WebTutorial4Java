package com.ludens.etc;

public class Pet {
	
	static int count = 0;
	String name;

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Pet.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pet() {
		super();
		this.count = this.count + 1;
	}
}
