package Day4;

public class EnhancedForLopp {

	public static void main(String[] args) {
		// enhanced for loop for single dimensional array
		
		int [] a = {12,22,34,54,76,10};
		
		for(int x:a) {
			System.out.print(x + " ");
		}
		
		
		// enhanced for loop for two dimensional array
		
		int [][] b = {
				{12, 22, 30},
				{20, 38, 40},
				{4, 32, 78},
				{90, 100, 4}
		};
		
		for (int arr[]:b) {
			for(int x:arr) {
				System.out.print(x +" ");
			}
			System.out.println();
		}

	}

}
