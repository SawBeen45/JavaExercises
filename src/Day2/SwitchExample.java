package Day2;

public class SwitchExample {

	public static void main(String[] args) {
		// Switch case for simple calculator
		
		int a = 10, b= 15, c;
		
		String operation = "Multiplication";
		
		switch(operation) {
		case("Add"): c = a + b;
		System.out.println("Addition: "+c);
		break;
		
		case("Subtraction"): c = a - b;
		System.out.println("Subtraction: "+c);
		break;
		
		case("Multiplication"): c = a * b;
		System.out.println("Multilication: "+c);
		break;
		
		case("Division"): c = a / b;
		System.out.println("Division: "+c);
		break;
		
		default:
			System.out.println("Invalid input");
		}

	}

}
