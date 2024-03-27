package com.programs;
import java.util.*;
public class Sum_first_n_natural_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=N; i++) {
			sum += i;
		}
		System.out.println("Sum of First " + N + " Natural Numbers is: " + sum);
	}
}
