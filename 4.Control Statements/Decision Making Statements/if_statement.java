package HelloWorld;

import java.util.Scanner;
public class if_statement {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		age = sc.nextInt();
		if(age>=18) {
			System.out.println("You are eligible to vote..."); //Executes when condition is true
		}
		sc.close();
	}

}
