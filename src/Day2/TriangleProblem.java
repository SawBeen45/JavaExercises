package Day2;

public class TriangleProblem {

	public static void main(String[] args) {
		// Program to check the type of triangle
		
		int a = 90, b = 30, c = 60;
		
		if ((a + b + c == 180) && a > 0 && b > 0 && c > 0 ) {
			
			if (a==b && a==c && b==c) 
				System.out.println("Equilateral triangle");
			
			if ( (a==b && b!=c) || (a==c && c!=b) || (b==c && c!=a)) 
				System.out.println("Isosceles Triangle");
			
			if (a!=b && a!=c && b!=c) 
				System.out.println("Scalene Trianle");
		}
			
		else 
			System.out.println("It is not Triangle");
			

	}

}
