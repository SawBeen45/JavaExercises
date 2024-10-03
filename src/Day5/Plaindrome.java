package Day5;

public class Plaindrome {

	public static void main(String[] args) {
		// to check a string is palindrome or not
		
		
		String a = "Radar";
		String result = "";
		
		for (int i = a.length()-1; i>=0; i--)
		{
			result = result + a.charAt(i);
		}
		System.out.println("The reversed string is "+ result);
		
		if(a.toLowerCase().equals(result.toLowerCase())) 
			System.out.println(a+ " is palindrome");
		else
		
			System.out.println(a + " is not palindrome");
		

	}

}
