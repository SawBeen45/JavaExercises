package Practise;

public class SortArray {

	public static void main(String[] args) {
		
		int a[] = {4, 1, 3, 2, 5};
		
		for (int i=0; i<a.length-1; i++)
		{
			if (a[i]>a[i+1])
			{
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
				
				i = -1;
			}
		}
		System.out.println("The sorted numbers are....");
		for(int x:a)
			System.out.println(x + " ");
			

	}

}
