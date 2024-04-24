package com.programs;
class Rectangle {
	int length;
	int breadth;
	void insertRecord(int l, int b) {
		length = l;
		breadth = b;
	}
	void calculateArea() {
		System.out.println(length * breadth);
	}
}

public class Rectangle1 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.insertRecord(12, 20);
		r2.insertRecord(2, 3);
		r1.calculateArea();
		r2.calculateArea();
	}
}
