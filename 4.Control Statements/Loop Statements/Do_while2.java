package Programs;
import java.util.*;
public class Do_while2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int i = 0;
		do {
			System.out.println(i);
			i += 2;
		} while(i<=n);
		sc.close();
	}

}
