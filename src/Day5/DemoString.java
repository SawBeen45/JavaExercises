package Day5;

public class DemoString {

	public static void main(String[] args) {
		String s = "This is very important";
		
		//substring method
		
		String b = s.substring(1,5);
		System.out.println(b);
		
		//length() method
		

		System.out.println("The length of whole string is " + s.length());
		
		System.out.println();
		
		String s2 = "Subject";
		
		//concat() method
		
		System.out.println("The concatination of s and s2 is "+ s.concat(s2));
		System.out.println("The concatination of s and s2 is "+ s + ' '+ s2);
		
		//trim() method
		
		String s3 = "      Hello      ";
		System.out.println(s3.trim());
		
		//charAt() method
		
		System.out.println("The 7th character in String is "+ s.charAt(8));
		
		//contains() method
		
		System.out.println(s.contains("is"));
		
		//equals() and equalsIgnoreCase() method;
		
		String s4 = "Guitar";
		String s5 = "Guitar";
		
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
		System.out.println(s5.equals("guitar"));
		
		System.out.println(s5.equalsIgnoreCase("guitar"));
		
		//replace() method
		
		String s6 = "Welcome to Home";
		System.out.println(s6.replace('e', '#').replace('o', '@'));
		
		//Substring() method
		
		System.out.println(s.substring(4,10));
		
		//Uppercase() and Lowercase() method
		
		String s7 = "ChaRActERiSTiCs";
		String s8 = "ImPoRtANt";
		
		System.out.println(s7.toLowerCase());
		System.out.println(s8.toUpperCase());
		
		//Split() methods
		
		String s9 = "abc,jdfdfs,1234";
		String [] s10 = s9.split(",");
		System.out.println(s10[0]);
		System.out.println(s10[1]);
		System.out.println(s10[2]);
		
		//Split() method more examples
		
		String s11 = "Prem Bahadur Khadka";
		
		String [] s12 = s11.split(" ");
		System.out.println(s12[0]);
		
		// Other examples
		// to check john is the part of main string or not?
		
		String s13 = "John Keneddy";
		
		System.out.println(s13.toLowerCase().contains("john"));
		
		
		
		
		
		
		
		
		
				
				

	}

}
