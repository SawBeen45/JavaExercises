package Day4;

public class MultidimArrays {

	public static void main(String[] args) {
		// Declaring and assigning values in 2 dim arrays
		
		int [][] a = {
				{100, 200},
				{300, 400},
				{500, 600}
			};
		// finding size of array
		
		System.out.println("Length of rows is "+a.length);
		System.out.println("Length of column is "+a[0].length);
		
		
		// reading single value from an array
		
		System.out.println(a[2][1]);
		
		// reading all values from an array
		
		for (int i = 0; i<a.length;i++) {
			for (int j = 0; j<a[0].length; j++) {
				
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
	}
	

}
