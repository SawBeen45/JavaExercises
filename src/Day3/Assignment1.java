package Day3;

public class Assignment1 {

	public static void main(String[] args) {
		// Reverse a number
		
		int num = 1234;
		int rev = 0;
		
		while (num!=0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
			
		}
		System.out.println(rev);

	}

}
