package TYpeCasting;

public class Typecast_Concept {

	public static void main(String[] args) {
		// Type casting of primitive data-type
		
		
		// Upcasting - converting smaller to larger type
		//Eg: int --> long
		
		
		int a = 100;
		long value = a;
		System.out.println(value);
		
		float b = 10.5f;
		double dv = b;
		System.out.println(dv);
		
		
		
		// Downcasting --> Narrowing
		
		//Eg: long --> int
		
		double c = 234.34;
		float f = (float)c;
		System.out.println(f);
		
		
		long l = 1000000;
		int i = (int)l;
		System.out.println(i);
		
		
		

	}

}
