package practice;

public class Parent {

	int x;
	int y;
	
	Parent()
	{
		System.out.println("hi.. i am parent constructor");
	}
	public Parent(int p,int  q)
	{
		this.x=p;
		this.y=q;
	}
	
	public static void main(String[] args) {
	 Parent p1= new Parent(20,30);
	 
	 p1.showDetails();
		
	}

	public void showDetails() {
		System.out.println(this.x + "\t" + this.y);
	}
}
