package com.programs;
import java.util.*;
public class Leap_year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		if(((year%4==0) && (year%100!=0)) || (year%400==0)) {
			System.out.println(year + " is a Leap Year");
		}
		else {
			System.out.println(year + " is a Common Year");
		}
	}

}
