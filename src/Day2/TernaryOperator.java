package Day2;

public class TernaryOperator {

	public static void main(String[] args) {
		// Ternary operator: ?:
		
		// var = exp ? result1: result2
		
		// Example 1
		
		int a = 50, b= 100;
		
		int x = (a > b)? a : b;
		
		System.out.println(x);	//100
		
		// Example 2
		
		int c = (2 == 2)? 30:50;
		System.out.println(c); 		//30
		
		//Example 3
		
		int person_age = 30;
		String result = (person_age>=18)? "ELigible to vote": "Not Eligible to vote";
		System.out.println(result);
		
		

	}

}
