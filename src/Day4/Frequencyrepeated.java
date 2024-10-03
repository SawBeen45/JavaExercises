package Day4;

public class Frequencyrepeated {

	public static void main(String[] args) {
		// Frequency of repeated number in an array;
		
		int[] a = {10,20,30,20,40,30};
		
		for (int i = 0; i<a.length-1; i++) {
			for (int j = i+1; j<a.length; j++) {
				if(a[i]==a[j] && (i != j)) {
					System.out.println(a[j] + " ");
				}
			}
		}

	}

}
