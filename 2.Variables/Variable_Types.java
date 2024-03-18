package com.programs;

public class Variable_Types {
	static int num = 100; //static variable
	
	void method() {
		int num1 = 200; //local variable
		System.out.println("Num1: " + num1);
	}
	public static void main(String[] args) {
		int num2 = 300; //instance variable
		
		System.out.println("Num: " + num);
		
		Variable_Types n = new Variable_Types();
		n.method();
		
		System.out.println("Num2: " + num2);
		
	}
}
