package practice;

public class Child extends Parent{

	int z;
		
	public Child(int p, int q,int r) {
		super(p,q);
		this.z = r;
	}

	public static void main(String[] args) {
		
		Child c1 = new Child(45,89,33);
		
		System.out.println(c1.x);
		System.out.println(c1.y);
		System.out.println(c1.z);
		
		c1.x=11;
		c1.z= 22;
		
		System.out.println("-----------------");
		showDetails(c1);
	}
	
	public static void showDetails(Child w)
	{
		System.out.println(w.x);
		System.out.println(w.y);
		System.out.println(w.z);
		 
	}

	
}
