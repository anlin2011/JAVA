package com.programs;
import java.util.*;
public class Printing_first_n_even_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int i=0;
		System.out.println("Printing first " + n + " Even Numbers:");
		while(i<=n)
		{
			System.out.println(i);
			i += 2;
		}
		sc.close();
	}

}
