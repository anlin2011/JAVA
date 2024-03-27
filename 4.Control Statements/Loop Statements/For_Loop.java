package Programs;
import java.util.*;
public class For_Loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		sc.close();
	}

}
