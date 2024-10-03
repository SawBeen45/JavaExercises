package Day2;

public class Swapping {

	public static void main(String[] args) {
		
		//Using dummy variable
		int a = 5, b = 10;
		int dummy = a;
		a = b;
		b = dummy;
		
		System.out.println("The new value of a is "+ a);
		System.out.println("The new value of b is "+ b);
		
		//Using + and - operators
		
		int x = 16, y = 20;
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("The new value of x is "+ x);
		System.out.println("The new value of y is "+ y);
		
		//using * and / operators
		
		int p = 500, q = 1000;
		
		if (p==0) {
			q = 0;
			p = q;
		}
		else if (q==0) {
			p = 0;
			q = p;
		}
		else {
			p = p * q;
			q = p / q;
			p = p / q;
		}
		System.out.println("The new value of p is "+p);
		System.out.println("The new value of q is "+q);
		
		
		//using one line expression
		
		int i = 30, j = 50;
		
		i = (i * j)/(j = i);
		
		System.out.println("The new value of i is "+ i);
		System.out.println("The new value of j is "+ j);

				

	}

}
