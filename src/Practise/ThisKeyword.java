package Practise;

public class ThisKeyword {
	
	int x,y;
	
	ThisKeyword(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	void display() {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		ThisKeyword th = new ThisKeyword(20,40);
		th.display();

	}

}
