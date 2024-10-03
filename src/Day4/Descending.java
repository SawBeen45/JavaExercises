package Day4;

import java.util.Arrays;

public class Descending {

	public static void main(String[] args) {
		// Descending order
		
		int [] a = {2,6,3,8,0,2};
		
		
		Arrays.sort(a);
		
		System.out.println("Ascending Order.......");
		
		for(int x:a) {
			System.out.print(x + " ");
		}
		
		System.out.println("\nDescending order........");
		
		for (int i = a.length-1; i >= 0; --i) {
			System.out.print(a[i] + " ");
		}

	}

}
