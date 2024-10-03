package Practise;

public class Encapsulation {
	
	private int sid;
	private String sname;
	private char grade;
	private int Marks;
	
	
	

	public int getSid() {
		return sid;
	}




	public void setSid(int sid) {
		this.sid = sid;
	}




	public String getSname() {
		return sname;
	}




	public void setSname(String sname) {
		this.sname = sname;
	}




	public char getGrade() {
		return grade;
	}




	public void setGrade(char grade) {
		this.grade = grade;
	}




	public int getMarks() {
		return Marks;
	}




	public void setMarks(int marks) {
		Marks = marks;
	}




	public static void main(String[] args) {
		Encapsulation En = new Encapsulation();
		En.setSid(101);
		En.setSname("Sabin");
		En.setGrade('A');
		En.setMarks(87);
		
		System.out.println(En.getSid());
		System.out.println(En.getSname());
		System.out.println(En.getMarks());
		System.out.println(En.getGrade());
		

	}

}
