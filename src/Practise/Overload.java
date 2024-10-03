package Practise;

public class Overload {
	
	int a=3,b=3;
	
	void sum()
	{
		System.out.println(a+b);
	}
	
	void sum(int x, int y)
	{
		a = x;
		b = y;	
		System.out.println(x+y);
	}
	
	void sum(String p, String q)
	{
		System.out.println(p+q);
		
	}
	
	public static void main(String[] args) {
		Overload ov = new Overload();
		ov.sum();
		ov.sum(5,2);
		ov.sum("O","k");
		
	}

}
