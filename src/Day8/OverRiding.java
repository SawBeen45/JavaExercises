package Day8;


class Bank
{
	double roi()
	{
		return 0;
	}
}

class PRABHU extends Bank
{
	double roi()
	{
		return 6.7;
	}
}

class NABIL extends Bank
{
	double roi()
	{
		return 8.8;
	}
}

public class OverRiding {
	
	

	public static void main(String[] args) {
		Bank B = new Bank();
		System.out.println(B.roi());
		
		NABIL N = new NABIL();
		System.out.println(N.roi());
	
		

	}

}
