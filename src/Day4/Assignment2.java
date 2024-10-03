package Day4;

public class Assignment2 {

	public static void main(String[] args) {
		// print even and odd from an array
		
		int [] a = {1, 2, 3, 4, 5, 6, 7, 45, 22, 11};
		int evencount = 0;
		int oddcount = 0;
		
		for (int i = 0; i<a.length; i++) {
			if (a[i]%2 == 0) 
				evencount++;
			else 
				oddcount++;
			
		}
		System.out.println("The even count is "+evencount);
		System.out.println("The odd count is "+oddcount);

	}

}
