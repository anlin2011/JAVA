package HelloWorld;

public class Logical_Operators {

	public static void main(String[] args) {
		int mark1 = 75, mark2 = 30;
		int a=15, b=10, c=30;
		System.out.println("Logical AND: " + (mark1>=35 && mark2>=35)); //true && false = false
		System.out.println("Logical OR: " + (mark1>=35 || mark2>=35));  //true || false = true
		System.out.println(a<b && a++<c); // false && true = false
		System.out.println(a); //15 Because second condition is not checked
		// && -> Doesn't check the second condition if the first condition is false
		System.out.println(a>b || a++<c); //true || true = true
		System.out.println(a); // 15
		// || -> Doesn't check the second condition if the first condition is true
		}

}
