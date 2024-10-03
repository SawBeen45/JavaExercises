package Day8;

public class C2 extends C1 implements I1, I2 {
	public void m1()
	{
		System.out.println(x);
	}
	
	public void m2()
	{
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		C2 obj = new C2();
		obj.m1();
		obj.m2();
		obj.m3();
		

	}

}
