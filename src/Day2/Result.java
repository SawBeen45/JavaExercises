package Day2;

public class Result {

	public static void main(String[] args) {
		int marks = 57;
		
		if (marks >= 75) {
			System.out.println("Distinction");
		}
		else if (marks >=60 && marks <75) {
			System.out.println("First Division");
		}
		else if (marks >=50 && marks <60) {
			System.out.println("Second Division");
		}
		else if (marks >=40 && marks < 50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
