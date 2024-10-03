package Day2;

public class Largestofthree {

	public static void main(String[] args) {
		
		// using if else ladder
		int a = 18, b = 18, c = 12;
		
		if (a >= b && a >= c){
			System.out.println("The greatest number is "+a);
		}
		else if (b >= a && b >= c){
			System.out.println("The greated number is "+b);
			
		}
		else {
			System.out.println("The greatest number is "+c);
		}
		
		//using nested if else
		
		
		int x = 100, y = 200 , z = 150;
		
		if (x>=y) {
			if (x>=z) {
				System.out.println("The greatest number is "+x);
			}
			else {
				System.out.println("The greatest nu,ber is "+z);
			}
		}
		else {
			if (y>=z) {
				System.out.println("The greatest is "+ y);
			}
			else {
				System.out.println("The greatest is "+ z);
			}

		}

	}

}
