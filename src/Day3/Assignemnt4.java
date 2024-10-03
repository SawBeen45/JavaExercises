package Day3;

public class Assignemnt4 {

	public static void main(String[] args) {
		// Count number of even and odd number in a number
		
		int num = 120;
		
		int evencount = 0;
		
		int oddcount = 0;
		
		while (num!=0) {
			int digit = num % 10;
			if (digit % 2 == 0)
				evencount++;
			else
				oddcount++;
			num = num / 10;
			
		}
		System.out.println("The even count is "+evencount );
		System.out.println("The odd count is "+oddcount );

	}

}
