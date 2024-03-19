package com.programs;

/*Widening Casting
 	byte -> short -> char -> int -> long -> float -> double
  Narrowing Casting
  	double -> float -> long -> int -> char -> short -> byte
 */

public class Casting {

	public static void main(String[] args) {
		int a = 10;
		double b = a; //widening casting

		double c = 25.5376;
		int d = (int)c; //narrowing casting
		
		float e = 15.6f;
		int f = (int)e;
		
		System.out.println("Widening Typecasting");
		System.out.println("Integer:" + a);
		System.out.println("Double:" + b);
		
		System.out.println("\nNarrowing Typecasting");
		System.out.println("Double:" + c);
		System.out.println("Integer:" + d);	
		
		System.out.println("\nFloat:" + e);
		System.out.println("Integer:" + f);
	}
}
