package com.programs;

public class Ternary_Operator {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int x = 20, y = 5;
		int min = a<b?a:b;
		int max = a>b?a:b;
		int min1 = x<y?x:y;
		int max1 = x>y?x:y;
		System.out.println("Smallest number is: " + min);
		System.out.println("Greatest number is: " + max);
		System.out.println("Smallest number is: " + min1);
		System.out.println("Greatest number is: " + max1);
	}

}
