package Day4;

import java.util.Scanner;

public class UsingScannerClass {

	public static void main(String[] args) {
		// User Scanner class
		
		
		int [ ] a = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i<a.length;i++)
		{
			System.out.println("Enter value for "+i+" Position:");
			a[i] = sc.nextInt();
		}
		System.out.println("Printing all values......");
		for(int x:a) {
			System.out.print(x + " " );
		}
		

	}


}
