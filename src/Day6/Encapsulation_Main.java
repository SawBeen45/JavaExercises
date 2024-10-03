package Day6;

public class Encapsulation_Main {

	public static void main(String[] args) {
		Encapsulation_Example acc = new Encapsulation_Example();
		acc.setAccno(10001);
		System.out.println(acc.getAccno());
		
		acc.setName("Sabin");
		System.out.println(acc.getName());
		
		acc.setAmount(4000000);
		System.out.println(acc.getAmount());
		
		

	}

}
