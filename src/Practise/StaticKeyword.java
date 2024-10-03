package Practise;

public class StaticKeyword {
	
	int a = 10;
	static int b = 20;
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		
	}
	void m1()
	{
		System.out.println("Hello");
	}
	
	static void m2()
	{
		System.out.println("Java");
	}

	public static void main(String[] args) {

		System.out.println(b);
		m2();
		
		StaticKeyword sk = new StaticKeyword();
		sk.display();
		sk.m1();
		
		
		
		

	}

}
