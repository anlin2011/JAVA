package com.programs;
import java.util.*;
public class Square_Fill_Pattern {
	public static void printPattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1;j<=n;j++) {
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
