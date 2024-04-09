package com.programs;
import java.util.*;
public class Donate_Blood {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		if(age>=18) {
			System.out.print("Enter your weight: ");
			int weight = sc.nextInt();
			if(weight > 50) {
				System.out.println("You are eligible to donate blood");
			}
			else {
				System.out.println("You are not eligible to donate blood");
			}
		}
		else {
			System.out.println("Age must be greater than 18");
		}
		sc.close();
	}
}
