package Day5;

public class BufferAndBuilder {

	public static void main(String[] args) {
		
		// String-immutable
		
		String a = "Hello";
		a.concat("Everyone");
		System.out.println(a);  // Hello
		
		
		
		// StringBuffer - mutable
		
		StringBuffer b = new StringBuffer("Hello");
		b.append(" Everyone");  
		System.out.println(b);	//Hello Everyone
		
		
		//StringBuilder -mutable
		
		StringBuilder c = new StringBuilder("Hey");
		c.append(" Nancy");
		System.out.println(c);	//Hey Nancy
		

	}

}
