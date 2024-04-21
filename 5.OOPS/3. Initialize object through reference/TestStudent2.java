package com.programs;
class Student2 {
	int reg_no;
	String name;
}
class TestStudent2 {

	public static void main(String[] args) {
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		Student2 s3 = new Student2();
		s1.reg_no = 19104001;
		s1.name = "John";
		s2.reg_no = 19104002;
		s2.name = "Catherin";
		s3.reg_no = 19104003;
		s3.name = "Asha";
		System.out.println(s1.reg_no + " " + s1.name);
		System.out.println(s2.reg_no + " " + s2.name);
		System.out.println(s3.reg_no + " " + s3.name);
	}
}
