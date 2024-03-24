package HelloWorld;

public class Bitwise_Operators {

	public static void main(String[] args) {
		int a=2, b=3;
		// 2->0010 
		// 3->0011
		System.out.println("Bitwise AND: " + (a&b)); // 2&3 = 0010 = 2
		System.out.println("Bitwise OR: " + (a|b));  // 2|3 = 0011 = 3
		System.out.println("Bitwise XOR: " + (a^b)); // 2^3 = 0001 = 1
	}

}
