package HelloWorld;

public class Unary_Operators {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 20;
		System.out.println(a); //10
		//a++;
		//System.out.println(a);
		System.out.println(a++); //10(11) 
		System.out.println(a);   //11
		System.out.println(++a); //12
		System.out.println(a--); //12 (11)
		System.out.println(a);  //11
		System.out.println(--a); //10
		System.out.println(b++ + ++c); //10(11) + 21 = 31
		System.out.println(--b + c++); //10 + 21 = 31
	}

}
