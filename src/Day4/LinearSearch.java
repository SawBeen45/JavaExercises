package Day4;

public class LinearSearch {

	public static void main(String[] args) {
		// Linear search
		
		int[] a = {1, 2, 3, 4, 5, 6};
		
		int search_element = 50;
		
		int flag = 0;
		
		
		for(int i = 0; i < a.length; i++) {
			if (a[i]==search_element)
			{
				System.out.println("The number is present");
				flag = 1;
				break;
			}
				
			
		
		
		}
		if (flag == 0)
			System.out.println("Number not found");


	}

}
