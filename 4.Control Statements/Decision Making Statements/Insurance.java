package Programs;
import java.util.Scanner;
public class Insurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marital Status M/U: ");
		char marital = sc.next().charAt(0);
		if(marital=='u' || marital=='U') {
			System.out.println("Enter your gender M/F: ");
			char gender = sc.next().charAt(0);
			System.out.println("Enter your age: ");
			int age = sc.nextInt();
			sc.close();
			if((gender=='m' || gender == 'M') && age>30) {
				System.out.println("You are Eligible for Insurance!!!");
			}
			else if((gender=='f' || gender=='F') && age>25) {
				System.out.println("You are Eligible for Insurance!!!");
			}
			else {
				System.out.println("You are not eligible for Insurance");
			}
		}
		else if(marital == 'm' || marital == 'M') {
			System.out.println("You are Eligible for Insurance!!!");
		}
		else {
			System.out.println("Invalid Input!!!");
		}
		
	}

}
