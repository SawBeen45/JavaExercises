package Day8;

class Test1
{
	final int x = 10;
}

class Test2
{
	final void m()
	{
		System.out.println("This is final keyword method......");
	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		//t1.x = 200; //Error
		System.out.println(t1.x);
		
		Test2 t2 = new Test2();
		t2.m();
		
		

	}

}
