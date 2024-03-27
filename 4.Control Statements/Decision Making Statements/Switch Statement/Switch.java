package com.programs;
import java.util.*;
public class Switch {

	public static void main(String[] args) {
		System.out.println("Menu:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		int num1, num2, choice;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice: ");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.print("Enter number1: ");
			num1 = sc.nextInt();
			System.out.print("Enter number2: ");
			num2 = sc.nextInt();
			System.out.println("Addition: " + (num1 + num2));
			break;
		case 2:
			System.out.print("Enter number1: ");
			num1 = sc.nextInt();
			System.out.print("Enter number2: ");
			num2 = sc.nextInt();
			System.out.println("Subtraction: " + (num1 - num2));
			break;
		case 3:
			System.out.print("Enter number1: ");
			num1 = sc.nextInt();
			System.out.print("Enter number2: ");
			num2 = sc.nextInt();
			System.out.println("Multiplication: " + (num1 * num2));
			break;
		case 4:
			System.out.print("Enter number1: ");
			num1 = sc.nextInt();
			System.out.print("Enter number2: ");
			num2 = sc.nextInt();
			System.out.println("Division: " + (num1 / num2));
			break;
		default:
			System.out.println("Invalid Input!!!");		
		}
		sc.close();
	}

}
