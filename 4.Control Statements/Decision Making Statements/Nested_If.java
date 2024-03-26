package com.programs;

public class Nested_If {

	public static void main(String[] args) {
		String address = "Chennai, India";
		
		if(address.endsWith("India")) {
			if(address.contains("Banglore")) {
				System.out.println("Your city is Banglore");
			}
			else if(address.contains("Hyderabad")) {
				System.out.println("Your city is Hyderabad");
			}
			else {
				System.out.println(address.split(",")[0]);
			}
		}
		else {
			System.out.println("You are not living in India!");
		}

	}

}
