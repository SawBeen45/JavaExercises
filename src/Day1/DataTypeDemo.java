package Day1;

public class DataTypeDemo {
		public static void main(String[] args) {
			
			// decimal value
			
			float item_price = 15.354f;
			double items = 345.345346;
			
			System.out.println("The item_price is $" + item_price);
			System.out.println("The price of item is $" + items);
			
			// Numerical value
			
			byte a = 10;
			short b = 234;
			int c = 12345;
			long d = 34567890;
			
			System.out.println("The value of a is "+a);
			System.out.println("The value of b is "+b);
			System.out.println("The value of c is "+c);
			System.out.println("The value of d is "+d);
			
			// char and string
			
			char ch = 'A';	//single quote and only single character
			String str1 = "A";	//double quote and can contain single or multiple character
			String str2 = "ABC";
			
			System.out.println(ch);
			System.out.println(str1);
			System.out.println(str2);
		}

}
