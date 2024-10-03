package Day4;

public class Assignment1 {

	public static void main(String[] args) {
		// Sum of elements in array
		
		int[] a = {1,2,3,4,5};
		int sum = 0;
		
		for (int i = 0; i<=a.length-1; i++) {
			sum = sum + a[i];
		}
		System.out.println("The total sum is "+sum);

	}

}
