package Exception_Handing;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		
		// Example1: Arithmetic Exception
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println(50/num);
		
		*/
		
		// If the 0 is given as an input then it will throw the Arithmetic Exception.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		try
		{
			System.out.println(50/num);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Invalid data...");
		}
		
		

	}

}
