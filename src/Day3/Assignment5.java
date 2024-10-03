package Day3;

public class Assignment5 {

	public static void main(String[] args) {
		// sum of digits in a number
		
		int num = 12345;
		
		int sum = 0;
		
		while(num!=0) {
			
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
			
		}
		System.out.println("The sum is "+ sum);

	}

}
