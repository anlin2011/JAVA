package com.programs;
import java.util.*;
public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int i=1;
		while(i<=n) {
			System.out.println(i);
			i++;
		}
		sc.close();
	}
}
