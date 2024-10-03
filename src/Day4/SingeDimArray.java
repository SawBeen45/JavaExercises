package Day4;

public class SingeDimArray {

	public static void main(String[] args) {
		// Declaration and assignment of Array
		
		int[] a = {10,20,30,40};
		
		// finding length of array
		
		System.out.println("Size is "+a.length);
		
		//Reading specific value from an array
		
		System.out.println("second data in the array is "+a[1]);
		
		// Reading multiple data from an array
		
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		
		//enhanced for loop
		
		for (int x:a)
			System.out.println(x);

	}

}
