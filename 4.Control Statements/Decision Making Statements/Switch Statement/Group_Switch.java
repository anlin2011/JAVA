package com.programs;
import java.util.*;
public class Group_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char choice = sc.next().charAt(0);
		switch(choice) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(choice + " is an Vowel");
			break;
		default:
			System.out.println(choice + " is a Consonant");
		}
		sc.close();
	}

}
