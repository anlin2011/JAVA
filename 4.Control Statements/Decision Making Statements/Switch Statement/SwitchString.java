package com.programs;
import java.util.*;
public class SwitchString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your level(Beginner/Intermediate/Expert): ");
		String levelString = sc.next();
		int level = 0;
		switch(levelString) {
		case "Beginner":
			level = 1;
			break;
		case "Intermediate":
			level = 2;
			break;
		case "Expert":
			level = 3;
			break;
		default:
			level = 0;
			break;
		}
		System.out.println("Your level is:" + level);
		sc.close();
	}
}
