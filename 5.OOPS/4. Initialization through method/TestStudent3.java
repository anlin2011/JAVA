package com.programs;
class Student3 {
	int reg_no;
	String name;
void insertRecord(int r, String n) {
	reg_no = r;
	name = n;
}
void displayInformation() {
	System.out.println(reg_no + " " + name );
}
}

public class TestStudent3 {
	public static void main(String[] args) {
		Student3 s1 = new Student3();
		Student3 s2 = new Student3();
		s1.insertRecord(17101001, "Asha");
		s2.insertRecord(17101002, "Bharathi");
		s1.displayInformation();
		s2.displayInformation();
	}
}
