package com.programs;
import java.util.*;
public class ReverseRightHalf_Pyramid {
	public static void printPattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		printPattern(n);
		sc.close();
	}
}
 