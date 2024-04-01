package Programs;
import java.util.*;
public class Do_while1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int i=1;
		do{
			System.out.println(i);
			i++;
		}while(i<=n);
		sc.close();
	}

}
