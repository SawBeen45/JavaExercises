package Day6;

public class Overloading {
	
	int a = 10, b = 20;
	
	void sum()
	{
		System.out.println(a+b);
	}
	
	void sum(int x, int y)
	{
		System.out.println(x  + y);
	}
	
	void sum(String s, int z)
	{
		System.out.println(s+z);
	}
	
	void sum(int p, int q, int r)
	{
		System.out.println(p+q+r);
	}
	
	
	

}
