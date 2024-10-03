package ObjectAndClasses;

public class StudentMain {

	public static void main(String[] args) {

		Student std1 = new Student();
		std1.sid = 101;
		std1.sname = "Sam";
		std1.grade = 'A';
		std1.marks = 89;
		std1.PrintData();
		
		
		Student std2 = new Student();
		std2.sid = 102;
		std2.sname = "Tom";
		std2.grade = 'B';
		std2.marks = 79;
		std2.PrintData();


	}

}
