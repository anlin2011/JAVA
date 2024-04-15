package com.programs;
import java.util.*;
public class Right_Half_Pyramid {
	public static void printPattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter n: ");
			int n = sc.nextInt();
			printPattern(n);
		}
	}

}
