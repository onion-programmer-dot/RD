package com.rd.interview.java8;

public class DefalutMethodClass implements InterfaceDefalutMethod {

	public static void main(String[] args) {
		DefalutMethodClass dmc = new DefalutMethodClass();
		dmc.testDefalut();
		dmc.testDefalut1();
		
		InterfaceDefalutMethod.testStatic();

	}

}
