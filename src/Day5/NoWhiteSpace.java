package Day5;

import java.util.Scanner;

public class NoWhiteSpace {

	public static void main(String[] args) {
		// removing white-space
		
		String str = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		
		str = str.replace(" ", "");
		System.out.println(str);
		

	}

}
