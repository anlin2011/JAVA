package com.programs;
import java.util.*;
public class Ternary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		String output = (num%2==0) ? "Even Number" : "Odd Number";
		System.out.println(output);
		sc.close();
	}

}
