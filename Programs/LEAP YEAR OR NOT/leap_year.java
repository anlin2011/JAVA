package HelloWorld;
import java.util.Scanner;
public class leap_year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.print("Enter a year: ");
		year = sc.nextInt();
		sc.close();
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("Year " + year + " is a Leap year.");
		}
		else {
			System.out.println("Year " + year + " is not a Leap year.");
		}
		//Leap Year contains 366 days, which comes once every four years.
		//A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400.
		//A leap year (except a century year) can be identified if it is exactly divisible by 4.
	}
}
