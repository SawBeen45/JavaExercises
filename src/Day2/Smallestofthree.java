package Day2;

public class Smallestofthree {

	public static void main(String[] args) {
		// smallest of three
		
		int a = 10, b = 5, c = 2;
		
		if (a<=b && a<=c) {
			System.out.println("The smallest is "+ a);
		}
		else if (b<=a && b<=c) {
			System.out.println("The smallest is "+b);
		}
		else {
			System.out.println("The smallest is "+c);
		}

	}

}
