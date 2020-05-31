package com.automation.class16;

class Utility<E> {

	int size;
	int index = 0;

	E data;

	public void printData() {
		System.out.println(data);
	}

	public void setData(E data) {
		this.data = data;
	}

}