package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class Sortingwithoneforloop {

	public static void main(String[] args) {
		// Sorting with one for loop;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");

		int size = sc.nextInt();
		
		int [] a = new int[size];
		
		for (int i = 0; i<a.length;i++)
		{
			System.out.println("Enter the value for "+i+ " Position:");
			a[i] = sc.nextInt();
		}
		System.out.println("The elements before sorting are.....");
		for (int elements:a)
			System.out.print(elements + " ");
		
		//Sorting
		
		for (int j = 0; j<a.length-1;j++)
		{
			if(a[j] > a[j+1])
			{
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				
				j = -1;
				
			}
		}
		System.out.println("\n\nElements after sorting.....");
		for (int sorted:a)
			System.out.print(sorted + " ");
		
		
		

	}

}
