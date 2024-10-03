package Exception_Handing;

public class E2 {

	public static void main(String[] args) {
		// Number Format Exception
		
		try
		{
		
			String s = "Hello";
		
			int num = Integer.parseInt(s);
			System.out.println(num);
		}
		catch(Exception e)
		{
			System.out.println("Invalid data....");
			System.out.println(e.getMessage());
		}

	}

}
