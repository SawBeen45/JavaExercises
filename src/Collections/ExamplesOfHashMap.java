package Collections;
import java.util.HashMap;

public class ExamplesOfHashMap {

	public static void main(String[] args) {
		
		//Declaration
		
		HashMap hm = new HashMap();
		hm.put(101, "JOhn");
		hm.put(102, "Jack");
		hm.put(103, "Sita");
		hm.put(104, "Jack");
		
		
		//Finding size
		
		System.out.println(hm.size());
		
		// Accessing values
		
		System.out.println(hm.get(103));
		
		// getting all keys and values
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		//retrieving all values altogether
		
		System.out.println(hm.entrySet());
		
		//reading values from hashmap
		
		for (Object k: hm.keySet())
		{
			System.out.println(k + "   "+ hm.get(k));
		}
		
		
		
		

	}

}
