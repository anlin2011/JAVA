package com.programs;
class Employee {
	int id;
	String name;
	float salary;
	
	void insertRecord(int i, String n, float s ) {
		id = i;
		name = n;
		salary = s;
	}
	
	void displayInformation() {
		System.out.println(id + " " + name + " " + salary);
	}
}
public class Employee1 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		e1.insertRecord(101, "Ashika", 45000);
		e2.insertRecord(102,"Bharathi", 55000);
		e3.insertRecord(103,"Charumathi", 30000);
		e1.displayInformation();
		e2.displayInformation();
		e3.displayInformation();
	}

}
