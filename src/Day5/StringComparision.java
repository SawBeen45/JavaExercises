package Day5;

public class StringComparision {

	public static void main(String[] args) {
		// String Comparison
		
		//Case 1
		
		String s = "Welcome";
		String s1 = "Welcome";
		
		System.out.println(s==s1);		//true
		System.out.println(s.equals(s1));	//true
		
		
		// Case 2
		
		String s2 = new String("Hello");
		String s3 = new String("Hello");
		
		System.out.println(s2==s3);			//false
		System.out.println(s2.equals(s3));	//true
		
				
		
		//Case 3
		
		String s4 = "abc";
		String s5 = new String("abc");
		
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
		
		//case 4
		
		String s6 = "abc";
		String s7 = new String("abc");
		String s8 = s7;
		
		System.out.println(s6==s7);			//false
		System.out.println(s6.equals(s7));	//true
		System.out.println(s7==s8);		//true
		System.out.println(s7.equals(s8));	//true

	}

}
