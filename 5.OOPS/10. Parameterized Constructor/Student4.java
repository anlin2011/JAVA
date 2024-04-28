package com.programs;
class Student4 {
	int reg_no;
	String name;
	String email;	
	Student4(int r, String n, String e) {
		reg_no = r;
		name = n;
		email = e;
	}
	void display() {
		System.out.println("Register Number: " + reg_no);
		System.out.println("Name: " + name);
		System.out.println("Email ID: " + email + "\n");
	}
	public static void main(String[] args) {
		Student4 s1 = new Student4(101001, "Lighty", "lighty12@gmail.com");
		Student4 s2 = new Student4(101002, "Nikitha", "niki11@gmail.com");
		s1.display();
		s2.display();
	}
}
