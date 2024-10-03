package Day7;


class A{
	int a = 100;
	void display() {
		System.out.println(a);
	}
}

class B extends A{
	int b = 200;
	void print() {
		System.out.println(b);
	}
}

public class Inheritance {
	public static void main(String[] args) {
		B obj = new B();
		//System.out.println(obj.a);
		obj.display();
	}

}
