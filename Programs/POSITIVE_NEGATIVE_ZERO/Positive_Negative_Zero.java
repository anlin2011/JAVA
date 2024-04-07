package com.programs;
import java.util.*;
public class Positive_Negative_Zero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		if(number > 0) {
			System.out.println("Positive");
		}
		else if(number < 0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
	}

}
