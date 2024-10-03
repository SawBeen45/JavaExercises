package Day8;


interface shape
{
	int length = 10;
	int width = 5;
	
	void rectangle();
	
	default void square()
	{
		System.out.println("This is default method......");
	}
	
	static void triangle()
	{
		System.out.println("This is static method....");
	}
}



public class InterfaceDemo implements shape {
	public void rectangle()
	{
		System.out.println("This is abstract method from Interface.......");
	}
	

	public static void main(String[] args) {
		//scenario 1
		
		InterfaceDemo id = new InterfaceDemo();
		id.rectangle();
		id.square();
		shape.triangle();
		
		
		//Scenario 2
		
		shape sh = new InterfaceDemo();
		sh.rectangle();
		sh.square();
		shape.triangle();
		
		

	}

}
