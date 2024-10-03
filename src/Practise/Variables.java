package Practise;

public class Variables {
	
	
	int sid;
	String sname;
	int roll;
	char grad;
	
	void display()
	{
		System.out.println(sid +" "+ sname +" "+ roll+ " "+ grad);
	}
	
	/*
	
	void setdata(int id, String name, int rollno, char grade) {
		sid = id;
		sname = name;
		roll = rollno;
		grad = grade;
		
	}*/
	
	//for constructor
	
	
	Variables(int sid, String sname, int roll, char grad){
		this.sid = sid;
		this.sname = sname;
		this.roll = roll;
		this.grad = grad;
	}
	public static void main(String[] args) {
		
		// 1. Displaying through object reference variables
		/*
		
		Variables vr = new Variables();
		vr.sid = 101;
		vr.sname = "Tim";
		vr.roll = 3;
		vr.grad = 'A';
		vr.display();
		
		// 2. Displaying through methods
		
		Variables vr2 = new Variables();
		vr2.setdata(102, "Lisa", 2, 'B');
		vr2.display();
		*/
		
		// Using Constructor
		
		Variables vr3 = new Variables(103, "Jack",1,'A');
		vr3.display();
		
		
		
				
	}
	
	

}
