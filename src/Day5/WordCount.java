package Day5;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		// Count words in a string
		
		String str = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		
		String arr[] = str.split(" ");
		int count = 0;
		
		for(int i = 0; i<arr.length; i++)
		{
			count++;
		}
		System.out.println("The total count of words in the string is "+ count);
		
		

	}

}
