package com.programs;

public class Continue {

	public static void main(String[] args) {
		for(int i=1;i<=2;i++) {
			for(int j=i;j<=5;j++) {
				if(j==3) {
					continue;
				}
				System.out.print(j + " ");
			}
		}
	}

}
