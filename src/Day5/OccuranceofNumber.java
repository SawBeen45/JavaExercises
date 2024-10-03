package Day5;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OccuranceofNumber {

	public static void main(String[] args) {
		// Program to find the occurrence of characters
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		s = s.replace(" ", "");
		
		char arr[] = s.toCharArray();
		
		int  counter = 0;
		Map <Character, Integer>map = new TreeMap<>();
		
		for (int i = 0; i < arr.length; i++)
		{
			counter = 0;
			for (int j = 0; j <arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					counter++;
				}
			}
			map.put(arr[i], counter);
		}
		System.out.println(map);
		
	}

}
