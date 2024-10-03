package Day8;


class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
}


class XYZ extends ABC
{
	void m1(int a)
	{
		System.out.println(a+a);
	}
	
	void m2(int a, int b)
	{
		System.out.println(a+b);
	}
}

public class OverloadVSOverload {

	public static void main(String[] args) {
		
		XYZ obj = new XYZ();
		obj.m1(25);
		obj.m2(40);
		obj.m2(25, 35);
		

	}

}
