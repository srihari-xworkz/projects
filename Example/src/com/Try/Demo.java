package com.Try;

public class Demo {
	static int id = 1;
	static String name= "shree";
	
	void method() {
		System.out.println(name);
	}
		
	
	public static void main(String[] args) {
		id=4;
 		System.out.println(id);
 		Demo demo = new Demo();
 		demo.method();
	}
}
