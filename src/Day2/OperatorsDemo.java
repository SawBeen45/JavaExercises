package Day2;

public class OperatorsDemo {

	public static void main(String[] args) {
		// Arithmetic Operators
		
		int a = 25, b = 15;
		
		
		System.out.println("Sum of a and b is: "+ (a+b));
		System.out.println("Difference of a and b is: "+ (a-b));
		System.out.println("Multiplication of a and b is: "+ (a*b));
		System.out.println("Division of a and b is: "+ (a/b));
		System.out.println("Modulo division of a and b is: "+ (a%b));
		
		//Relational Operators
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//Logical Operators
		
		boolean x = true;
		boolean y = false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(! y);
		
		System.out.println((100>20) && (30>25));
		
		

	}

}
