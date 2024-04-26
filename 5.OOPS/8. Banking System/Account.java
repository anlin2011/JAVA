package com.programs;

class Account {
	int acc_no;
	String name;
	float amount;
	
	void insert(int a, String n, float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}
	
	void deposit(float amt) {
		amount = amount + amt;
		System.out.println(amt + " deposited.");
	}
	
	void withdraw(float amt) {
		if(amount < amt) {
			System.out.println("Insufficient Balance");
		}
		else {
			amount = amount - amt;
			System.out.println("Amount " + amt + " withdrawn");
		}
	}
	
	void checkBalance() {
		System.out.println("Account Balance is: " + amount);
	}
	
	void display() {
		System.out.println("Account Number: " + acc_no);
		System.out.println("Name: " + name);
		System.out.println("Balance Amount: " + amount + "\n");
	}

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.insert(457829, "John", 10000);
		a1.display();
		a1.checkBalance();
		a1.deposit(25000);
		a1.checkBalance();
		a1.withdraw(15000);
		a1.checkBalance();	
	}
}
