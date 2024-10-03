package Collections;
import java.util.HashSet;
import java.util.ArrayList;

public class ExampleforHashset {

	public static void main(String[] args) {
		
		//Declaration
		
		HashSet myset = new HashSet();
		myset.add(100);
		myset.add("Tim");
		myset.add(6.8);
		myset.add(6.8);
		
		System.out.println(myset);
		
		//Removing elements
		
		myset.remove(6.8);
		System.out.println(myset);
		
		// Inserting is not possible as there is no index
		
		// Accessing specific elements
		
		ArrayList al = new ArrayList(myset);
		System.out.println(al.get(1));
		
		//Reading all values
		
		for(Object x: myset)
		{
			System.out.println(x);
		}
		
				

	}

}
