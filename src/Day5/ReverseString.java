package Day5;

public class ReverseString {

	public static void main(String[] args) {
		// Reversing a string
		
		//Approach 1
		
		String a = "Welcome";
		String result = "";
		
		for(int i = a.length()-1; i>=0; i--)
		{
			result = result + a.charAt(i);
			
		}
		System.out.println("The reversed string is: " +result );
		
		
		//Approach 2
		
		String s = "This is Java";
		
		String rev = " ";
		
		char c[] = s.toCharArray();
		
		for (int j = c.length-1; j >=0 ; j--)
		{
			rev = rev + c[j];
			
		}
		System.out.println("The reversed string is "+ rev);
		
		
		//Approach 3
		
		StringBuffer f = new StringBuffer("Hello everyone");
		System.out.println(f.reverse());
		

	}

}
