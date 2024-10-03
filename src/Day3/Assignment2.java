package Day3;

public class Assignment2 {

	public static void main(String[] args) {
		// Palindrome number
		
		
		int num = 1234321;
		int rev = 0;
		int original = num;
		
		while (num!=0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		if (original == rev)
			System.out.println("It is palindrom");
		else
			System.out.println("It is not palindrome");

	}

}
