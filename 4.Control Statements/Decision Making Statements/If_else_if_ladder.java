package HelloWorld;
import java.util.Scanner;
public class If_else_ladder {

	public static void main(String[] args) {
		float avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Average Mark: ");
		avg = sc.nextFloat();
		sc.close();
		if(avg>=90 && avg<=100) {
			System.out.println("Grade A");
		}
		else if(avg>=80 && avg<=89) {
			System.out.println("Grade B");
		}
		else if(avg>=70 && avg<=79) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Grade D");
		}
	}

}
