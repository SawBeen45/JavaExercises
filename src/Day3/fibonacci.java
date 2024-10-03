package Day3;

public class fibonacci {

	public static void main(String[] args) {
		// Fibonacci series
		int a = 0;
		int b = 1;
		int sum = 0;
		System.out.println(a +"\n"+b);
		
		for (int i = 3; i <= 10; i++) {
			sum = a + b;
			System.out.println(+sum);
			a = b;
			b = sum;
		}
		

	}

}
