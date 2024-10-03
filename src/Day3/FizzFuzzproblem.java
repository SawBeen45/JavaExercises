package Day3;

public class FizzFuzzproblem {

	public static void main(String[] args) {
		/*
		 Write a problem to print 1 to 30;
		 if the number is divisible by 3, print 'fizz'
		 if the number is divisible by 5, print 'buzz'
		 if the number is divisible by 3 and 5, print 'fizzbuzz'
		 if the number is not divisible by 3 and 5, print the numbers
		 */
		
		for (int i = 1; i <=30; i++) {
			if ((i % 3 == 0) && (i % 5 == 0))
				System.out.println("FIZZBUZZ");
			else if (i % 5 == 0)
				System.out.println("Buzz");
			else if (i % 3 == 0)
				System.out.println("FIZZ");
			else
				System.out.println(i);
		}

	}

}
