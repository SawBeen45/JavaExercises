package Day5;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		// Program to remove special character
		
		
		String a = "%Sa12)kk23$h@jmlk! n0)*jkg";
		
		String result = "";
		
		for (int i = 0; i<a.length(); i++)
		{
			if (a.charAt(i)>64 && a.charAt(i)<=122)
				result = result + a.charAt(i);
		}
		System.out.println("String before removing Special characters: "+ a);
		System.out.println("String after removing Special characters: "+ result);

	}

}
