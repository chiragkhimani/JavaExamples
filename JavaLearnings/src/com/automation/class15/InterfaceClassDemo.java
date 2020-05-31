package com.automation.class15;

abstract class X1 {
	abstract void display();
}

abstract class Y1 {
	abstract void eat();
}

interface SearchEngine {
	 void doSearch();
}

interface Company {
	public void getProfit();
}

class Google implements Company, SearchEngine {

	@Override
	public void doSearch() {

	}

	@Override
	public void getProfit() {

	}

}

interface X2 {
	void run();
}

interface Y2 {
	void walk();
}

class Demo {

}

public class InterfaceClassDemo {

}
