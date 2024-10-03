package Practise;

public class MethodTypesMain {

	public static void main(String[] args) {
		
		MethodTypes ty = new MethodTypes();
		
		// 1.
		
		ty.m1();
		
		// 2.
		
		String s = ty.m2();
		System.out.println(s);
		
		
		//3.
		
		MethodTypes ty3 = new MethodTypes();
		ty3.m3("John");
		
		// 4. 
		
		String str = ty3.m4("Nick");
		System.out.println(str);
		

	}

}
