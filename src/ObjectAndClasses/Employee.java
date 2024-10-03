package ObjectAndClasses;

public class Employee {

		
		int id;
		String name;
		String job;
		int salary;
		
		void display()
		{
			System.out.println(id);
			System.out.println(name);
			System.out.println(job);
			System.out.println(salary);
		}
		
		
		public static void main(String[] args) {
			
			Employee emp1 = new Employee();
			emp1.id = 001;
			emp1.name = "Danny";
			emp1.job = "Developer";
			emp1.salary = 35000;
			emp1.display();
			
			Employee emp2 = new Employee();
			emp2.id = 002;
			emp2.name  = "Cory";
			emp2.job = "Tester";
			emp2.salary = 39000;
			emp2.display();
		

	}

}
