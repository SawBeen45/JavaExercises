package Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ExampleForArraylist {

	public static void main(String[] args) {
		
		// Declaration
		
		ArrayList <String>mylist = new ArrayList<String>();
		mylist.add("Tim");
		mylist.add("Sabin");
		mylist.add("Shyam");
		mylist.add("Paru");
		mylist.add("100gh");
		mylist.add("Holland");
		System.out.println(mylist);
		
		// size of arraylist
		
		System.out.println(mylist.size());
		
		// Removing element from arraylist
		
		mylist.remove(4);
		System.out.println(mylist);
		
		
		// Inserting value in the middle of arraylist
		
		mylist.add(4,"Kogan");
		System.out.println(mylist);
		
		// modify the value
		
		mylist.set(5, "Charu");
		System.out.println(mylist);
		
		// Extracting value in Arraylist
		
		System.out.println(mylist.get(3));
		
		// Reading all elements from arraylist using normal loop
		
		for (int i = 0; i< mylist.size(); i++) {
			System.out.println(mylist.get(i));
		}
		System.out.println("......................");
		
		// Using enhanced for loop
		
		for (Object x: mylist) {
			System.out.println(x);
		}
		System.out.println("......................");
		
		//using iterator
		
		Iterator it = mylist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// to clear all
		
		mylist.clear();
		
		
		
		
		
		

	}

}
