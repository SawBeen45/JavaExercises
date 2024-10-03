package Day4;

public class MissingNUmber {

	public static void main(String[] args) {
		// finding missing number in a range of array;
		
		
		int[] a = {3,1,2,7,6,8,4};
		
		int n = a.length+1;
		
		int sum = (n * (n+1))/2;
		
		for (int i = 0; i<a.length; i++) {
			sum = sum - a[i];
			
		}
		System.out.println("The missing number is "+ sum);
	}

}
