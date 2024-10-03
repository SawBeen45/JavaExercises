package Day3;

public class Factorial {

	public static void main(String[] args) {
		//factorial
		
		int num = 5;
		int ans = 1;
		for(int i = num; i>=1; i--) {
			ans = ans * i;
		}
		System.out.println("The factorial is "+ ans);

	}

}
