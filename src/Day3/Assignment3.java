package Day3;

public class Assignment3 {

	public static void main(String[] args) {
		// Counting number of digits in a number
		
		
		int num = 12234;
		
		int counter  = 0;
		
		while (num!=0) {

			num = num / 10;
			counter++;
		}
		System.out.println(counter);

	}

}
